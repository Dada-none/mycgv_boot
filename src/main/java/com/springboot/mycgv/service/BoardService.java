package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;

    public int insert(BoardDto boardDto){
        return boardMapper.insert(boardDto);
    }

    public BoardDto content(String bid){
        return boardMapper.content(bid);
    }

    public List<BoardDto> list(PageDto pageDto){
//        Map<String, String> param = new HashMap<String, String>();
//        param.put("start", "1");
//        param.put("end", "5");

        return boardMapper.list(pageDto);
    }
}
