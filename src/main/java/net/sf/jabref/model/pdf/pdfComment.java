package net.sf.jabref.model.pdf;


import java.util.Optional;

public class pdfComment {

    private String commentId;
    private String author;
    private String date;
    private int page;
    private String content;
    private Optional<String> text;

    public pdfComment(String commentId, String author, String date, int page, String content, Optional<String> text) {
        this.author = author;
        this.date = date;
        this.page = page;
        this.content = content;
        this.text = text;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Optional<String> getText() {
        return text;
    }

    public void setText(Optional<String> text) {
        this.text = text;
    }
}
