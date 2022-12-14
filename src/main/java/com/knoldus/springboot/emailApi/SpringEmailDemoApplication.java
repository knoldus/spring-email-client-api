package com.knoldus.springboot.emailApi;

import com.knoldus.springboot.emailApi.service.EmailSenderService;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class SpringEmailDemoApplication {


		@Autowired
		private EmailSenderService senderService;
		public static void main(String[] args) {
			SpringApplication.run(SpringEmailDemoApplication.class, args);
		}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() throws MessagingException {
			senderService.sendSimpleEmail("shashikanttanti0213@gmail.com",
					"This is email body",
					"This is email subject");

  }
}
