public class Wheel {
    private String[] numbers = new String[38];

    public Wheel()
    {
        numbers[0] = "0";
        numbers[1] = "00";
        for(int i = 2; i < numbers.length; i++){
            numbers[i] = String.valueOf(i-1);
        }
    }

    public void printOutNumbers()
    {
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public String[] getNumbers()
    {
        return numbers;
    }
}
