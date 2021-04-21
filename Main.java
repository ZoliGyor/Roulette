import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wheel roulette = new Wheel();
        System.out.println("Welcome to my game of roulette! First of all, how may I call you?");
        Scanner scanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int odds;
        int currentBet;
        Player player = new Player(input);
        System.out.println("Welcome " + input + "!");
        while(!input.equals("quit")){
            System.out.println("Your current money: " + player.getCash());
            System.out.println("What would you like to do? \nTo look at the table write: look\nTo bet on a condition write: bet\nTo quit write: quit");
            input = scanner.nextLine();
            if(input.equals("look")){
                roulette.printOutNumbers();
            }else if(input.equals("bet")){
                System.out.println("How much money would you like to bet?");
                currentBet = numberScanner.nextInt();
                player.setCash(player.getCash() - currentBet);
                System.out.println("What would you like to bet on? \nTo bet on a single number write: single\nTo bet on low numbers (1-18) write: low");
                System.out.println("To bet on high numbers (19-38) write: high\nTo bet on Red numbers write: red\nTo bet on black numbers write: balck");
                System.out.println("To bet on even numbers write: even\nTo bet on odd numbers write odd");
                input = scanner.nextLine();
                if(input.equals("single")){
                    System.out.println("What number would you like to choose?");
                    input = scanner.nextLine();
                    if(input.equals(roulette.rollTheWheelForNumbers())){
                        System.out.println("Congratulations! You won 35 times the amount of your bet! This means: " + (currentBet*35) + " pounds");
                        player.setCash(player.getCash() + (currentBet*35));
                    }else{
                        System.out.println("Awwww, you lost this round");
                    }
                }else if(input.equals("low")){
                    Integer numberAfterTheRoll = Integer.valueOf(roulette.rollTheWheelForNumbers());
                    if(numberAfterTheRoll < 18 && numberAfterTheRoll > 0){
                        System.out.println("Congratulations! You won 2 times the amount of your bet! This means: " + (currentBet*2) + " pounds");
                        player.setCash(player.getCash() + (currentBet*2));
                    }else{
                        System.out.println("Awwww, you lost this round");
                    }
                }
            }
        }
        System.out.println("Thank you for playing! In the end you had " + player.getCash() + " pounds.");
    }
}
