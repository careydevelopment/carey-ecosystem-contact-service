package com.careydevelopment.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.careydevelopment.contact.repository.UserRepository;
import com.careydevelopment.global.model.User;



@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);

		if (user != null) {			
			//System.err.println("Found user is " + user);
			return user;
		} else {
			System.err.println("It's null - let's try by email");
			user = userRepository.findByEmail(username);
			
			if (user != null) {
				return user;
			} else {
				throw new UsernameNotFoundException("User not found with username: " + username);				
			}
		}
	}
	
	
//	private List<GrantedAuthority> getAuthorities (User user) {
//		List<GrantedAuthority> list = user.getAuthorities()
//												.stream()
//												.map(auth -> new SimpleGrantedAuthority(auth))
//												.collect(Collectors.toList());
//
//		return list;
//	}
	
}
