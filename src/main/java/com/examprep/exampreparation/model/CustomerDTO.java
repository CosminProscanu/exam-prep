package com.examprep.exampreparation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor   // we use those adnotations for eliminating boiler plate code such as getters, setters, constructors
public class CustomerDTO {   /// ! TAKE CARE of the attribute names
    // This class is a DTO -Data Transfer Object - it will only help us get the info from the endpoint
                private String customerName;
                private String customerSurname;
                private String email;
                private String phone;
                private String city;
                private String street;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
