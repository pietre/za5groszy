package com.za5groszy.application;

import com.za5groszy.application.configs.websocket.WebSocketConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import javax.annotation.PostConstruct;

public class UserContextController {
    @Autowired
    protected SimpMessagingTemplate template;

    @PostConstruct
    private void init() {
        template.setUserDestinationPrefix(WebSocketConfig.USER_TOPIC_PATH);
    }
}
