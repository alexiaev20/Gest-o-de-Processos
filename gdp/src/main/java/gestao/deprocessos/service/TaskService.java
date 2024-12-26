package gestao.deprocessos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestao.deprocessos.TaskRepository.TaskRepository;
import gestao.deprocessos.modal.Task;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task criarTarefa(Task tarefa) {
        return taskRepository.save(tarefa);
    }

    public Task atualizarTarefa(Long id, Task tarefa) {
        tarefa.setId(id);
        return taskRepository.save(tarefa);
    }

    public void deletarTarefa(Long id) {
        taskRepository.deleteById(id);
    }

    public Task buscarTarefa(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> listarTarefas() {
        return taskRepository.findAll();
    }
}
