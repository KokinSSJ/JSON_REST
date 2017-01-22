package com.ak.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Address;
import com.ak.entity.Student;
import com.ak.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Address> getAllAddress(){
		System.out.println("GET");
		return addressService.getAllAddress();
	}
	
	//http://127.0.0.1/students?id=1
	//read
	@RequestMapping(method=RequestMethod.GET, value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Address getAddressById(@PathVariable Long id){
		System.out.println("GET - id " + id);
		return addressService.getAddressById(id);
	}
	
	//delete
	@RequestMapping(method=RequestMethod.DELETE, value ="/{id}")
	public void deleteAddressById(@PathVariable Long id){
		System.out.println("DELETE - id " + id);
		addressService.deleteAddressById(id);;
	}
	
	//add, create
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addAddress(@RequestBody Address address){
		System.out.println("POST");
		addressService.addAddress(address);;
	}
	
	//update
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAddress(@RequestBody Address address) {
		System.out.println("PUT");
		addressService.updateAddress(address);;
		
	}

}
