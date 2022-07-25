package com.rome.book.SpringBootWeb.Web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 Filed에 Get 메서드를 생성
@RequiredArgsConstructor // 선언된 모든 final 필드가 포함된 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
