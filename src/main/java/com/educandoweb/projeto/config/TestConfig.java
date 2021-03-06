package com.educandoweb.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.projeto.entities.User;
import com.educandoweb.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "João", "joao@gmail.com", "88888", "123456");
		User u2 = new User(null, "Pedro", "pedro@gmail.com", "77777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	

}
