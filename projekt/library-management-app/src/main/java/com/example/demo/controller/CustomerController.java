package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public String listCustomers(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "customers";
	}
	
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "create_customer";
	}
	
	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "edit_customer";
	}
	
	@PostMapping("/customers/{id}")
	public String updateCustomer(@PathVariable Long id, 
			@ModelAttribute("customer") Customer customer,
			Model model
			) {
		Customer existingCustomer = customerService.getCustomerById(id);
		existingCustomer.setId(id);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setEmail(customer.getEmail());
		
		customerService.updateCustomer(existingCustomer);
		return "redirect:/customers";
	}
}
