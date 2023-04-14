package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.board.dto.request.BoardRegisterRequestDto;
import sopt.org.SecondSeminar.domain.board.Board;

import static sopt.org.SecondSeminar.SecondSeminarApplication.boardList;

@Service
public class BoardService {
    public Long boardRegister(BoardRegisterRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 Board 객체 생성
        Board newBoard = new Board(
                request.getTitle(),
                request.getWriter(),
                request.getContent()
        );

        // 데이터베이스에 저장
        boardList.add(newBoard);
        newBoard.setId((long) boardList.size());

        // 저장된 게시물의 아이디 값 반환
        return newBoard.getId();
    }
}
