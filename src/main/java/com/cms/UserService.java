package com.cms;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserService implements UserDetailsService {
	
/*	@Autowired
	private UserRepository userRepository;*/

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User u = new User();
		
		
		return u;
	}
}
