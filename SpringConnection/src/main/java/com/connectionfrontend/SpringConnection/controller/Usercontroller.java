package com.connectionfrontend.SpringConnection.controller;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:5173") 

//Marking this class as RestController means it will handle web requests

@RestController

//base URL for this controller
@RequestMapping("/api") 
public class Usercontroller {
	
//defining the GET EndPoint that return the list of users
//When FrontEnd calls /api/users this method runs
	@GetMapping("/users")
	public List<String> getUsers(){
		//Returning the list of user names
		return Arrays.asList("Kavya", "Krish" , "Walmart");
		
	}
}

