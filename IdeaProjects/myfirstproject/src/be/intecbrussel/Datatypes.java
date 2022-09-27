package be.intecbrussel;

public class Datatypes {

    public static void main(String[] args){
        byte myByte = 10;
        byte mySecondByte = 90;
        int result = myByte + 2;

        short  myShort = 400;
        short mySecondShort = 300;
        int shortResult = myShort + mySecondShort;

        long myLong = 223546464564L;

        float myFloat = 4.66666666665F;
        double myDouble = 2.8888888888888;


        System.out.println(myFloat);
        System.out.println(myDouble);

        boolean myBoolean = true;
        boolean myBoolean2 = false;
        myBoolean = myShort > 200;

        char myChar = 'i';
        System.out.println(myChar);

        System.out.println(myBoolean);
    }
}
