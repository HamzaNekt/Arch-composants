package ma.formations.tpdatarest.domaine;

import ma.formations.tpdatarest.model.Article;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "articleDTO",  types = Article.class)
public interface ArticleDTO {

    Long getId();
    @Value("#{target.description}")
    String getDesc();

    Double getPrice();

    @Value("#{target.quantity}")
    Integer getQuant();

    @Value("#{target.categorie.categorie}")
    String getCat();
}
