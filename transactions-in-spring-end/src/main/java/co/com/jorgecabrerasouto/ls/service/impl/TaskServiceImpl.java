package co.com.jorgecabrerasouto.ls.service.impl;

import org.springframework.stereotype.Service;

import co.com.jorgecabrerasouto.ls.exception.TaskNotSavedException;
import co.com.jorgecabrerasouto.ls.persistence.model.Task;
import co.com.jorgecabrerasouto.ls.persistence.repository.ITaskRepository;
import co.com.jorgecabrerasouto.ls.service.ITaskService;

@Service
public class TaskServiceImpl implements ITaskService {

    private ITaskRepository taskRepository;

    public TaskServiceImpl(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) throws TaskNotSavedException {
        // return taskRepository.save(task);
        throw new TaskNotSavedException("Unable to save task");

    }

}
