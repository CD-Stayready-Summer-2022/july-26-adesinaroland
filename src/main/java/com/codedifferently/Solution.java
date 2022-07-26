package com.codedifferently;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> wordCount = new TreeMap<>();

        char[] charArr = input.toCharArray();

        for (Character character : charArr){
            if(!wordCount.containsKey(character))
                wordCount.put(character, 1);
            else{
                int count = wordCount.get(character);
                wordCount.put(character, count + 1);
            }
        }


        return null;
    }
}
