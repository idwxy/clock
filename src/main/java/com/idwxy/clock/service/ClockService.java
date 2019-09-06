package com.idwxy.clock.service;

import com.idwxy.clock.common.ResultObject;

// service 接口
public interface ClockService {

    /**
     * 获取两个日期
     * @param firstDate 第一个日期
     * @param lastDate  第二个日期
     * @return  响应结果
     */
    public ResultObject getDiff(String firstDate, String lastDate);
}
