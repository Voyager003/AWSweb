package com.rome.book.SpringBootWeb.domain.posts;


import lombok.Builder;

import javax.persistence.*;

@Entity // Table과 Linked Class임을 나타냄
public class Posts {

    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(length = 500, nullable = false) //
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //
    public Posts(String title,String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }


}
