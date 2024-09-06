package com.example.first_application;

import com.example.first_application.request.CreateUserRequest;
import com.example.first_application.request.EmployeeUserRequest;
import com.example.first_application.request.UpdateUserRequest;
import com.example.first_application.response.CreateUserResponse;
import com.example.first_application.response.EmployeeUserResponse;
import com.example.first_application.response.GetAssetResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // mendefinisikan class controller
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	private ArrayList<CreateUserResponse> userss = new ArrayList<>();

	@GetMapping
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/assets")
	public ArrayList<GetAssetResponse> getAsset(){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		GetAssetResponse response = GetAssetResponse.builder().id(1L).fullName("Bryan Felix").age(12).gender("Male").build();
		GetAssetResponse response2 = GetAssetResponse.builder().id(2L).fullName("Felice Isna").age(23).gender("Female").build();
		list.add(response);
		list.add(response2);
		return list;
	}

	@GetMapping("/assets/{id}")
	public ArrayList<GetAssetResponse> getAssetById(
			@PathVariable Long id
	){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		list.add(GetAssetResponse.builder().id(1L).fullName("Bryan Felix").age(12).gender("Male").build());
		list.add(GetAssetResponse.builder().id(2L).fullName("Felice Isna").age(25).gender("Female").build());
		list.add(GetAssetResponse.builder().id(3L).fullName("Ospdi Demo").age(23).gender("Female").build());
		list.add(GetAssetResponse.builder().id(4L).fullName("Hsjdk Ihkd").age(21).gender("Male").build());
		list.add(GetAssetResponse.builder().id(8L).fullName("Pasdj Iush").age(20).gender("Female").build());

		ArrayList<GetAssetResponse> temp = new ArrayList<>();
		for(GetAssetResponse x : list){
			if(x.getId() >= id){
				temp.add(x);
			}
		}
		return temp;
	}

	@GetMapping("/users")
	public List<String> getUser(){
		return List.of("John", "Jane", "Jack");
	}

	@GetMapping("/calculator/add")
	public String getAdd(
		@RequestParam(name = "panjang") int panjang,
		@RequestParam(name = "lebar", required = false, defaultValue = "20") int lebar
	){
		return String.valueOf(panjang+lebar);
	}

//	@GetMapping("/assets/pages")
//	public ArrayList<GetAssetResponse> getAssetsByPageSize(
//		@RequestParam(name = "page") int page,
//		@RequestParam(name = "size") int size
//	){
//		ArrayList<GetAssetResponse> list = new ArrayList<>();
//		list.add(GetAssetResponse.builder().id(1L).fullName("Bryan Felix").age(12).gender("Male").build());
//		list.add(GetAssetResponse.builder().id(2L).fullName("Felice Isna").age(25).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(3L).fullName("Ospdi Demo").age(23).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(4L).fullName("Hsjdk Ihkd").age(21).gender("Male").build());
//		list.add(GetAssetResponse.builder().id(5L).fullName("Pasdj Iush").age(20).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(6L).fullName("Pasdj Iush").age(20).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(7L).fullName("Pasdj Iush").age(20).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(8L).fullName("Pasdj Iush").age(20).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(9L).fullName("Pasdj Iush").age(20).gender("Female").build());
//		list.add(GetAssetResponse.builder().id(10L).fullName("Pasdj Iush").age(20).gender("Female").build());
//
//		int temp = ((page-1) * size);
//		ArrayList<GetAssetResponse> tampung = new ArrayList<>();
//		if(list.size()-1 < temp){
//			return tampung;
//		}
//		for (int i=temp;i<temp+size;i++){
//			tampung.add(list.get(i));
//			if(list.size()-1 < i+1){
//				break;
//			}
//		}
//		return tampung;
//	}

	@GetMapping("/assets/pages")
	public List<GetAssetResponse> getAssetsByPageSize(
			@RequestParam(name = "page") int page,
			@RequestParam(name = "size") int size
	){
		ArrayList<GetAssetResponse> list = new ArrayList<>();
		list.add(GetAssetResponse.builder().id(1L).fullName("Bryan Felix").age(12).gender("Male").build());
		list.add(GetAssetResponse.builder().id(2L).fullName("Felice Isna").age(25).gender("Female").build());
		list.add(GetAssetResponse.builder().id(3L).fullName("Ospdi Demo").age(23).gender("Female").build());
		list.add(GetAssetResponse.builder().id(4L).fullName("Hsjdk Ihkd").age(21).gender("Male").build());
		list.add(GetAssetResponse.builder().id(5L).fullName("Pasdj Iush").age(20).gender("Female").build());
		list.add(GetAssetResponse.builder().id(6L).fullName("Pasdj Iush").age(20).gender("Female").build());
		list.add(GetAssetResponse.builder().id(7L).fullName("Pasdj Iush").age(20).gender("Female").build());
		list.add(GetAssetResponse.builder().id(8L).fullName("Pasdj Iush").age(20).gender("Female").build());
		list.add(GetAssetResponse.builder().id(9L).fullName("Pasdj Iush").age(20).gender("Female").build());
		list.add(GetAssetResponse.builder().id(10L).fullName("Pasdj Iush").age(20).gender("Female").build());

		int start = ((page-1) * size);
		int end = Math.min(start+size, list.size());
		if (start >= list.size()){
			return new ArrayList<>();
		}
		return list.subList(start,end);
	}

	@PostMapping("/users")
	public ResponseEntity<ArrayList<CreateUserResponse>> createUser(
			@RequestBody CreateUserRequest request){

//		ArrayList<CreateUserResponse> userResponses = new ArrayList<>();

//		mock data
//		userResponses.add(CreateUserResponse.builder().id(1L).fullName("AB").age(12).gender("Male").build());
//		userResponses.add(CreateUserResponse.builder().id(2L).fullName("CD").age(21).gender("Female").build());

//		add new data
//		userResponses.add(CreateUserResponse.builder().id(request.getId()).fullName(request.getFullName()).age(request.getAge()).gender(request.getGender()).build());
		userss.add(CreateUserResponse.builder().id((long)userss.size()+1).fullName(request.getFullName()).age(request.getAge()).gender(request.getGender()).build());

		return new ResponseEntity<>(userss, HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<ArrayList<EmployeeUserResponse>> createEmployee(
			@RequestBody EmployeeUserRequest request){

		ArrayList<EmployeeUserResponse> employeeResponses = new ArrayList<>();

//		mock data
		employeeResponses.add(EmployeeUserResponse.builder().id(1L).name("AB").age(12).address(null).phone("12323").build());
		employeeResponses.add(EmployeeUserResponse.builder().id(2L).name("CD").age(21).address("Jakarta").phone("7589485").build());
		employeeResponses.add(EmployeeUserResponse.builder().id(3L).name("CD").age(21).address("Jakarta").phone("7589485").build());

//		add new data
		if(request.getName() != null && (request.getAge() != null) && request.getPhone() != null){
			employeeResponses.add(EmployeeUserResponse.builder().id((long)employeeResponses.size()+1).name(request.getName()).age(request.getAge()).address(request.getAddress()).phone(request.getPhone()).build());
		}

		return new ResponseEntity<>(employeeResponses, HttpStatus.OK);
	}

	@PatchMapping("/users/{id}")
	public ResponseEntity<ArrayList<CreateUserResponse>> updateUser(
			@PathVariable("id") Long id,
			@RequestBody UpdateUserRequest req){
		for (CreateUserResponse user : userss){
			if (user.getId().equals(id)){
				System.out.println(req);
				user.setFullName(req.getFullName());
			}
		}
		return new ResponseEntity<>(userss, HttpStatus.OK);
	}

}
