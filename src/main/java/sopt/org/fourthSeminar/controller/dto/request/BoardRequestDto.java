package sopt.org.fourthSeminar.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class BoardRequestDto {
    @NotNull
    private MultipartFile thumbnail;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private Boolean isPublic;
}