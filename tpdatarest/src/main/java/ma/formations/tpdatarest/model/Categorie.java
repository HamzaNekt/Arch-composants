package ma.formations.tpdatarest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categorie {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String categorie;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    private List<Article> articles;

    public void addArticle(Article article) {
        article.setCategorie(this);
        articles.add(article);
    }
}
