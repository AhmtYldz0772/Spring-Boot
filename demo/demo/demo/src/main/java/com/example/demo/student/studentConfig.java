package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return  args ->{
            Student ahmet = new Student(
                    1L,
                    "Ahmet",
                    "yildiz@gmail.com",
                    LocalDate.of(2000, Month.APRIL,5)
            );
            Student mehmet = new Student(
                    1L,
                    "mehmet",
                    "mehmet@gmail.com",
                    LocalDate.of(1998, Month.APRIL,5)
            );
            repository.saveAll(
                    List.of(ahmet,mehmet)
            );
        };

    }
}
