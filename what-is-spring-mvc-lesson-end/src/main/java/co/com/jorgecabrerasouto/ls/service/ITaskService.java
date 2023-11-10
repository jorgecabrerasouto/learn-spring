package co.com.jorgecabrerasouto.ls.service;

import java.util.Optional;

import co.com.jorgecabrerasouto.ls.persistence.model.Task;

public interface ITaskService {
    Optional<Task> findById(Long id);

    Task save(Task project);
}