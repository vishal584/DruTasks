package com.example.vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

 

	public List<Vehicle> getAllVehicles(){
		
		List<Vehicle> vehicles = new ArrayList<>();
	 vehicleRepository.findAll().forEach(vehicles::add);
		
		return vehicles;
	}



	public Vehicle getVehicle(String vehicleId) {

		return vehicleRepository.findById(vehicleId).get();


		// TODO Auto-generated method stub
//		return topicList.stream().filter(t -> t.getId().equals(topicId))
//				.findFirst().get();
	}

	public void addVehicle(Vehicle vehicle) {
		
		vehicleRepository.save(vehicle);
	}

	public void updateVehicle(Vehicle vehicle, String id) {
      Optional<Vehicle> list = vehicleRepository.findById(id);
      
      list.get().setName(vehicle.getName());
      
		vehicleRepository.save(list.get());


//		for(int i=0;i<=topicList.size()-1;i++) {
//			Topic t=topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
	}

	public void deleteVehicle(String vehicleId) {
	vehicleRepository.deleteById(vehicleId);
	}



	


}

