package com.example.cryptocurrencies.repository;

import com.example.cryptocurrencies.config.MongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MongoConfig.class, CryptocurrencyRepository.class})
class CryptocurrencyRepositoryTest {
    /*
     * - Docker: https://www.youtube.com/watch?v=3c-iBn73dDE&t=2s
     * for start: docker run, docker compose, image, container, envs
     * - Test containers: test containers for mongo
     * */

    @Autowired
    private CryptocurrencyRepository repository;

//	@Test
//	void save() {
//		repository.save();
//	}
//
//	@Test
//	void findAll() {
//		repository.findAll();
//	}
//
//	@Test
//	void findOne() {
//		repository.findOne();
//	}
//
//	@Test
//	void delete() {
//		repository.delete();
//	}
}