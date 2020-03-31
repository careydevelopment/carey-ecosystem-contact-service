package com.careydevelopment.contact.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.careydevelopment.contact.repository.ContactRepository;
import com.careydevelopment.global.model.Address;
import com.careydevelopment.global.model.AddressType;
import com.careydevelopment.global.model.CustomerContact;
import com.careydevelopment.global.model.Phone;
import com.careydevelopment.global.model.PhoneType;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ApplicationReadyEvent>  {
	
    private static final Logger logger = LoggerFactory.getLogger(ApplicationListenerInitialize.class);
 
    @Autowired
    ContactRepository repository;
    
    @Autowired
    PasswordEncoder encoder;
    
    public void onApplicationEvent(ApplicationReadyEvent event) {
    	List<Phone> phones = new ArrayList<Phone>();
    	Phone phone1 = new Phone();
    	phone1.setPhone("919-555-1212");
    	phone1.setPhoneType(PhoneType.HOME);
    	
    	Phone phone2 = new Phone();
    	phone2.setPhone("919-906-0606");
    	phone2.setPhoneType(PhoneType.CELL);

    	phones.add(phone1);
    	phones.add(phone2);
    	
    	List<Address> addresses = new ArrayList<Address>();
    	Address address = new Address();
    	address.setAddressType(AddressType.HOME);
    	address.setCity("Wake Forest");
    	address.setState("NC");
    	address.setStreet1("1313 Mockingbird");
    	address.setZip("27587");
    	
    	addresses.add(address);
    	
    	CustomerContact contact = new CustomerContact();
    	contact.setAddresses(addresses);
    	contact.setEmail("joe@xyz.com");
    	contact.setFirstName("Joey");
    	contact.setLastName("LastName");
    	contact.setPhones(phones);
    
    	repository.save(contact);
    	
//    	List<String> authorities = new ArrayList<String>();
//    	authorities.add("BIXIS_USER");    	
//    	
//    	User user = new User();
//    	user.setAuthorityNames(authorities);
//    	user.setCity("Raleigh");
//    	user.setEmail("jane@gmail.com");
//    	user.setPhoneNumber("919-555-1212");
//    	user.setState("NC");
//    	user.setStreet1("123 Main St.");
//    	user.setZip("27555");
//    	user.setFirstName("Jane");
//    	user.setLastName("Barrage");
//    	user.setPassword(encoder.encode("mimmy"));
//    	user.setUsername("jane");

//    	User user = repository.findByUsername("jane");
//    	System.err.println("user is " + user);
//    	repository.insert(user);
    }
}
