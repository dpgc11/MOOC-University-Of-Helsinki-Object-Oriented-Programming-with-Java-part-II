package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception{
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection inspect = new WordInspection(file);
        System.out.println(inspect.wordCount());
        System.out.println(inspect.wordsContainingZ());
        System.out.println(inspect.wordsEndingInL());
        System.out.println(inspect.palindromes());
        System.out.println(inspect.wordsWhichContainAllVowels());
               
        
    }
}
