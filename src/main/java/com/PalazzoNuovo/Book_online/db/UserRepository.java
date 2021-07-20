package com.PalazzoNuovo.Book_online.db;


	
	import org.springframework.data.jpa.repository.JpaRepository;

	import com.PalazzoNuovo.Book_online.model.User;

	public interface UserRepository extends JpaRepository<User, Long> {
	}


