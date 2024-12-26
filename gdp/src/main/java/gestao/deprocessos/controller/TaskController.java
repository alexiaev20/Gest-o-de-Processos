package gestao.deprocessos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gestao.deprocessos.modal.Task;
import gestao.deprocessos.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task criarTarefa(@RequestBody Task tarefa) {
        return taskService.criarTarefa(tarefa);
    }

    @PutMapping("/{id}")
    public Task atualizarTarefa(@PathVariable Long id, @RequestBody Task tarefa) {
        return taskService.atualizarTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        taskService.deletarTarefa(id);
    }

    @GetMapping
    public List<Task> listarTarefas() {
        return taskService.listarTarefas();
    }
}
