package com.project.demo.end_to_end;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
    @Bean
    public NewTopic createLikeTopic(){
        return TopicBuilder.name("user_likes").build();
    }
    @Bean
    public NewTopic createCommentsTopic(){
        return TopicBuilder.name("user_comments").build();
    }
    @Bean
    public NewTopic createVideoUploads(){
        return TopicBuilder.name("video_uploads").build();
    }
    @Bean
    public NewTopic createGenreUpdatesTopic(){
        return TopicBuilder.name("genre_updates").build();
    }
}
