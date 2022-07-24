package com.rome.book.SpringBootWeb.Web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // API를 JSon 형식으로 반환하는 컨트롤러

// 컨트롤러와 관련된 클래스를 담는 Package
public class HelloController {

    @GetMapping("/hello") // HTTP method인 Get요청을 받을 수 있는 API
    public String hello(){
        return "hello";     // /hello라는 get 요청이 오면, 문자열 hello를 반환
    }
}
