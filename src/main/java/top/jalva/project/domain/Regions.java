package top.jalva.project.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
public class Regions {
    @Id
    String id;
    Set<Cities> cities;
}
