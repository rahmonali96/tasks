package uz.epam.task4.util;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.epam.task4.model.Ball;
import uz.epam.task4.model.Card;
import uz.epam.task4.model.Color;

import java.util.ArrayList;
import java.util.List;

public class CardCreator {
    private static final Logger logger = LoggerFactory.getLogger(CardCreator.class);
    public Card createBallsFromList(List<String> balls) {
        List<Ball> balls1 = new ArrayList<>();
        Card card = new Card();
        for (String ball : balls) {
            if (ball != null && !ball.trim().isEmpty()) {
                String[] strings = ball.split(" ");
                try {
                    Color color = Color.valueOf(strings[0]);
                    double weight = Double.parseDouble(strings[1]);
                    balls1.add(new Ball(color, weight));
                } catch (IllegalArgumentException ignored) {
                    logger.warn("Unknown type of color: {}, " +
                            "It's not double value : {}", strings[0], strings[1]);
                }
            }
        }
        card.setBalls(balls1);
        return card;
    }
}
