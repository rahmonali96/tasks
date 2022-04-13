package uz.epam.task4.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.epam.task4.model.Ball;
import uz.epam.task4.model.Card;
import uz.epam.task4.model.Color;
import uz.epam.task4.validator.ColorValidator;

import java.util.ArrayList;
import java.util.List;

public class CardCreator {
    private static final Logger logger = LoggerFactory.getLogger(CardCreator.class);
    public Card makeCard(List<String> lines) {
        List<Ball> balls1 = new ArrayList<>();
        Card card = new Card();
        for (String line : lines) {
            if (line != null && !line.trim().isEmpty()) {
                String[] strings = line.split(" ");
                String firstLine = strings[0];
                String secondLine = strings[1];
                try {
                    if (ColorValidator.isExist(firstLine)){
                        Color color = Color.valueOf(firstLine);
                        double weight = Double.parseDouble(secondLine);
                        balls1.add(new Ball(color, weight));
                    }
                } catch (IllegalArgumentException ignored) {
                    logger.warn("NumberFormatException : {}", secondLine);
                }
            }
        }
        card.setBalls(balls1);
        return card;
    }
}
