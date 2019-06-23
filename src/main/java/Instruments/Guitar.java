package Instruments;

public class Guitar extends Instrument implements IPlay{


    private int stringsNumber;

    public Guitar(String name, int stringsNumber) {
        super(name);

        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber(){
        return this.stringsNumber;
    }


    public String play(String instrumentType) {
        return "I'm playing music from " + instrumentType;
    }
}
