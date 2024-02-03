package co.com.jorgecabrerasouto.ls.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.jorgecabrerasouto.ls.persistence.model.Task;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}
