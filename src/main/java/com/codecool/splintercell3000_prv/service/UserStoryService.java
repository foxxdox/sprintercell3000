package com.codecool.splintercell3000_prv.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserStoryService {
    private final List<UserStory> userStories = new ArrayList<>(List.of(
            new UserStory("US1", "Something different", "Make it red",
                    110, 1.5, UserStory.Status.IN_PROGRESS),
            new UserStory("UDE1", "Look for object", "Override it",
                    150, 2.5, UserStory.Status.DONE))
    );


    public List<UserStory> getUserStoriesList() {
        return userStories;
    }

    public void saveNewUserStory(UserStory userStory) {
        userStories.add(userStory);
    }

}
