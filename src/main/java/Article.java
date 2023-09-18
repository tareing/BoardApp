import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Article {
    private String title;

    private String content;

    private int ArticleNumber;

    public  Article(int ArticleNumber,String title, String content){
        this.title = title;
        this.content = content;
        this.ArticleNumber = ArticleNumber;

    }

    public int getArticleNumber() {
        return ArticleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        ArticleNumber = articleNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}