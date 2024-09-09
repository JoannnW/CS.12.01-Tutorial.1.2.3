import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        char[] chars=word.toCharArray();
        char temp;
        for (int i=0;i<chars.length-1;i++){
            if (chars[i] == 'A' && chars[i+1] != 'A'){
                temp = chars[i];
                chars[i] = chars[i+1];
                chars[i+1] = temp;
                i++;//cuz i and i+1 have already been swapped
            }
        }
        return new String(chars);
    }
    public static void scrambleOrRemove(List<String> wordList){
        List<String>wordsToRemove = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++){
            String scrambledWord = scrambleWord(wordList.get(i));
            if (scrambledWord.equals(wordList.get(i))){
                wordsToRemove.add(wordList.get(i));
            }else{
                wordList.set(i,scrambledWord);
            }
        }
        wordList.removeAll(wordsToRemove);
    }
}
