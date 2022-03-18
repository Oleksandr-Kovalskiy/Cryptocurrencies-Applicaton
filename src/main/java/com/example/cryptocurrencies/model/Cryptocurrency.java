package com.example.cryptocurrencies.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Cryptocurrency {
    @Id
    private String id;
    private Double price;
    private String name;
    private LocalDateTime date;
}
