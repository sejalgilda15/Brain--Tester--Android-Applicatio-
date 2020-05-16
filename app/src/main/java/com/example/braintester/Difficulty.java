package com.example.braintester;

public class Difficulty {

      private static String operator;
      private static int noOfQuestions=10;
      private static int difficultyLevel=50;

    public static String getOperator() {
        return operator;
    }

    public static void setOperator(String operator) {
        Difficulty.operator = operator;
    }

    public static int getNoOfQuestions() {
        return noOfQuestions;
    }

    public static void setNoOfQuestions(int noOfQuestions) {
        Difficulty.noOfQuestions = noOfQuestions;
    }

    public static int getDifficultyLevel() {
        return difficultyLevel;
    }

    public static void setDifficultyLevel(int difficultyLevel) {
        Difficulty.difficultyLevel = difficultyLevel;
    }
}
