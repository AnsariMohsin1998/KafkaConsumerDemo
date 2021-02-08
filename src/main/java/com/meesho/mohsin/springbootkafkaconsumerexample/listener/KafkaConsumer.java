package com.meesho.mohsin.springbootkafkaconsumerexample.listener;

import com.meesho.mohsin.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics =  "Kafka_Example", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumer message : "+message);
    }

    @KafkaListener(topics = "Kafka_Example_2", groupId = "group_json",containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user){
        System.out.println("Consumer Json message : "+user);
    }
}