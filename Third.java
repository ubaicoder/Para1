import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
