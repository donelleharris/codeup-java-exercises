package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLecture {
    public static void main(String[] args) throws IOException {
        String directoryName = "data";
        String fileName = "grocery_list.txt";
Path dataFilePath = FileIO.createDirectoryAndFile(directoryName, fileName);
        try {
            List<String> groceryList = Arrays.asList("milk", "eggs", "bacon");
            Files.write(dataFilePath, groceryList);
            FileIO.printFileContents(dataFilePath);


            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            FileIO.printFileContents(dataFilePath);

            FileIO.updateLine(dataFilePath, "milk", "whole milk");
            FileIO.printFileContents(dataFilePath);

            FileIO.deleteLine(dataFilePath, "bread");
            FileIO.printFileContents(dataFilePath);

        } catch (IOException ex){
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }
    }
}
