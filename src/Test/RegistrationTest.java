package Test;
import Main.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegistrationTest {

	@Test
	void it_should_register() {
		UserFactory factory=new UserFactory();
		UserDTO user1 = factory.createCorrectUser();
		Assertions.assertEquals("Main.Registration successful", Registration.registrateUser(user1).getResult());
	}
	@Test
	void it_should_not_register_weak_emptyUser(){
		UserFactory factory=new UserFactory();
		UserDTO user2 = factory.createEmptyUser();
		Assertions.assertEquals("a mandatory field is empty", Registration.registrateUser(user2).getResult());
	}
	@Test
	void it_should_not_register_weak_weak_password(){
		UserFactory factory=new UserFactory();
		UserDTO user3 = factory.createUserWeakPassowrd();
		Assertions.assertEquals("the password you chose is not secure (weak)", Registration.registrateUser(user3).getResult());
	}
	@Test
	void it_should_not_register_weak_wrong_email(){
		UserFactory factory=new UserFactory();
		UserDTO user4 = factory.createUserWrongEmail();
		Assertions.assertEquals("Email address must contain @", Registration.registrateUser(user4).getResult());
	}
	@Test
	void it_should_not_register_weak_wrong_phone(){
		UserFactory factory=new UserFactory();
		UserDTO user5 = factory.createUserWrongPhone();
		Assertions.assertEquals("The phone number must start with german prefix (+49)", Registration.registrateUser(user5).getResult());
	}

}
