package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class LibraryManagementAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementAppApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception{
		/*Customer customer1 = new Customer("Anna", "Walczak", "a.walczak@email.pl");
		customerRepository.save(customer1);
		
		Customer customer2 = new Customer("Adam", "Kowalski", "adamkowalski1@email.pl");
		customerRepository.save(customer2);
		
		Customer customer3 = new Customer("Michał", "Testowy", "michalt@email.pl");
		customerRepository.save(customer3);*/
	}

}
