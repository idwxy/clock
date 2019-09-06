package com.idwxy.clock.controller;

import com.idwxy.clock.common.ResultObject;
import com.idwxy.clock.service.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clock")
public class ClockController {

    @Autowired
    ClockService clockService;

    @RequestMapping(value = "/get/{firstDate}/{lastDate}", method = RequestMethod.GET)
    public ResultObject getClock(@PathVariable String firstDate, @PathVariable String lastDate) {
        ResultObject resultObject = clockService.getDiff(firstDate, lastDate);
        return resultObject;
    }
}
