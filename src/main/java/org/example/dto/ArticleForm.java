package org.example.dto;
import lombok.ToString;
import lombok.AllArgsConstructor;
import org.example.entity.Article;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;
    private String content;

    public Article toEntity(){
        return new Article(null, title, content);
    }
}
