package com.testing.coyntryaddress.dao;

import org.springframework.data.repository.CrudRepository;

import com.testing.coyntryaddress.model.Address;

public interface AddressRepository extends CrudRepository<Address, String> {

}
