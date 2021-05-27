package com.cg.cs.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.cs.entities.Customer;

@Service
public interface ICustomerService {
	void addCustomer(Customer customer);
	List<Customer> fetchAll();
	void delCustomer(int id);
	void updateCustomer(Customer customer);
	Customer fetchById(int id);

}
