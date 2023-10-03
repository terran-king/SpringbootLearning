package com.example.SpringbootLearning.student;

import jakarta.persistence.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student("Mariam", "mariam@gmail.com", LocalDate.of(2000, Month.AUGUST, 5));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(1998, Month.APRIL, 5));

            repository.saveAll(List.of(mariam, alex));
        };

    }
}
