package sopt.org.SecondSeminar.controller.board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.domain.board.Board;
import sopt.org.SecondSeminar.service.BoardService;
import sopt.org.SecondSeminar.controller.board.dto.request.BoardRegisterRequestDto;

import java.util.List;

import static sopt.org.SecondSeminar.SecondSeminarApplication.boardList;
import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board")
    public String boardRegister(@RequestBody final BoardRegisterRequestDto request) {
        // 서비스 계층에 유저를 등록하는 메서드를 호출
        Long boardId = boardService.boardRegister(request);
        System.out.println(boardList.get(boardId.intValue() - 1).toString());

        return boardId + "번 게시물이 등록되었습니다!";
    }
    @GetMapping("/board/{boardId}")
    public String getBoard(@PathVariable final Long boardId) {
//        System.out.println("요청 게시물 아이디: " + boardId);
        Board board = boardList.get(boardId.intValue()-1);
        String title = board.getTitle();
        String content = board.getContent();
        return "제목 - " + title + "내용 - " + content;
    }

    @GetMapping("board/search")
    public List<Board> search(@RequestParam final String title) {
//        System.out.println("게시물 검색 검색 인자: " + title);

        return boardService.searchByTitle(title);
    }
}
