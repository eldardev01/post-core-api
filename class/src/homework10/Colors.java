package homework10;

import java.util.Arrays;

public enum Colors {
    RED("Красный"),
    ORANGE("Оранжевый"),
    YELLOW("Жёлтый"),
    GREEN("Зелёный"),
    BLUE("Голубой"),
    PURPLE("Фиолетовый");

    private String title;

    Colors (String title) {
        this.title = title;
    }

}
