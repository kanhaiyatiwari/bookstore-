package com.bookStore.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	
@Data
@NoArgsConstructor
@AllArgsConstructor
public class books {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bookName;
	private int price;
	
	private String Author;
	@ManyToOne
	@JoinColumn(name = "userIdS")

	private User user;
	
}
