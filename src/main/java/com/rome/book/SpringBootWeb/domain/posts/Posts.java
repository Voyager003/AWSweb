package com.rome.book.SpringBootWeb.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 6) Class 내 모든 필드의 Getter 메서드 자동 생성
@NoArgsConstructor // 5) 기본 생성자 자동추가
@Entity // 1) Table과 Linked Class임을 나타냄
public class Posts {

    @Id // 2) 해당 Table의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3) PK생성 규칙
    private Long id;

    @Column(length = 500, nullable = false) // 4) Table의 Column 기본값 외 추가 변경이 필요한 옵션이 있을 시 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 Class의 Builder Patern 생성
    public Posts(String title,String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }


}
