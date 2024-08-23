package com.codecool.splintercell3000_prv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserStoryController {

    @GetMapping("/")
    public String userStories(Model model) {
        List<UserStory> userStoriesList = List.of(
                new UserStory("US1", "Something different", "Make it red", 110, 1.5, UserStory.Status.IN_PROGRESS),
                new UserStory("UDE1", "Look for object", "Override it", 150, 2.5, UserStory.Status.DONE)
        );

        model.addAttribute("userStories", userStoriesList);
        return "index";
    }



}
