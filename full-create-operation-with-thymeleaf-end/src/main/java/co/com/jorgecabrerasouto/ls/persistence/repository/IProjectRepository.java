package co.com.jorgecabrerasouto.ls.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long>, CrudRepository<Project, Long> {
    
}
