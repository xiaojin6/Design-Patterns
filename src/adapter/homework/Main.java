package adapter.homework;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("E:\\Java\\Design-Patterns\\src\\adapter\\homework\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("E:\\Java\\Design-Patterns\\src\\adapter\\homework\\newfile.txt");
            System.out.print("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
