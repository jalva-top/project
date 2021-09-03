package top.jalva.project.domain;

import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "regions")
@Value
public class Region {
    @Id
    String id;
    Set<City> cities;
}
