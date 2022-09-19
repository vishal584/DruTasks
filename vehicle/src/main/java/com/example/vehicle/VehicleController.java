package com.example.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class VehicleController {

	@Autowired
	VehicleService vehicleservice;

	@GetMapping("/vehicle")
	public List<Vehicle> getAllVehicles(){
		return vehicleservice.getAllVehicles();
	}
	@GetMapping("/vehicle/{id}")
	public Vehicle getVehicle(@PathVariable String  id){
		return vehicleservice.getVehicle(id);
	}
	@PostMapping("/vehicle")
	public void addVehicle(@RequestBody Vehicle vehicle){
		 vehicleservice.addVehicle(vehicle);
	}
	@PutMapping("/vehicle/{id}")
	public void updateVehicle(@RequestBody Vehicle vehicle,@PathVariable String  id) {
		 vehicleservice.updateVehicle(vehicle,id);
	}
	@DeleteMapping("/vehicle/{id}")
	public void deleteVehicle(@PathVariable String  id) {
		 vehicleservice.deleteVehicle(id);
	}
}
