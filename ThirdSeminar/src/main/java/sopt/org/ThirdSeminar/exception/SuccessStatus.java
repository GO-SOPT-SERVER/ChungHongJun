package sopt.org.ThirdSeminar.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {

    /*
    user
     */
    //지금은 회원가입이고, 이후에 로그인이나 계정 탈퇴 등과 같은 기능들에 대해서도 만들어서 연결해주면 된다.
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입이 완료되었습니다."),
    ;

    private final HttpStatus httpStatus;
    private final String message;
}