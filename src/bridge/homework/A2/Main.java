package bridge.homework.A2;

public class Main {
    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("E:\\Java\\Design-Patterns\\src\\bridge\\homework\\A2\\star.txt"));
        d.multiDisplay(3);
    }
}
