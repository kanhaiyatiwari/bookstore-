package com.bookStore.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.entiry.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	Optional<User> findUserByRole(String name);
	

}
