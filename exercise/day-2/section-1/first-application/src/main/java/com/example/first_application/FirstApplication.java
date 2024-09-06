package com.example.first_application;

import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // mendefinisikan class controller
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/allUsers")
	public ArrayList<GetAssetResponse> getAsset(){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullName("Bryan Felix").age(12).gender("Male").build();
		GetAssetResponse response2 = GetAssetResponse.builder().id(2L).fullName("Felice Isna").age(23).gender("Female").build();
		list.add(response);
		list.add(response2);
		return list;
	}


	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("John", "Jane", "Jack");
	}
}
