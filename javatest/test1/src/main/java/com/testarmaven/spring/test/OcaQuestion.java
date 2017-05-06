package com.testarmaven.spring.test;

import java.util.Scanner;

public class OcaQuestion {
    public String[][] answers = new String[][]{{"'A. == ', 'B. +', 'C. --', 'D. !', 'E. %', 'F. <='", "asdf", "asdf"},
            {"'Array 1 postion 2'", "'Array 1 postion 2'", "'Array 1 postion 2'"},
            {"'Array 1 postion 3'", "'Array 1 postion 2'", "'Array 1 postion 2'"}};
    public String answer;
    String message;
    String[] facit = new String[3];
    Scanner reader = new Scanner(System.in);
    String[] questions = {"Which of the following Java operators can be used with boolean variables? (Choose all that apply)",
            "What data type (or types) will allow the following code snippet to compile? (Choose all that apply)",
            "What is the output of the following application?"
    };


    public String facitFetcher(int facitId) {
        facit[0] = "A";
        facit[1] = "B";
        facit[2] = "C";
        return facit[facitId];
    }

    public void testShower() {

        int i = 0;
        while (i <= 2) {
            System.out.println(questions[i]);
            System.out.println(answers[i][i]);
            System.out.println(anwserValidator(answer = reader.next().toUpperCase(), i));
            ++i;
        }

    }

    public String anwserValidator(String answer, int option) {

        if (answer.equals(facitFetcher(option))) {
            message = "Right";
        } else {
            message = "Wrong";
        }
        return message;
    }

}
