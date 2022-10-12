package be.intecbrussel;


public class Search {
    //properties
    private String myWord;
    private int numOfVowels=0;

    //constuctors
     public Search(String myWord){
         this.myWord = myWord;
     }

    //getters and setters

    public String getMyWord() {
         myWord = myWord;
        return this.myWord;
    }

    public void setMyWord(String myWord) {
        this.myWord = myWord;
    }

    //methodes

    public void countVowels(){

         for(int i = 0; i < myWord.length(); i++){
             if(myWord.toLowerCase().charAt(i) == 'a' || myWord.toLowerCase().charAt(i) == 'e'  || myWord.toLowerCase().charAt(i) == 'i' || myWord.toLowerCase().charAt(i) == 'o' || myWord.toLowerCase().charAt(i) == 'u') {
                 numOfVowels++;
             }
         }
        System.out.println(numOfVowels);
    }
}
