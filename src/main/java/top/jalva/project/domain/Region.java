package top.jalva.project.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "regions")
@Data
public class Region {
    @Id
    String id;
    Set<City> cities;
}
