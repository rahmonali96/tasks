package uz.epam.task4.model;

import java.util.Random;

public enum Color {
    BLACK,WHITE,BLUE;

    public static Color getRandom() {
        Color[] color = Color.values();
        return color[new Random().nextInt(3)];
    }
}
