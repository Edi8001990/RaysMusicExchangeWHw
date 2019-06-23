package Instruments;

public class Trumpet extends Instrument implements IPlay{
    private int valvesNumber;

    public Trumpet(String name, int valvesNumber){
        super(name);
        this.valvesNumber = valvesNumber;

    }

    public int getValvesNumber(){
       return this.valvesNumber;
    }


    public String play(String instrumentType) {
        return  "I'm playing music from " + instrumentType;
    }


}
