package com.company;

public class Main {

    public static void main(String[] args) {
	 // The solution colors will be represented using colors: G - Green, Y - Yellow, B - Black. The same rules apply as they do in the real game.
    String [] user_grade = gradeUserInput("angry");
    System.out.println(String.join("", user_grade));

    }

    public static String [] gradeUserInput (String user_input) {
        // Word of the day
        String word = "WEARY";
        String answer = user_input.toUpperCase();
        String [] solution_response = new String [word.length()];

        for (int index = 0; index < answer.length(); index++) {

            if (word.contains(String.valueOf(answer.charAt(index)))) {
             solution_response[index] = ( word.charAt(index) == answer.charAt(index) ) ? "G" : "Y" ;
            } else {
              solution_response[index] = "B";
            }
        }

       return solution_response;
    }
}
