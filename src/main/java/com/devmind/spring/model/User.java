package com.devmind.spring.model;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class User {
	private String name;
	private String email;
	private String phone;
	private String birthDate;

}
