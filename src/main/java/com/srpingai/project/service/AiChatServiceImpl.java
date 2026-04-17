package com.srpingai.project.service;

import org.springframework.ai.chat.client.ChatClient;

public class AiChatServiceImpl implements AiChatService {

    private ChatClient chatClient;

    @Override
    public String fetchData(String query) {
        return this.chatClient.prompt()
                .system(system -> system.text("You are an Expert!!"))
                .user(user -> user.text(query))
                .call()
                .content();
    }
}
