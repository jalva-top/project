package top.jalva.project.enums;

public enum RegionId {

    VINNYTSIA(0, "Вінницька", "Винницкая"),

    VOLYN(1, "Волинська", "Волынская"),

    DNIPROPETROVSK(2, "Дніпропетровська", "Днепропетровская"),

    DONETSK(3, "Донецька", "Донецкая"),

    ZHYTOMYR(4, "Житомирська", "Житомирская"),

    ZAKARPATTIA(5, "Закарпатська", "Закарпатская"),

    ZAPORIZHIA(6, "Запорізька", "Запорожская"),

    IVANO_FRANKIVSK(7, "Івано-Франківська", "Ивано-Франковская"),

    KYIV(8, "Київська", "Киевская"),

    KIROVOHRAD(9, "Кіровоградська", "Кировоградская"),

    CRIMEA(10, "АРК", "Крым"),

    LUHANSK(11, "Луганська", "Луганская"),

    LVIV(12, "Львівська", "Львовская"),

    MYKOLAIV(13, "Миколаївська", "Николаевская"),

    ODESSA(14, "Одеська", "Одесская"),

    POLTAVA(15, "Полтавська", "Полтавская"),

    RIVNE(16, "Рівненська", "Ровненская"),

    SUMY(17, "Сумська", "Сумская"),

    TERNOPIL(18, "Тернопільська", "Тернопольская"),

    KHARKIV(19, "Харківська", "Харьковская"),

    KHERSON(20, "Херсонська", "Херсонская"),

    KHMELNYTSKYI(21, "Хмельницька", "Хмельницкая"),

    CHERKASY(22, "Черкаська", "Черкасская"),

    CHERNIHIV(23, "Чернігівська", "Черниговская"),

    CHERNIVTSI(24, "Чернівецька", "Черновицкая");

    int index;
    String nameUa;
    String nameRu;

    RegionId(int index, String nameUa, String nameRu) {
        this.index = index;
        this.nameUa = nameUa;
        this.nameRu = nameRu;
    }

    public final int getIndex() {
        return index;
    }

    public final String getNameUa() {
        return nameUa;
    }

    public final String getNameRu() {
        return nameRu;
    }
}
