package com.example.database;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.database.model.Topic;
//import com.example.database.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

 
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
	 topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}



	public Topic getTopic(String topicId) {

		return topicRepository.findById(topicId).get();


		// TODO Auto-generated method stub
//		return topicList.stream().filter(t -> t.getId().equals(topicId))
//				.findFirst().get();
	}

	public void addTopic(Topic topic) {
		
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
      Optional<Topic> list = topicRepository.findById(id);
      
      list.get().setName(topic.getName());
      
		topicRepository.save(list.get());


//		for(int i=0;i<=topicList.size()-1;i++) {
//			Topic t=topicList.get(i);
//			if(t.getId().equals(id)) {
//				topicList.set(i, topic);
//			}
//		}
	}

	public void deleteTopic(String topicId) {
	//topicRepository.removeIf(data -> data.getId().equals(topicId));
		topicRepository.deleteById(topicId);
	}



	


}
