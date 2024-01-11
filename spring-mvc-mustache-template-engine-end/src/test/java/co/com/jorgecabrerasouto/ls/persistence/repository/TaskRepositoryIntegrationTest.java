package co.com.jorgecabrerasouto.ls.persistence.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.jorgecabrerasouto.ls.persistence.model.Task;
import co.com.jorgecabrerasouto.ls.persistence.repository.ITaskRepository;

@SpringBootTest
public class TaskRepositoryIntegrationTest {

    @Autowired
    ITaskRepository taskRepository;

    @Test
    public void givenNewTask_thenSavedSuccess() {
        Task newTask = new Task("First Task", "First Task", LocalDate.now(), LocalDate.now());
        assertNotNull(taskRepository.save(newTask));
    }

    @Test
    public void givenTaskCreated_thenFindByIdSuccess() {
        Task newTask = new Task("First Task", "First Task", LocalDate.now(), LocalDate.now());
        taskRepository.save(newTask);

        Optional<Task> retreivedTask = taskRepository.findById(newTask.getId());
        assertEquals(retreivedTask.get(), newTask);
    }
}