package com.dd.dp.cp.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
/**
 * This class is responsible to implement all builder related methods. Here first it will collect the parts
 * then it will assemble the object of {@link UserWebDTO}
 *
 * @author DIPANJAN DAS 
 *
 */
public class UserWebDTOBuilder implements UserDTOBuilder {
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;

	/**
	 * Collecting first name as parts.
	 */
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.firstName = fname;
		return this;
	}

	/**
	 * Collecting last name as parts
	 */
	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lastName = lname;
		return this;
	}

	/**
	 * Collecting date of birth as parts.
	 */
	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period period = Period.between(date, LocalDate.now());
		this.age = Integer.toString(period.getYears());
		return this;
	}

	/**
	 * Collecting address as parts.
	 */
	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber().concat(" ").concat(address.getStreet())
				.concat(" ").concat(address.getCity()).concat(" ")
				.concat(address.getState()).concat(" ").concat(address.getZipcode());
		return this;
	}

	
	/**
	 * Assembling parts to build object of {@link UserWebDTO}
	 */
	@Override
	public UserDTO build() {
		String name = firstName.concat(" ").concat(lastName);
		dto = new UserWebDTO(name, address, age);
		return dto;
	}

	/**
	 * Returning already created {@link UserWebDTO}
	 */
	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
	
	
}
