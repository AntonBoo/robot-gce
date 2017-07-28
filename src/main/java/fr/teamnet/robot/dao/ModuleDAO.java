package fr.teamnet.robot.dao;

import org.springframework.data.repository.CrudRepository;

import fr.teamnet.robot.entity.Module;

public interface ModuleDAO extends CrudRepository<Module,Integer> {

}
