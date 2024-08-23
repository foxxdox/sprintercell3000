package com.codecool.splintercell3000_prv.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserStory {

    private UUID id = UUID.randomUUID();
    private String title;
    private String description;
    private String acceptanceCriteria;
    private int businessValue;
    private double estimation;
    private Status status;

    // private int version;

    public enum Status {
        TODO, IN_PROGRESS, REVIEW, DONE
    }

    public UserStory(String title, String description, String acceptanceCriteria, int businessValue, double estimation, Status status) {
        this.title = title;
        this.description = description;
        this.acceptanceCriteria = acceptanceCriteria;
        this.businessValue = businessValue;
        this.estimation = estimation;
        this.status = status;
    }
}
