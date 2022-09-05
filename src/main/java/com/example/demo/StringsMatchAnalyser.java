package com.example.demo;

public class StringsMatchAnalyser {
    public String analyseMatch(String guess, String target) {

        String result = "";
            
        //converting strings to arrays      
//            char[] arrTarget = target.toCharArray();
//            char[] arrGuess = guess.toCharArray();
        
        //looping through both strings (arrays) and comparing them using a for loop
            for (int i = 0; i < 5; i++){
                char characterInGuess = guess.charAt(i);

                if (characterInGuess == target.charAt(i)) {
                    result += "2"; //use append?
                } else if (target.contains(String.valueOf(characterInGuess)) && (guess.indexOf(characterInGuess)==i)) {
                    result += "1"; //use append?
                } else {
                    result += "0"; //use append?
                }

            }

            return result;

    }
}