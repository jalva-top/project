package top.jalva.project.domain;

import lombok.Data;

@Data
public class City {
    Long id;
    String name;
    String type;
    boolean capitalCity;
}
