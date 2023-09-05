package com.bookStore.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Repo.BookRepo;
import com.bookStore.Repo.UserRepo;

@Service
public class SellerServiseImp {
	@Autowired
private UserRepo repo;
	@Autowired
	private BookRepo brepo;
	
}
