import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
  private String fileName;
  private Scanner scanner;
  private int numberOfLines;
  public LineCounter (String fileName) throws FileNotFoundException {
    this.fileName = fileName;
    this.numberOfLines = 0;
    this.open();
  }

  public void open () throws FileNotFoundException {
      scanner = new Scanner(new File(this.fileName));
  }

  public int count () {
    while (scanner.hasNextLine()) {
      this.numberOfLines++;
      scanner.nextLine();
    }
    return this.numberOfLines;
  }
}
