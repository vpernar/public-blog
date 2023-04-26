package rs.raf.domaci5.dto;

public class CommentDto {
    private String author;
    private String comment;

    public CommentDto(String name,  String comment) {
        this.author = name;
        this.comment = comment;
    }

    public CommentDto() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
