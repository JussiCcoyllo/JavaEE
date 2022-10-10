package be.intecbrussel;

public class StringExercise {
    public static void main(String[] args) {
        String name = "Joey";
        String lastName = new String("   de Kort   ");

        String result01 = name.toUpperCase();
        System.out.println(result01);

        String result02 = name.toLowerCase();
        System.out.println(result02);

        String resultTrim = lastName.trim();
        System.out.println(lastName);
        System.out.println(resultTrim);

        int resultLength = lastName.length();
        System.out.println("Lastname length : " + resultLength);

        String str01 ="";
        String str02 = " ";

        boolean resultIsBlank1 = str01.isBlank();
        System.out.println(resultIsBlank1);

        boolean resultIsBlank2 = str02.isBlank();
        System.out.println(resultIsBlank2);

        boolean resultIsBlank3 = name.isBlank();
        System.out.println(resultIsBlank3);

        boolean resultIsEmpty = str02.isEmpty();
        System.out.println(resultIsEmpty);

        String resultReplace = name.replace('y','i');
        System.out.println(resultReplace);

        String hi = "Hello world";
        String resultReplace1 = hi.replace('l','k');
        System.out.println(resultReplace1);

        String str = "     hi hi      ";
        String resStrip = str.strip();
        System.out.println(resStrip);

        String resStripLeading = str.stripLeading();
        System.out.println(resStripLeading);

        String resStripTrailing = str.stripTrailing();
        System.out.println(resStripTrailing);

        String str3 = "Hello hi everybody";
        System.out.println(str3.indexOf("everybody"));

        System.out.println(str3.contains("Hello hi"));

        System.out.println(str3.substring(6,15));

        //Oefeningen 1
        String word = "Java Exercises!";
        System.out.println(word.substring(5,15));

        String friends = "walter, edwin, mike";
        System.out.println(friends.contains("edwin"));

        //Samenvatting

        System.out.println("Oefening");
        String text = "Exercises Java";
        System.out.println(text.substring(0,9));

        String hw = "hello world";
        System.out.println(hw.replace("hello world","HeLlo WoRlD"));

        String mx = "The Quick BroWn FoX!";
        System.out.println(mx.toLowerCase());








    }
}
