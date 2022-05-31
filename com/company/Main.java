package com.company;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	 // The solution colors will be represented using colors: G - Green, Y - Yellow, B - Black. The same rules apply as they do in real game.
    String [] user_grade = gradeUserInput("angry");
    System.out.println(String.join("", user_grade));

    }

    public static String [] gradeUserInput (String user_input) {
        // Word of the day
        String word = "WEARY";

        List<String> char_list = Arrays.asList(word.split(""));
        String [] answer = user_input.toUpperCase().split("");
        String [] solution_response = new String [word.length()];

        for (int index = 0; index < answer.length; index++) {

            if (char_list.contains(answer[index])) {
             solution_response[index] = ( char_list.get(index).equals(answer[index]) ) ? "G" : "Y" ;
            } else {
              solution_response[index] = "B";
            }
        }

       return solution_response;
    }
}
