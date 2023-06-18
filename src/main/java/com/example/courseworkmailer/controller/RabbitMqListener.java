package com.example.courseworkmailer.controller;

import com.example.courseworkmailer.service.MailService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@EnableRabbit
@Component
public class RabbitMqListener {
    MailService mail;

    @RabbitListener(queues = "mainQueue")
    public void listen(String message) {
        Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);
        logger.info("Received message: {}", message);
        //TODO: receiver email receiving;
        mail.sendSimpleMessage("dabikis2855@gmail.com", "Coursework Application", message);
    }
}
