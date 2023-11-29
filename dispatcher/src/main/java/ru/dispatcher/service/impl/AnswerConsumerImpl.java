package ru.dispatcher.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.dispatcher.service.AnswerConsumer;


public class AnswerConsumerImpl implements AnswerConsumer {
    @Override
    public void consume(SendMessage sendMessage) {

    }
}
