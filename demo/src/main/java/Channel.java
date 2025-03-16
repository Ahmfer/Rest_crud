package com.dittföretag.chatapp.entity;

// Viktig import för JPA

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL)
    private List<com.dittföretag.chatapp.entity.Message> messages;

    // Getters och setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.dittföretag.chatapp.entity.Message> getMessages() {
        return messages;
    }

    public void setMessages(List<com.dittföretag.chatapp.entity.Message> messages) {
        this.messages = messages;
    }
}
