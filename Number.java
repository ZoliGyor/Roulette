public class Number {

    private String value;
    private Colour colour;

    public Number(String value, Colour colour)
    {
        this.value = value;
        this.colour = colour;
    }

    public String getValue(){
        return this.value;
    }
      
    public Colour getColour(){
        return this.colour;
    }

}
