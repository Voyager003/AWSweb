package com.rome.book.SpringBootWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
// SpringBootApplication : spring boot의 자동설정 bean 읽기, 자동으로 설정 always 프로젝트 최상단에 위치
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // WAS 실행 -> Jar file로 실행
    }
}
