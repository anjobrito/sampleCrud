package com.sample.org.app.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.sample.org.app.model.People;
import com.sample.org.app.repository.PeopleRepository;
import com.sample.org.app.setting.PeopleDto;
import com.sample.org.app.setting.RegState;

@Service
@Transactional
public class PeopleService {
	
	public final PeopleRepository peopleRepository;
	
	public PeopleService(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;		
	}
	
	public People save(PeopleDto peopleDto) {		
		People people = new People.PeopleBuilder().nome(peopleDto.getNome())
				            .cpf(peopleDto.getCpf())
				            .endereco(peopleDto.getEndereco())
				            .nascimento(peopleDto.getNascimento())
				            .status(RegState.INATIVE)
				            .builder();
		return peopleRepository.save(people);
	}
	
	public People save(People people) {				
		return peopleRepository.save(people);
	}
	
	public List<People> showAllPeople(){
		List<People> peoples = new ArrayList<People>();
		peopleRepository.findAll().forEach(people -> {peoples.add(people);});
		return peoples;
	}
	
	public String  delete(int id) {
		String messageDelete = "";
		try {
		 peopleRepository.deleteById(id);
		 messageDelete= id + " was deleted with sucess. ";
		}catch (Exception e) {
			messageDelete="The id :"+ id +"was not deleted, because By "+e.getMessage();
		}
		return messageDelete;
	}
	
	public Optional<People> editPeople(int idPeople) {
		return peopleRepository.findById(idPeople);
	}	
	
	
	public Optional<People> findPeople(int id) {
		Optional<People> people = null;
		people = peopleRepository.findById(id);
		return people;
	}
	
	public String update(People people,int id) {
		if(peopleRepository.existsById(id)&&people.getIdpeople()==id) {
			peopleRepository.save(people);			
		}else{
			return "can't save the new changes";	
		}
		return "the new changes was applyed";
	}

}
