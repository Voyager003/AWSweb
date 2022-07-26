package com.rome.book.SpringBootWeb.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepoSitory<Entity class, PK Type> -> 자동으로 CRUD 메서드 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
