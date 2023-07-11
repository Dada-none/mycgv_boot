package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.BoardDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.UUID;

@Service
public class FileUploadService {
    /*
     * fileSave 기능 - 파일이 존재하면 서버에 저장하는 메소드
     * */
    public void fileSave(BoardDto boardDto) throws Exception {
        //파일의 저장 위치
        String projectPath = System.getProperty("user.dir")+"\\src\\main\\resources\\static\\upload\\"; //user.dir -> 경로가 mycgv까지 온거야
        System.out.println("path ===> " + projectPath);

        //파일이 존재하면 서버에 저장
        if(boardDto.getFile1().getOriginalFilename() != null && !boardDto.getFile1().getOriginalFilename().equals("")) {
            //System.out.println("save file -->" + boardDto.getBfile());
            File saveFile = new File(projectPath + boardDto.getBsfile());
            boardDto.getFile1().transferTo(saveFile);
        }
    }

    /*
     * fileCheck 기능 - 파일이 존재하면 boardVo에 bfile, bsfile set!
     * 				     없으면 boardVo 리턴
     * */
    //글쓰기 폼 --> Controller(BoardVo) --> fileService.fileCheck(BoardVo)
    //								 <--
    //파일 있는지 없는지 체크하는 기능
    public Object fileCheck(BoardDto boardDto) {
        if(boardDto.getFile1().getOriginalFilename() != null
                && !boardDto.getFile1().getOriginalFilename().equals("")) { //파일이 존재하면
            //bsfile 파일 중복 처리

            //bfile, bsfile 파일명 생성
            UUID uuid = UUID.randomUUID();
            String bfile = boardDto.getFile1().getOriginalFilename();
            String bsfile = uuid + "_" + bfile;
            boardDto.setBfile(bfile);
            boardDto.setBsfile(bsfile);
        }
        else {
            System.out.println("파일 없음");
//			boardVo.setBfile(""); //또는 null값을 받을 가능성이 있으면 #{bfile, jdbcType=VARCHAR}처리 해줘
//			boardVo.setBsfile("");
        }

        return boardDto;
    }
}
