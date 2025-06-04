package com.app.todo.mapper;
import com.app.todo.dto.TodoDTO;
import com.app.todo.entity.Todo;
import org.springframework.stereotype.Component;

@Component
public class TodoMapper {

    public static TodoDTO toDTO(Todo todo) {
        return new TodoDTO(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription(),
                todo.isCompleted()
        );
    }

    public static Todo toEntity(TodoDTO dto) {
        Todo todo = new Todo();
        todo.setTitle(dto.title());
        todo.setDescription(dto.description());
        todo.setCompleted(dto.completed());
        return todo;
    }
}
