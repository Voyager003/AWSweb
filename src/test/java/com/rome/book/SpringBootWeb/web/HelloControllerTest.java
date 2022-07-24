package com.rome.book.SpringBootWeb.web;

import com.rome.book.SpringBootWeb.Web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class) //Junit5 업데이트 후, @RunWith가 아닌 Extension으로 커스터마이징
@WebMvcTest(controllers =  HelloController.class) // Web에 집중할 수 있는 애노테이션, @Controller, @ControllerAdcivce 사용


// @AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired // Bean을 주입
    private MockMvc mvc;// Web API Test로 HTTP GET, POST 등 Test

    @Test
    public void hello_return() throws Exception{
        String hello="hello";

        mvc.perform(get("/hello"))  // MockMvc를 통해 HTTP GET 요청
                .andExpect(status().isOk())    // mvc.perform의 결과를 검증 (HTTP 응답메시지를 검증)
                .andExpect(content().string(hello)); // 응답 본문의 내용 검증 (Controller에서 hello return하는데 값이 맞는지 검증)
    }

}
