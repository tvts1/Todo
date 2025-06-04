package com.app.todo.controller;

import com.app.todo.dto.TodoDTO;
import com.app.todo.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String listTodos(Model model) {
        model.addAttribute("todos", todoService.findAll());
        return "todo/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("todoDTO", new TodoDTO(null, "", "", false));
        return "todo/form";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("todoDTO") TodoDTO todoDTO,
                         BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "todo/form";
        }
        todoService.create(todoDTO);
        return "redirect:/todos";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        return todoService.findById(id)
                .map(todoDTO -> {
                    model.addAttribute("todoDTO", todoDTO);
                    return "todo/form";
                })
                .orElse("redirect:/todos");
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id,
                         @Valid @ModelAttribute("todoDTO") TodoDTO todoDTO,
                         BindingResult result) {
        if (result.hasErrors()) {
            return "todo/form";
        }
        todoService.update(id, todoDTO);
        return "redirect:/todos";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoService.delete(id);
        return "redirect:/todos";
    }
}
