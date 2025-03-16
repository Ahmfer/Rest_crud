package com.dittföretag.chatapp.repository;

import com.dittföretag.chatapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByChannelId(Long channelId);
}
