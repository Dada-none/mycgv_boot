package com.springboot.mycgv.dto;

import lombok.Data;

@Data
public class PageDto {
    //호출할때 사용
    private final String page;
    private final String serviceName;

    private int startCount;
    private int endCount;
    private int dbCount;
    private int pageSize;
    private int pageCount;
    private int reqPage;
}
