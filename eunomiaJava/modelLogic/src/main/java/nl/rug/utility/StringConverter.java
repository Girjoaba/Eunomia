package nl.rug.utility;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

/**
 * A utility class that helps with converting different formats to strings.
 */
public class StringConverter {

    /**
     * Transforms the contents of a txt file to a string.
     * @param fileName the file name located in the resource folder
     * @return the string
     * @throws FileNotFoundException if the file is not found in the resource folder
     */
    public static @NotNull String getStringFromTXT(String fileName) throws FileNotFoundException {
        ClassLoader classLoader = StringConverter.class.getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());

        StringBuilder fileContents = new StringBuilder((int)file.length());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine()).append(System.lineSeparator());
        }
        scanner.close();

        return fileContents.toString();
    }
}
