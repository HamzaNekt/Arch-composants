package ma.formations.ioc.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {
    private long id;
    private String description;
    private Double price;
    private Double quantity;
}
