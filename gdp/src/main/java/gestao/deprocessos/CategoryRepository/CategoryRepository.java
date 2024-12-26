package gestao.deprocessos.CategoryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import gestao.deprocessos.modal.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
