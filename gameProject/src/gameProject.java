
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Larose and Nick Dufresne
 */
public class gameProject {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        String wordsArray[] = {"car", "cat", "blue"};
        int choice = -1;
        choice = wordChoose(choice);
        String word=wordsArray[choice];
        System.out.println(word);
        char []lettersUnmixed= wordSplit(word);
        
        // Implementing Fisher–Yates shuffle
        char[] lettersMixed= shuffleLetters(lettersUnmixed);
        for (int i=0; i<lettersMixed.length; i++){
            System.out.println(lettersMixed[i]);
        }
    }
    /**
     * 
     * @param choice
     * @return 
     */
    public static int wordChoose(int choice){
        choice = (int) ((Math.random() * 3));
        return choice;
    }
    
    /**
     * 
     * @param word
     * @return 
     */
    public static char[] wordSplit(String word ){
        char[] lettersUnmixed= word.toCharArray();
        return lettersUnmixed;
    }
    
    /**
     * 
     * @param lettersUnmixed
     * @return 
     */
    static char[] shuffleLetters(char[] lettersUnmixed) {
        Random rnd = new Random();
        for (int i = lettersUnmixed.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            char a = lettersUnmixed[index];
            lettersUnmixed[index] = lettersUnmixed[i];
            lettersUnmixed[i] = a;
        }
        return lettersUnmixed;
    }
}
