package co.com.jorgecabrerasouto.ls.web.dto;

import java.time.LocalDate;

import co.com.jorgecabrerasouto.ls.persistence.model.TaskStatus;

public record TaskDto(
    Long id,
    String name,
    String description,
    LocalDate dateCreated,
    LocalDate dueDate,
    TaskStatus status) {
}
