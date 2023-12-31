package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.repository.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    public NoticeDto content(String nid){
        return noticeMapper.content(nid);
    }
    public List<NoticeDto> list(PageDto pageDto){
//        Map<String, String> param = new HashMap<String, String>();
//        param.put("start", "1");
//        param.put("end", "5");

        return noticeMapper.list(pageDto);
    }
}
