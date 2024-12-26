package gestao.deprocessos.TaskRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import gestao.deprocessos.modal.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

