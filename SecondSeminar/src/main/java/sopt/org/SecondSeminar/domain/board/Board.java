package sopt.org.SecondSeminar.domain.board;

import lombok.Getter;

@Getter
public class Board {

    private Long id;

    private String title;

    private String writer;

    private String content;


    public Board(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {this.title = title;}

    public void setWriter(String writer) {this.writer = writer;}

    public void setContent(String content) {this.content = content;}

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "writer: " + this.writer + "\n" +
                "content: " + this.content;
    }
}
