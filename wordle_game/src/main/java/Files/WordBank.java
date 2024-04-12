package Files;
import java.io.*;
import java.util.*;

public class WordBank {

    private ArrayList<String> wordBank = null;

    public void createWordBank(){
        //Set up the array
        wordBank = new ArrayList<String>();
        Scanner wordFile = null;

        //Mae sure it works and act opens file
        try{
            wordFile = new Scanner(new FileReader("wordle_game\\src\\main\\java\\Files\\5_Letter_Word_Bank.txt"));
        }
        catch (FileNotFoundException e){ 
            System.out.println("File not found");
            e.printStackTrace();
            System.exit(0);
        }

        String word;
        while(wordFile.hasNext())
        {
            word = wordFile.next();
            wordBank.add(word);
        }
        wordFile.close();
    }

    public String getWord (int indexNum){
        if(wordBank == null){
            createWordBank();
        }
        String word = wordBank.get(indexNum);
        System.out.println(word);
        return word;
    }
}
