package com.telegrambot.Service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class BotService extends TelegramLongPollingBot  {
    
    @Override
    public String getBotUsername() {
        return "Nada importante msj";
    }
  
    @Override
    public String getBotToken() {
        String token = "6649188676:AAE1l1U5wWTD3f-nmgRkIKDxdcpSRClGMMM";
        return token;
    }
  
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
        return;
    }
  

}
