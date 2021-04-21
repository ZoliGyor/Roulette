public class Player {
    private int cash;
    private String name;

    public Player(String name)
    {
        cash = 1000;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setCash(int newAmount)
    {
        this.cash = newAmount;
    }

    public int getCash()
    {
        return this.cash;
    }
}
