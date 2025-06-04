package com.app.todo.service;

import com.app.todo.dto.TodoDTO;
import com.app.todo.entity.Todo;
import com.app.todo.mapper.TodoMapper;
import com.app.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository repository) {
        this.todoRepository = repository;
    }

    public List<TodoDTO> findAll() {
        return todoRepository.findAll()
                .stream()
                .map(TodoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<TodoDTO> findById(Long id) {
        return todoRepository.findById(id).map(TodoMapper::toDTO);
    }

    public TodoDTO create(TodoDTO dto) {
        Todo todo = TodoMapper.toEntity(dto);
        Todo saved = todoRepository.save(todo);
        return TodoMapper.toDTO(saved);
    }

    public Optional<TodoDTO> update(Long id, TodoDTO todoDTO) {
        return todoRepository.findById(id).map(todo -> {
            todo.setTitle(todoDTO.title());
            todo.setDescription(todoDTO.description());
            todo.setCompleted(todoDTO.completed());
            return TodoMapper.toDTO(todoRepository.save(todo));
        });
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
