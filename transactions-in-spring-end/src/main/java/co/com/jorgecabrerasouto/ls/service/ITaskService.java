package co.com.jorgecabrerasouto.ls.service;

import co.com.jorgecabrerasouto.ls.exception.TaskNotSavedException;
import co.com.jorgecabrerasouto.ls.persistence.model.Task;

public interface ITaskService {

    Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;
}
