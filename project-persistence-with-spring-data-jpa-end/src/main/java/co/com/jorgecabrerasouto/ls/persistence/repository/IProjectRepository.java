package co.com.jorgecabrerasouto.ls.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectRepository extends CrudRepository <Project, Long>{

}
