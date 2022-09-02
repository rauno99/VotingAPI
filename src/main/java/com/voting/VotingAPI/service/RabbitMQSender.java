package com.voting.VotingAPI.service;

import com.voting.VotingAPI.model.Vote;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    private final String EXCHANGE = "voting_exchange";
    private final String ROUTING_KEY = "routing_key";

    public void send(Vote vote) {
        amqpTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, vote);

    }
}
