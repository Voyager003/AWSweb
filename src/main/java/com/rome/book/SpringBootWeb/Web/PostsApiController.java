package com.rome.book.SpringBootWeb.Web;


import com.rome.book.SpringBootWeb.Web.dto.PostsResponseDto;
import com.rome.book.SpringBootWeb.Web.dto.PostsSaveRequestDto;
import com.rome.book.SpringBootWeb.Web.dto.PostsUpdateRequestDto;
import com.rome.book.SpringBootWeb.domain.posts.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // 생성자 주입 방식
@RestController
public class PostsApiController {

    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update (@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postService.findById(id);
    }

}
