package com.db.owm.messageHandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

    @GetMapping("api")
    public String sendResponse()
    {
        return "Api works";
    }
}
