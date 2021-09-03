package top.jalva.project.domain;

import lombok.Value;

@Value
class City {
    Long id;
    String name;
    String type;
    boolean capitalCity;
}
