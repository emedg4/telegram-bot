package com.telegrambot.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.telegrambot.Service.BotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BotController {

    @Autowired
    private BotService botService;

    public BotController(){

    }

    @GetMapping(value = "/")
    public String getBotToken(){
        String token = this.botService.getBotToken();
        return token;
    }
}
