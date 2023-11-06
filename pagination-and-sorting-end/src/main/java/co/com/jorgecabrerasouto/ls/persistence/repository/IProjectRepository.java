package co.com.jorgecabrerasouto.ls.persistence.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import co.com.jorgecabrerasouto.ls.persistence.model.Project;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long>, CrudRepository<Project, Long>{

    Optional<Project> findByName(String name);

    List<Project> findByDateCreatedBetween(LocalDate start, LocalDate end);
}
