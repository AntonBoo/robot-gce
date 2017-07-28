package fr.teamnet.robot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.teamnet.robot.dao.ModuleDAO;
import fr.teamnet.robot.entity.Module;

@Service
public class ModuleService {
	
	@Autowired
	private ModuleDAO dao;

	public List<Module> getAllTopics() {
		return (List<Module>) dao.findAll();
	}

	public Module getModule(int id) {
		return dao.findOne(id);
	}

	public void addModule(Module module) {
		dao.save(module);
		
	}

}
