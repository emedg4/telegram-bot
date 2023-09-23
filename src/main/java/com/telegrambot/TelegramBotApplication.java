package com.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.telegrambot.Service.BotService;

@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args) throws TelegramApiException {
		TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
		System.out.println("Empezo el flujo en la linea 116 del main");

		try {
			botsApi.registerBot(new BotService());

		} catch (Exception e) {
			System.out.println(e);
		}
		SpringApplication.run(TelegramBotApplication.class, args);
	}

}
