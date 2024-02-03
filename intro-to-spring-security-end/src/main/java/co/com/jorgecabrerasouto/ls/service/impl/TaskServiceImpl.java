package co.com.jorgecabrerasouto.ls.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task save(Task project) {
        return taskRepository.save(project);
    }

    @Override
    public Iterable<Task> saveAll(List<Task> tasks) {
        return taskRepository.saveAll(tasks);
    }
}
