package com.examprep.exampreparation.controllers;

import com.examprep.exampreparation.model.Address;
import com.examprep.exampreparation.model.Customer;
import com.examprep.exampreparation.model.CustomerDTO;
import com.examprep.exampreparation.repositories.AddressRepository;
import com.examprep.exampreparation.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/saveClient")
    public String saveClient(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
        // we take the information from the DTO and we drop it on the entities.
        // customer entity that gets 4 attribute values from custoemrDTO (name...)
        Customer customer = new Customer(customerDTO.getCustomerName(), customerDTO.getCustomerSurname(),
                                         customerDTO.getPhone(), customerDTO.getEmail());
        //address entity that gets 2 attribute values from customerDTO (city, street)
        Address address = new Address(customerDTO.getCity(), customerDTO.getStreet());

        // persist the information to  the DB
        customerRepository.save(customer);
        addressRepository.save(address);
        return "client saved";
    }

    // we want to retrieve the info from the DB and then if we have a customer with the name john,
    // we will change his email addresss

    @GetMapping("/changeJohnEmail")
    public void changeJohnEmail(){
       // we want to get all customers from the DB
        List<Customer> customerList = customerRepository.findAll();

        //we filter the customers based on name = "John"
        List<Customer> customerListJohns = customerList.stream()
                                         .filter(customer->customer.getName().equals("John")).collect(Collectors.toList());

       // we modified the email address of all users with name John
        //we save again in the DB
        customerListJohns.forEach(customer -> {customer.setEmail("No longer interested in this customer");
                                                customerRepository.save(customer);});
    }

}
