package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.board.dto.request.BoardRegisterRequestDto;
import sopt.org.SecondSeminar.controller.board.dto.request.UpdateRequestDto;
import sopt.org.SecondSeminar.domain.board.Board;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Board> searchByTitle(String title){
        List<Board> searchedBoard = boardList.stream()
                .filter(board -> board.getTitle().equals(title))
                .collect(Collectors.toList());
        return searchedBoard;
    }
    public String updateBoard(Long boardId, UpdateRequestDto requestDto){
        Board board = boardList.get(boardId.intValue()-1);
        board.setContent(requestDto.getContent());
        board.setTitle(requestDto.getTitle());

        return "게시물 수정" + board;
    }

    public String deleteBoard(Long boardId) {
        if(boardId - 1 >= boardList.size()){
            return "삭제할 게시물이 없음";
        }
        boardList.remove(boardId.intValue() - 1);
        return "게시물 삭제 완료";
    }
}
