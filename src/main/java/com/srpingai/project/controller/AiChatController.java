package com.srpingai.project.controller;

import com.srpingai.project.service.AiChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiChatController {

    private AiChatService chatService;

    @GetMapping("/chat-data")
    public ResponseEntity<String> getData(@RequestParam("query") String query){
        return ResponseEntity.ok(chatService.fetchData(query));
    }
}
