import java.util.Scanner;
import java.io.File;


public class App {
    public static void main(String[] args) {
        // Consider another variable name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = scanner.nextLine();
        scanner.close();
        System.out.println(fileName);
        File file = new File(fileName);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file, "utf-8");
        } catch (Exception e) {
            System.err.println(e.toString());
          }
          int numberOfLines = 0;
        while (fileReader.hasNextLine()) {
            fileReader.nextLine();
            numberOfLines++;
        }
        System.out.println("Number of lines in document " + fileName + " is " + numberOfLines);
        fileReader.close();
    }
}