package com.ak.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.DAO.AddressRepository;
import com.ak.entity.Address;

@Service
public class AddressServiceImpl implements AddressService{

	
	@Autowired 
	private AddressRepository addressRepository;
	
	@Override
	public Collection<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public Address getAddressById(Long id) {
		return addressRepository.findOne(id);
	}

	@Override
	public void deleteAddressById(Long id) {
		addressRepository.delete(id);
	}

	@Override
	public void addAddress(Address address) {
	addressRepository.save(address);
		
	}

	@Override
	public void updateAddress(Address address) {
		addressRepository.save(address);
		
	}
	
}
