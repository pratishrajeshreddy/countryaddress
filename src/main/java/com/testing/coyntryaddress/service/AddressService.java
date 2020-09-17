package com.testing.coyntryaddress.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.coyntryaddress.dao.AddressRepository;
import com.testing.coyntryaddress.model.Address;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	
	
	
	public Address getAddress(String countryCode) {
		return addressRepository.findById(countryCode).orElse(null);
	}
	
	public List<Address> getAllAddress() {
		return StreamSupport.stream(addressRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	
	

	
	

	

}
