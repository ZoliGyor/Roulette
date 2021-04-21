import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wheel roulette = new Wheel();
        roulette.printOutNumbers();
        roulette.rollTheWheel();
        System.out.println("Welcome to my game of roulette! First of all, how may I call you?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Player player = new Player(input);
        System.out.println("Welcome " + input + " !");
        while(!input.equals("quit")){
            System.out.println("What would you like to do? \nTo look at the table write: look\nTo bet on a condition write: bet\nTo quit write: quit");
            input = scanner.nextLine();
        }
    }
}
