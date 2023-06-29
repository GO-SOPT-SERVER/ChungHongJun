package sopt.org.SecondSeminar.controller.board.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UpdateRequestDto {
    private String title;
    private String writer;
    private String content;
}