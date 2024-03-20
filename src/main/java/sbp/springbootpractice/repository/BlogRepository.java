package sbp.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbp.springbootpractice.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
