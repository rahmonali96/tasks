package uz.epam.task4.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FileCreator {
    private final Path path;

    public FileCreator() {
        this.path = Path.of("C:\\Users\\user\\Desktop\\Projects\\tasks\\src\\main\\resources");
    }

    public File createFile(String name) throws IOException {
        return Files.createFile(path.resolve(name)).toFile();
    }

    public File getFile(String name) throws IOException {
        Path path1 = path.resolve(name);
        return Files.list(path).filter(path -> path.equals(path1)).findFirst().orElseThrow().toFile();
    }
}
