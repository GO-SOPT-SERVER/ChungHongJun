package sopt.org.SecondSeminar.controller.board.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SaveRequestDto {
    private String title;
    private String writer;
    private String content;
}