package com.shivam.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Micro_Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	@Id
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "NAME" , length = 20)
	private String name;
	@Column(name = "EMAIL_ID")
	private String email;
	@Column(name = "ABOUT")
	private String about;

	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
	// If you want to Create any custom variables then feel free to write here...
}
