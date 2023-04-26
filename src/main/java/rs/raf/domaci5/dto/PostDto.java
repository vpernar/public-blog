package rs.raf.domaci5.dto;

public class PostDto {
    private String author;
    private String title;
    private String content;

    public PostDto(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public PostDto() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
