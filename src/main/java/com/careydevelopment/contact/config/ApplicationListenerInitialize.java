package com.careydevelopment.contact.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.careydevelopment.global.repository.ContactRepository;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ContextRefreshedEvent>  {
	
    private static final Logger logger = LoggerFactory.getLogger(ApplicationListenerInitialize.class);
 
    @Autowired
    ContactRepository contactRepository;
    
//    @Autowired
//    CountryRepository countryRepository;
//
//    @Autowired
//    StateRepository stateRepository;

    
    public void onApplicationEvent(ContextRefreshedEvent event) {
//    	List<Country> countries = CountryCodeUtil.getCountriesFromFile();
//    	countryRepository.saveAll(countries);

//    	System.err.println("About to save all");
//    	List<State> states = StateCodeUtil.getStatesFromFile();
//    	stateRepository.saveAll(states);
    	
//    	List<Phone> phones = new ArrayList<Phone>();
//    	Phone phone1 = new Phone();
//    	phone1.setPhone("919-555-1212");
//    	phone1.setPhoneType(PhoneType.HOME);
//    	
//    	Phone phone2 = new Phone();
//    	phone2.setPhone("919-906-0606");
//    	phone2.setPhoneType(PhoneType.CELL);
//
//    	phones.add(phone1);
//    	phones.add(phone2);
//    	
//    	List<Address> addresses = new ArrayList<Address>();
//    	Address address = new Address();
//    	address.setAddressType(AddressType.HOME);
//    	address.setCity("Wake Forest");
//    	address.setState("NC");
//    	address.setStreet1("1315 Mockingbird");
//    	address.setZip("27587");
//    	
//    	addresses.add(address);
//    	
//    	CustomerContact contact = new CustomerContact();
//    	contact.setAddresses(addresses);
//    	contact.setEmail("linny@gmail.com");
//    	contact.setFirstName("Linny");
//    	contact.setLastName("Aqua");
//    	contact.setPhones(phones);
 
//    	CustomerContact contacts = repository.findByEmail("joe@xyz.com");
//    	System.err.println("contact  is " + contacts);
//    	repository.insert(contact);
    }
}
