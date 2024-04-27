package com.example.RabbitMq.Listener;

import com.example.RabbitMq.Entity.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class QueueListener {
    @RabbitListener(queues = "${rmq.queue.name}")
    public void message(Message msg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(msg.toString());
    }

}
