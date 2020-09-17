package com.testing.coyntryaddress.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.coyntryaddress.exception.ResourceNotFoundException;
import com.testing.coyntryaddress.model.Address;
import com.testing.coyntryaddress.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@GetMapping
	public List<Address> getAllAddress() {
		return addressService.getAllAddress();
	}

	@GetMapping("{countryCode}")
	public ResponseEntity<Object> getEnrollee(@PathVariable String countryCode) {
		Address address = addressService.getAddress(countryCode);

		if (address != null) {
			return ResponseEntity.ok(address);
		} else {
			throw new ResourceNotFoundException("No Address found for Given Country Code : " + countryCode);
		}
	}

}
