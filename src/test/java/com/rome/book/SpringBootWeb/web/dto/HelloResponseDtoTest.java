package com.rome.book.SpringBootWeb.web.dto;

import com.rome.book.SpringBootWeb.Web.dto.HelloResponseDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloResponseDtoTest {

    @Test
    public void LomBok_function_Test() {
        //given
        String name = "test";
        int amount = 1000;
        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        // then
        Assertions.assertThat(dto.getName()).isEqualTo(name); // assertThat에 있는 값과 비교해서 같을때만 성공
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
