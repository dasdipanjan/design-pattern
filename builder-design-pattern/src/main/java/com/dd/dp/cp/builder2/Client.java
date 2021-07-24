package com.dd.dp.cp.builder2;

import java.time.Instant;
import java.time.ZoneId;

import com.dd.dp.cp.builder.Address;
import com.dd.dp.cp.builder.User;
import com.dd.dp.cp.builder2.UserDTO.UserDTOBuilder;
import com.github.javafaker.Faker;

/**
 * This class is like a director class who is using build implementation to build {@link UserWebDTO} object.
 * 
 * @author DIPANJAN DAS
 *
 * Main intension is to use builder pattern to create immutable object of a complex class.
 */
public class Client {

	/**
	 * Main method. Starting point of the program.
	 * 
	 * @param args {@link String} array.
	 */
	public static void main(String[] args) {
		User user = createUser();
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);
	}
	
	/**
	 * This is a director method who will called all builder related methods through method chaining.
	 * At the end build method will be called to assemble the object.
	 * 
	 * @return {@link UserDTO} instance.
	 */
	public static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
					.withLastName(user.getLastName())
					.withAddress(user.getAddress())
					.withBirthday(user.getBirthday()).build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		Faker faker = new Faker();
		User user = new User();
		user.setBirthday(Instant.ofEpochMilli(faker.date().birthday(20, 70)
				.getTime()).atZone(ZoneId.systemDefault()).toLocalDate());
		user.setFirstName(faker.name().firstName());
		user.setLastName(faker.name().lastName());
		Address address = new Address();
		address.setHouseNumber(faker.address().buildingNumber());
		address.setStreet(faker.address().streetAddress());
		address.setCity(faker.address().city());
		address.setState(faker.address().state());
		address.setZipcode(faker.address().zipCode());
		user.setAddress(address);
		return user;
	}
}
