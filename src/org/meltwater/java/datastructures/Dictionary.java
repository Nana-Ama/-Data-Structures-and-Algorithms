package org.meltwater.java.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;


class Dictionary {
    public static StringBuilder containsString(String sentence) {
        String thisLine = null;
        // initialize stringbuilder to append our results
        StringBuilder sb = new StringBuilder();
        // Size of the array is 24000 because the number of words in the dictionary
        // is 23543 which is close to 24000
        String[] mainArray = new String[24000];
        // Here am splitting the words in the sentence using "\\s+" which is 
        // a regular expression
        String[] words = sentence.split("\\s+");
        
        try {
            int i = 0;
            // I have a file on my desktop called dict.txt which i have pasted 
            // the dictionary words. I am creating a new file from it.
            File file = new File("/home/mest/Desktop/dict.txt");

            // Here i am reading the file and if the file is not empty or null
            // i am storing in inside mainArray
            BufferedReader in = new BufferedReader(new FileReader(file));
            while ((thisLine = in.readLine()) != null) {
                mainArray[i] = thisLine;
                i++;

            }

        } catch (Exception e) {
        }

        // Here i am checking if the mainArray contains the words i split from the sentence
        // And i am appending the result to sb which is the String builder (for building strings)
        for (int i = 0; i < words.length; i++) {
            if (Arrays.asList(mainArray).contains(words[i])) {
                sb.append("Correct word: ").append(words[i]).append("\n");
            } else {
                sb.append("Mispelled Word: ").append(words[i]).append("\n");
                
            }
        }

        // Finally i am returning the sb
        return sb;
    }

}