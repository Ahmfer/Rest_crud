package com.dittföretag.chatapp.controller;

import com.dittföretag.chatapp.entity.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dittföretag.chatapp.repository.ChannelRepository;

import java.util.List;

@RestController
@RequestMapping("/channels")
public class ChannelController {

    @Autowired
    private ChannelRepository channelRepository;

    // GET /channels
    @GetMapping
    public List<Channel> getAllChannels() {
        return channelRepository.findAll();
    }

    // POST /channels
    @PostMapping
    public Channel createChannel(@RequestBody Channel channel) {
        return channelRepository.save(channel);
    }

    // DELETE /channels/{id}
    @DeleteMapping("/{id}")
    public void deleteChannel(@PathVariable Long id) {
        channelRepository.deleteById(id);
    }

    // GET /channels/{id}
    @GetMapping("/{id}")
    public Channel getChannelById(@PathVariable Long id) {
        return channelRepository.findById(id).orElse(null);
    }
}
