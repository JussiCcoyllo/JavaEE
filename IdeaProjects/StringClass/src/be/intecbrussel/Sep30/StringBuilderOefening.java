package be.intecbrussel;

public class StringBuilderOefening {

    public static void main(String[] args) {

        //1
        StringBuilder firstLine = new StringBuilder("This is my first string ");
        StringBuilder secLine = new StringBuilder("This is my second string");

        //2
        firstLine.append("for today");
        System.out.println(firstLine);

        //3
        secLine.reverse();
        System.out.println(secLine);

        //4
        String withOutSpaces = firstLine.toString();
        withOutSpaces = withOutSpaces.replaceAll(" ", "");
        System.out.println(withOutSpaces);

        //5
        secLine.delete(4,10);
        System.out.println(secLine);

        //6
        StringBuilder strEmpty = new StringBuilder("Hello everybody");

        if(strEmpty.length() == 0) {
            System.out.println("The text is empty");
        } else {
            System.out.println("The text is not empty");
        }
    }
}
