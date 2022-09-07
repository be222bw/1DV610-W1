import java.util.Scanner;
import java.io.FileNotFoundException;


public class App {
    public static void main(String[] args) {
        // Consider another variable name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter file name: ");
        String fileName = scanner.nextLine();
        scanner.close();
        LineCounter lc = null;
        try {
            lc = new LineCounter(fileName);
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
        int numberOfLines = lc.count();
        System.out.println("Number of non-empty lines: " + numberOfLines + ".");
    }
}