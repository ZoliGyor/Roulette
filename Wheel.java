import java.util.Random;

public class Wheel {
    private Number[] numbers = new Number[38];

    public Wheel()
    {
        numbers[0] = new Number("0", Colour.GREEN);
        numbers[1] = new Number("00", Colour.GREEN);
        for(int i = 2; i < numbers.length; i++){
            if(i == 2 || i == 4 || i == 6 || i == 8 || i == 10 || i == 13 || i == 15 || i == 17 || i == 19 || i == 22 || i == 24 || i == 26 || i == 28 ||
            i == 29 || i == 31 || i == 33 || i == 35 || i == 37){
                numbers[i] = new Number(String.valueOf(i-1), Colour.RED);
            }else{
                numbers[i] = new Number(String.valueOf(i-1), Colour.BLACK);
            }
        }
    }

    public void printOutNumbers()
    {
        for(int i = 0; i < numbers.length; i++){
            System.out.println("The number: " + numbers[i].getValue() + " and its colour: " + numbers[i].getColour());
        }
    }

    public void rollTheWheel()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(numbers.length);
        System.out.println("Rolling the wheel...");
        System.out.println("And the ball landed on: " + numbers[randomNumber].getValue() + " which has the colour of: " + numbers[randomNumber].getColour());
    }

}
