package AdvancedLiveCodingex17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Write a program that will display all photos (.png, .jpg) in a given directory and subdirectories.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\poze");
        displayAllPhotosNames(path);
    }

    public static void displayAllPhotosNames(Path path) throws IOException {
        Files.list(path).forEach(childPath -> {
            if (Files.isDirectory(childPath)) {
                try {
                    displayAllPhotosNames(childPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                if (childPath.getFileName().toString().toLowerCase().endsWith(".png") || childPath.getFileName().toString().toLowerCase().endsWith(".jpg")) {
                    System.out.println(childPath);
                }

            }
        });
    }
}
