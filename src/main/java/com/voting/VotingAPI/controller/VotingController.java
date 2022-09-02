package com.voting.VotingAPI.controller;

import com.voting.VotingAPI.model.Vote;
import com.voting.VotingAPI.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class VotingController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @PostMapping("/vote")
    public String voted(@RequestBody Vote vote) {
        rabbitMQSender.send(vote);
        return "Vote submitted";
    }

}
