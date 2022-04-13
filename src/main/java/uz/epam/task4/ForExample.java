package uz.epam.task4;

import uz.epam.task4.model.Card;
import uz.epam.task4.model.Color;
import uz.epam.task4.util.CardCreator;
import uz.epam.task4.service.CardService;
import uz.epam.task4.util.DataReader;
import uz.epam.task4.util.FileCreator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ForExample {
    public static void main(String[] args) throws IOException {
        FileCreator fileCreator = new FileCreator();
        File file = fileCreator.getFile("ball.txt");
        DataReader dataReader = new DataReader(file);
        try {
            List<String> list = dataReader.extractLines();
            CardCreator cardCreator = new CardCreator();
            Card card = cardCreator.makeCard(list);
            CardService cardService = new CardService(card);
            System.out.println(cardService.getQuantityByColor(Color.BLACK));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
