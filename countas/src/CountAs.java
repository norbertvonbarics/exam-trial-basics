import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CountAs {

  public static void main(String[] args) {
    System.out.println(readFiles("./afile.txt"));
  }


  private static int readFiles(String fileName) {
    int counter = 0;
    List<String> rawLines = new ArrayList<>();
    List<String[]> splittedLines = new ArrayList<>();
    Path myPath = Paths.get(fileName);
    try {
      rawLines = Files.readAllLines(myPath);

    } catch (IOException ex) {
      System.out.println("not-a-file");
      return 0;
    }
    String lines = "";

    for (int i = 0; i < rawLines.size(); i++) {
      lines += rawLines.get(i);
    }

    for (int j = 0; j < lines.length(); j++) {
      splittedLines.add(lines.split(""));
    }

    System.out.println(lines);
    for (int k = 0; k < lines.length(); k++) {
      if (lines.substring(k, k + 1).equals("a")) {
        counter++;
      }
      System.out.println(lines.substring(k));
    }
    return counter;
  }
}

