package uz.epam.task4.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.epam.task4.model.Color;

public class ColorValidator {
    private static final Logger logger = LoggerFactory.getLogger(ColorValidator.class);
    public static boolean isExist(String color) {
        boolean isExist = true;
        try {
            Color.valueOf(color);
        } catch (IllegalArgumentException e) {
            isExist = false;
            logger.warn("Unknown type of color : {}", color);
        }
        return isExist;
    }
}
