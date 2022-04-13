package uz.epam.task4.service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uz.epam.task4.model.Ball;
import uz.epam.task4.model.Card;
import uz.epam.task4.model.Color;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CardServiceTest {
    Card card;
    CardService cardService;

    @BeforeMethod
    public void setUp() {
        card = new Card();
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Color.BLACK, 5));
        balls.add(new Ball(Color.WHITE, 6));
        balls.add(new Ball(Color.BLACK, 7));
        balls.add(new Ball(Color.BLUE, 8));
        balls.add(new Ball(Color.WHITE, 9));
        balls.add(new Ball(Color.BLACK, 10));
        card.setBalls(balls);
        cardService = new CardService(card);
    }

    @Test
    public void testGetWeightByColor() {
        double actual = cardService.getWeightByColor(Color.BLACK);
        double expected = 22;
        assertEquals(actual, expected);
    }

    @Test
    public void testGetQuantityByColor() {
        long actual = cardService.getQuantityByColor(Color.WHITE);
        long expected = 2;
        assertEquals(actual, expected);

    }
}