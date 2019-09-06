package com.idwxy.clock.service.impl;

import com.idwxy.clock.common.ResultObject;
import com.idwxy.clock.service.ClockService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ClockServiceImpl implements ClockService {

    @Override
    public ResultObject getDiff(String firstDate, String lastDate) {

        // 封装对象
        ResultObject resultObject;

        // 设置解析格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 第一个日期
        Date formatFirstDate = null;
        // 第二个日期
        Date formatLastDate = null;

        try {
            // 注：dateFormat.parse(firstDate)，firstDate 是时间字符串，
            // 需要抛出 throws ParseException，才不会报 Unhandled exception:java.text.parseException 的错误，
            // 或者 try 捕捉 catch 错误
            // 解析参数
            formatFirstDate = dateFormat.parse(firstDate);
            formatLastDate = dateFormat.parse(lastDate);
        } catch (Exception e) {
            // 若有异常，直接返回失败
            resultObject = new ResultObject(0, "fail", "参数错误");
            return resultObject;
        }
        // 计算插值，单位为毫秒，所以需要 / （ 24 * 60 * 60 * 1000）
        long day = (formatFirstDate.getTime() - formatLastDate.getTime()) / (24 * 60 * 60 * 1000);
        resultObject = new ResultObject(day, "200", "成功");
        return resultObject;
    }
}
