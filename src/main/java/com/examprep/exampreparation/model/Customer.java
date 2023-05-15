package com.examprep.exampreparation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity    // this adnotation will let Hibernate know that we want a SQL table that contains the exact attributes we defined bellow
@Table(name = "customer") // we can also tell the name we want for that table
@Data  // instead of @Getter and @Setter
@NoArgsConstructor
public class Customer {
    @Id   // adnotation that defines the PK for the SQL table
    @GeneratedValue // this means the PK will also get an AUTO_INCREMENT attribute too
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Customer(String name, String surname, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
}
