package com.mafiamadness.mafiagame.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping("/chat")
    public String chatPage() {
        return "Welcome to the Mafia Game Chatroom!";
    }
}
