package org.meltwater.java.datastructures;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpellChecker {

    public static void main(String[] args) throws IOException {

      // Here i am creating a new object from the Dictionary class
      Dictionary dictionary = new Dictionary();

      // Am creating a sample sentence
      String sentence = "Nana is awesome";

      // I am calling the containsString method in the Dictionary class and then
      // passing the sample sentence
      StringBuilder res = dictionary.containsString(sentence);

      // then i print out the results
      System.out.println(res);
    }
    
}