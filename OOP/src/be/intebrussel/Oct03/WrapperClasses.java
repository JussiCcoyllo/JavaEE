package be.intebrussel.Oct03;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 10;

        Integer numberInteger = 25;

        System.out.println("integer " + numberInteger + " int number "+ num);

        String result = numberInteger.toString();
        System.out.println(result.length());

        //1 Zet deze waardes om naar de vergelijkbare wrapper klas.

        int num1 = 10;
        Integer convertedInt = num1;
        System.out.println(convertedInt);

        double numberInDouble = 2.99;
        Double myDouble = numberInDouble;
        System.out.println(myDouble);

        char notAtNumber = 'j';
        Character newNotNumber = notAtNumber;
        System.out.println(newNotNumber);

        //02 Maak een primitieve float variabele aan en converteer deze naar een String. Tot slot print de lengte van deze string af.

        float myFloat= 37.0F;
        Float newFloat = myFloat;
        String resultFloat = newFloat.toString();
        System.out.println(resultFloat.length());

        //converter int to integer
        Double convertInt = numberInteger.doubleValue();
        System.out.println(convertInt);




    }
}
