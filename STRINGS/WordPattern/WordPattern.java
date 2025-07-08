import java.util.*;
public class WordPattern {
    public boolean WordPattern(String pattern, String s){

        String[] words= s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }


        HashMap<Character,String> mapCharToWord = new HashMap<>();
        HashMap<String,Character> mapWordToChar = new HashMap<>();


        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word= words[i];
            
            if(mapCharToWord.containsKey(ch)){
                if(!mapCharToWord.get(ch).equals(word)){
                    return false;
                
                }

            }else{
                if(mapWordToChar.containsKey(word)){
                    return false;
                }

                mapCharToWord.put(ch,word);
                mapWordToChar.put(word,ch);
            }

        }
        return true ;
    }
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();
        System.out.println(sol.WordPattern("abba", "dog cat cat dog"));  // true
        System.out.println(sol.WordPattern("abba", "dog cat cat fish")); // false
        System.out.println(sol.WordPattern("aaaa", "dog cat cat dog"));  // false
    }

    
}
