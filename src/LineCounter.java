import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
  private String fileName;
  private Scanner scanner;
  private int numberOfLines;
  private StringBuilder fileContent;
  public LineCounter (String fileName) throws FileNotFoundException {
    this.fileName = fileName;
    this.numberOfLines = 0;
    this.open();
  }

  public void open () throws FileNotFoundException {
      scanner = new Scanner(new File(this.fileName));
  }

  public String readFile () {
    while (scanner.hasNextLine()) {
      fileContent.append(scanner.nextLine());
    }
    return fileContent.toString();
  }

  public int count () {
    while (scanner.hasNextLine()) {
      if (scanner.nextLine().length() > 0) {
        this.numberOfLines++;
      }
    }
    return this.numberOfLines;
  }

  public int countIfStatements (String fileString) {
    int numberOfIfStatements = 0;
    Scanner stringScanner = new Scanner(fileString);
    while (stringScanner.hasNextLine()) {
      String line = stringScanner.nextLine();
      if (line.contains("if")) {
        numberOfIfStatements++;
      }
    }
    stringScanner.close();
    return numberOfIfStatements;
  }
}
