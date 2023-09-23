package com.telegrambot.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.telegrambot.Service.BotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/BotService")
public class BotController {

    @Autowired
    private BotService botService;

    public BotController(){
        System.out.println("Controller inicializado");
    }

    @GetMapping(value = "/hola")
    public String getBotToken(){
        String token = this.botService.getBotToken();
        return token;
    }
}
