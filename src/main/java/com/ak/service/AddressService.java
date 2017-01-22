package com.ak.service;

import java.util.Collection;

import com.ak.entity.Address;

public interface AddressService {
	

		Collection <Address> getAllAddress();
		Address getAddressById(Long id);
		void deleteAddressById(Long id);
		void addAddress(Address address);
		void updateAddress(Address address);

}
