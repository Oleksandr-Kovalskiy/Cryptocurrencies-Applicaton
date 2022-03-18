package com.example.cryptocurrencies.config;

import com.example.cryptocurrencies.service.CryptocurrencyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class CryptocurrencyServiceConfig {

    @Autowired
    private CryptocurrencyService cryptocurrencyService;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Scheduled(cron = "*/3 * * * * *") // Формат:  секунда, минута, час, день, месяц, день недели
    public void reportCurrentData() {
        cryptocurrencyService.updateCryptocurrenciesPrices();
    }
}
