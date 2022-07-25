package com.rome.book.SpringBootWeb.Web;


import com.rome.book.SpringBootWeb.Web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // API를 JSon 형식으로 반환하는 컨트롤러

// 컨트롤러와 관련된 클래스를 담는 Package
public class HelloController {

    @GetMapping("/hello") // HTTP method인 Get요청을 받을 수 있는 API
    public String hello(){
        return "hello";     // /hello라는 get 요청이 오면, 문자열 hello를 반환
    }


    // @RequestParam : 외부에서 API로 넘긴 Param을 가져오는 @, name으로 넘긴 ppram을 name에 저장
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name")String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
