package com.example.demo;
import  com.example.demo.Subscriber;
import com.example.demo.SubscriberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class H2demoApplication {
    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SubscriberRepository repository) {
        return args -> {
            repository.save(new Subscriber("Dan", "Vega", "danvega@gmail.com"));
        };
    }
}
