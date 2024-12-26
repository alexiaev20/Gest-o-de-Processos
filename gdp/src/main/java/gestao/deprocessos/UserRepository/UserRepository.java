package gestao.deprocessos.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import gestao.deprocessos.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
