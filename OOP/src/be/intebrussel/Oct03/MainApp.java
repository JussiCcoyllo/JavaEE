package be.intebrussel;

public class MainApp {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("");


//        if (sb1.length() == 0) {
//            System.out.println("Empty");
//        } else {
//            System.out.println("Not Empty");
//        }
//        sb1.append("hi");
//        if (sb1.length() == 0) {
//            System.out.println("Empty");
//        } else {
//            System.out.println("Not Empty");
//        }
//
//        String str01 = "Hi";
//        String str02 = "Hello";
//        String str03 = "Hi";
//        String str04 = new String("Hi");
//
//
//        System.out.println(str01 == str03);
//        System.out.println(str01 == str04); // false because an object is, dus need a methode equal:
//        System.out.println(str01.equals(str04));

        //1

        String str = "a";
        String str1 = "123";
        String str2 = "55.99";
        String str3 = "false";

        Character c = 'a';
        Integer i = new Integer(123);
        Float f = new Float(55.99);
        Boolean b = new Boolean(false);

        System.out.println(!str.equals(c));
        System.out.println(!str1.equals(i));
        System.out.println(!str2.equals(f));
        System.out.println(!str3.equals(b));



    }
}
