package sbp.springbootpractice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sbp.springbootpractice.domain.Article;
import sbp.springbootpractice.dto.AddArticleRequest;
import sbp.springbootpractice.repository.BlogRepository;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // Bean으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}