package com.example.RabbitMq.Service;


import com.example.RabbitMq.Config.QueueConfig;
import com.example.RabbitMq.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
@Service
public class MessageProducerService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rmq.routing.key}")
    private String routingName;
    @Value("${rmq.exchange.name}")
    private String exchangeName;

    public void sendMessage(Message message){
        rabbitTemplate.convertAndSend(exchangeName,routingName,message);
    }
}
