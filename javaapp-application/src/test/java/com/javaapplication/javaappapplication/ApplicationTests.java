package com.javaapplication.javaappapplication;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.jupiter.api.Test;

import java.util.Properties;

public class ApplicationTests {
    @Test
    public void FirstTest()
    {
        System.out.println("test");
    }
    @Test
    public void KafkaProducerTest(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(properties);
        producer.send(new ProducerRecord<String, String>("test_topic", "key", "value1"));

        producer.close();
    }
}
