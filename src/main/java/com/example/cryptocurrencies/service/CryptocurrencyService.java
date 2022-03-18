package com.example.cryptocurrencies.service;

import com.example.cryptocurrencies.client.CEXClient;
import com.example.cryptocurrencies.client.entities.CexCryptocurrency;
import com.example.cryptocurrencies.repository.CryptocurrencyRepository;
import com.example.cryptocurrencies.rest.entities.CryptocurrencyEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptocurrencyService {

    private final CryptocurrencyRepository repository;
    private final ModelMapper mapper;
    private CEXClient cexClient;

    @Autowired
    public CryptocurrencyService(CryptocurrencyRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        ...
    }

    public CryptocurrencyEntity save(CryptocurrencyEntity cryptocurrency) {
        repository.save();
    }


    void findAll() {
        repository.findAll();
    }


    void findOne() {
        repository.findOne();
    }


    void delete() {
        repository.delete();
    }

    public void updateCryptocurrenciesPrices() {
        List<CexCryptocurrency> cexCryptocurrencyList = cexClient.findAll();
        cexCryptocurrencyList.stream()
                .map(
                        c -> mapper(...)//Cryptocurrency
		 )
		.forEach(repository::save);
    }
