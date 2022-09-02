package com.voting.VotingAPI.model;


public class Vote {
    private Long pollId;
    private Long choiceId;

    public Vote() {
    }

    public Vote(Long pollId, Long choiceId) {
        this.pollId = pollId;
        this.choiceId = choiceId;
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}
