package com.springboot.music.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.music.model.User;
import com.springboot.music.repository.IUserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	IUserRepository userRepository;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsernameOrEmailOrPhone(username, username, username);
	    
	    if (user == null) {
	    	throw new UsernameNotFoundException("User not exists by Username" + username);
	    }

	    return UserDetailsImpl.build(user);
	}
}
