package com.banking.bank_app;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.banking.bank_app.Model.User;

import jakarta.validation.ConstraintViolation;

@SpringBootTest
class BankAppApplicationTests {

	@Test
	void contextLoads() {
	}

// 	@Test
// public void whenNotEmptyName_thenNoConstraintViolations() {
//     User user = new User("John");
//     Set<ConstraintViolation<User>> violations = validator.validate(user);
 
//     assertThat(violations.size()).isEqualTo(0);
// }
    
// @Test
// public void whenEmptyName_thenOneConstraintViolation() {
//     User user = new User("");
//     Set<ConstraintViolation<User>> violations = validator.validate(user);
 
//     assertThat(violations.size()).isEqualTo(1);
// }
    
// @Test
// public void whenNullName_thenOneConstraintViolation() {
//     User user = new User(null);
//     Set<ConstraintViolation<User>> violations = validator.validate(user);
 
//     assertThat(violations.size()).isEqualTo(1);
// }

}
