package com.artemas.simplekafkademo.kafka

import com.artemas.simplekafkademo.domain.Artemas
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class TopicListener {
    val logger: Logger = LoggerFactory.getLogger(TopicListener::class.java)
    
    @KafkaListener(topics = ["artemas-topic"], groupId = "artemas-the-great")
    fun processMessage(message: ConsumerRecord<Artemas, String>) {
        logger.info("RECIEVED MESSAGE FROM ARTEMAS TOPIC: ${message.value()}")
    }
}