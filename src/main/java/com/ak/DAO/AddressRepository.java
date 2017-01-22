package com.ak.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.entity.Address;

@Transactional
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	

}
