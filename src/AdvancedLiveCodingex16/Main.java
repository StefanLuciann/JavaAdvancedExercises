package AdvancedLiveCodingex16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read any file and save it in the same folder.
 * The content and title of the new file should be reversed (from the back).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\400HP\\IdeaProjects\\JavaAdvancedLiveCoding\\Resources\\File.txt");
        reverseFile(path);

    }

    public static void reverseFile(Path path) throws IOException {
        List<String> fileContent = Files.readAllLines(path);
        String fileName = path.getFileName().toString();

        String newFileName = reverseString(fileName);
        List<String> newFileContent = fileContent.stream()
                .map(line -> reverseString(line))
                .collect(Collectors.toList());
        Collections.reverse(newFileContent);

        Path parentFolder = path.getParent();
        Path newFilePath = parentFolder.resolve(newFileName);
        if (!Files.exists(newFilePath)) {
            Files.createFile(newFilePath);
            Files.write(newFilePath, newFileContent);
        }
    }

    public static String reverseString(String phrase) {
        String reversedString = "";
        for (int i = phrase.length() - 1; i >= 0; i--) {
            reversedString = reversedString + phrase.charAt(i);
        }
        return reversedString;
    }
}
