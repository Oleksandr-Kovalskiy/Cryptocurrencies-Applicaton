package com.example.cryptocurrencies.repository;

import com.example.cryptocurrencies.model.Cryptocurrency;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CryptocurrencyRepository extends MongoRepository<Cryptocurrency, String> {

}
