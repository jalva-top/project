package top.jalva.project.domain;

import lombok.Data;

@Data
public class Cities {
    Long id;
    String name;
    String type;
    boolean capitalCity;
}
