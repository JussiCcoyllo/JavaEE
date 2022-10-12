package be.intecbrussel;

public class BreakContinue {

    public static void main(String[] args) {

        //Break stop the boucle at the condition "if"

        int money = 250;

        for (int index = 0; index < money + 1; index++){

            if (index == 100) {
                System.out.println("Wow I already lost 100 euros! ");
                break;
            }
            System.out.println(index);
        }

        //Continue don't stop the boucle but replace the value at condition if

        int day = 31;

        for (int index = 1; index < day + 1; index++) {
            if(index == 13) {
                System.out.println("I skip 13th day because it brings bad luck");
                continue;
            }
            System.out.println(index);
        }
    }
}
