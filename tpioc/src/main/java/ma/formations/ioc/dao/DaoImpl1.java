package ma.formations.ioc.dao;


import ma.formations.ioc.service.model.Article;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DaoImpl1 implements IDao{
    public static final List<Article> repository =List.of(
            new Article(1L,"HP Omen i5",10000.0,20.0),
            new Article(2L,"HP Omen i7",14000.0,10.0),
            new Article(3L,"HP envy i7",10000.0,2.0),
            new Article(4L,"HP envy i5",10000.0,17.0)
            );

    @Override
    public List<Article> getAll(){
        return repository;
    }

    @Override
    public void save(Article article) {
        repository.add(article);
    }

    @Override
    public Article findById(Long id){
        return repository.stream().filter(a->a.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void deleteById(Article article) {
        repository.remove(repository.stream().filter(a ->a.getId().equals(id)).findAny().orElse(null).getId().intValue());
    }
}
