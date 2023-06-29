package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.user.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.domain.user.User;

import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@Service
public class UserService {
    public Long register(RegisterRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 User 객체 생성
        User newUser = new User(
                request.getGender(),
                request.getName(),
                request.getContact(),
                request.getAge()
        );

        // 데이터베이스에 저장
        userList.add(newUser);
        newUser.setId((long) userList.size());

        // 저장한 유저 아이디 값 반환
        return newUser.getId();
    }
}
