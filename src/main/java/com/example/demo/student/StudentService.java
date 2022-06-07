package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Ammar",
                        "ammar@gmail.com",
                        LocalDate.of(1997, Month.JANUARY, 4),
                        25
                )
        ) ;
    }
}
