package uz.epam.task4.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private File file;

    public DataReader() {
    }

    public DataReader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<String> extractLines() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lines.add(line);
        }
        return lines;
    }
}
