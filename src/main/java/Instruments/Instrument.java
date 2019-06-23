package Instruments;

public abstract class Instrument{
    String name;
    String play;

    public Instrument(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}
