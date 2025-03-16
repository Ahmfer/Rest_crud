package com.dittföretag.chatapp.repository;

import com.dittföretag.chatapp.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
