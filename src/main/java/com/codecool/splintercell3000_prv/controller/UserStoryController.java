package com.codecool.splintercell3000_prv.controller;

import com.codecool.splintercell3000_prv.service.UserStory;
import com.codecool.splintercell3000_prv.service.UserStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserStoryController {

    private final UserStoryService userStoryService;

    @Autowired
    public UserStoryController(UserStoryService userStoryService) {
        this.userStoryService = userStoryService;
    }

    @GetMapping("/")
    public String userStories(Model model) {
        List<UserStory> userStoriesList = userStoryService.getUserStoriesList();

        model.addAttribute("userStories", userStoriesList);
        return "index";
    }

}
