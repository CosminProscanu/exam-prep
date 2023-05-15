package com.examprep.exampreparation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamPreparationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamPreparationApplication.class, args);
    }


//    1. We will add a form (HTML form) - Register client:
//                name
//                surname
//                emailAddress
//                phoneNumber   custom validation: -10 numbers long, you can't introduce letters
//                city
//                street
}
