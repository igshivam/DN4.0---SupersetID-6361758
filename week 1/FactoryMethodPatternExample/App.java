import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Which document do you want to create?");
        System.out.println("Press 1 for Word Document\nPress 2 for Excel Document\nPress 3 for PDF Document: ");
        try (Scanner input = new Scanner(System.in)) {
            int choice = input.nextInt();
            switch (choice) {
                case 1 ->                 {
                    DocumentFactory factory = new FactoryWord();
                    factory.createDocument();
                }
                case 2 ->                 {
                    DocumentFactory factory = new FactoryExcel();
                    factory.createDocument();
                }
                case 3 ->                 {
                    DocumentFactory factory = new FactoryPdf();
                    factory.createDocument();
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        System.out.println("Document creation process completed.");
    }
}


