package com.example.courseworkmailer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class RabbitMqListener {
    Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);

    @RabbitListener(queues = "mainQueue")
    public void listen(String message) {
        logger.info("Received message: {}", message);
    }
}
