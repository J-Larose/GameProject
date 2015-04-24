/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stone_000
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
        
    }
    
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
}
