package com.example.RabbitMq.Controller;


import com.example.RabbitMq.Entity.Message;
import com.example.RabbitMq.Service.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {

    @Autowired
    MessageProducerService messageProducerService;
    @PostMapping("/sendMessage")
        public String sendMessage(@RequestBody Message message){
            messageProducerService.sendMessage(message);
            return "Message Sent to MQ !";
    }
}
