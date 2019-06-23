package Instruments;

public class Piano extends Instrument implements IPlay{

    private int keysNumber;

    public Piano(String name, int keysNumber){
        super(name);
        this.keysNumber = keysNumber;

    }

    public int getKeysNumber(){
        return this.keysNumber;
    }

    public String play(String instrumentType){
        return "I'm playing music from " + instrumentType;
    }


}
