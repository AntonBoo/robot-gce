package fr.teamnet.robot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.teamnet.robot.entity.Module;
import fr.teamnet.robot.service.ModuleService;


@RestController
public class ModuleController {
	
	@Autowired
	private ModuleService service;
	
	@RequestMapping("/coucou")
	@ResponseBody
	public String coucou() {
		return "coucou";
	}
	
	
	@RequestMapping("/")
	public List<Module> getAllModules() {
		return service.getAllTopics();
	}
	
	@RequestMapping("/{id}")
	public Module getTopic(@PathVariable int id) {
		return service.getModule(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addTopic(@RequestBody Module module) {
		service.addModule(module);
	}


}
