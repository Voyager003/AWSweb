package com.rome.book.SpringBootWeb.domain.posts;


import org.aspectj.lang.annotation.After;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach() // Junit 단위 테스트 끝날 때 마다 수행되는 메서드 지정 (Junit5부터 혼동을 위해 바뀜)
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void Load_postsave(){
        //given
        String title = "Test Post";
        String content = "Test body";

        postsRepository.save(Posts.builder() // table posts에 insert/update 쿼리를 실행(id가 있으면 update, 없으면 insert)
                .title(title)
                .content(content)
                .author("miraclex000@gmail.com")
                .build());
        //when
        List<Posts> postsList = postsRepository.findAll(); // table posts에 있는 모든 Data 조회

        //then
        Posts posts = postsList.get(0);
        Assertions.assertThat(posts.getTitle()).isEqualTo(title);
        Assertions.assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    public void BaseTimeEntitiy_register(){
        //given
        LocalDateTime now = LocalDateTime.of(2022,8,1,0,0,0);
        postsRepository.save(Posts.builder()
                .title("title")
                .content("content")
                .author("author")
                .build());
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>>>> createDate="+posts.getCreateDate()+", modifiedDate="+posts.getModifiedDate());

        Assertions.assertThat(posts.getCreateDate()).isAfter(now);
        Assertions.assertThat(posts.getModifiedDate()).isAfter(now);


    }

}
