
// Write a function that takes in a string of one or more words, and returns the same string, 
//but with all five or more letter words reversed. Strings passed in will consist of only letters
//and spaces. Spaces will be included only when more than one word is present.



public class Cadena {

    private static String test(String s){
        String[] split = s.split(" ");
        String frase = "";
        for(String word: split){
            if(word.length()>5){
                frase = frase +" " +  reverse(word);
            }else{
                frase = frase +" " + word;
            }
        }
        return frase;
    }
    
    private static String reverse(String str){
        String nstr="";
        char ch;
        for (int i=0; i<str.length(); i++){
        ch= str.charAt(i); 
        nstr= ch+nstr;
        }
        return nstr;
    }


}




//spinWords( "Este es el programa de entrenamiento" ) => returns "Este es el amargorp de otneimanertne"
//spinWords( "Este es un test") => returns "Este es un test"


