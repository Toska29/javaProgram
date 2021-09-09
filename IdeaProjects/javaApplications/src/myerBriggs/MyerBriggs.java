package myerBriggs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyerBriggs {
    private String[][] answers;
    private int[][] results;
    private String[] character;

    public static void main(String[] args) {
        System.out.println("MYERS BRIGGS QUESTIONNAIRE");
        System.out.println("Instruction: Answer A or B for each question");
        MyerBriggs myerBriggs = new MyerBriggs();
        myerBriggs.setAnswers();
        myerBriggs.setResults();
        myerBriggs.setCharacter();
        myerBriggs.displayTable();
        System.out.printf("%s%n", "KEYS: ");
        String key = """
                E -> Extrovert
                I -> Introvert
                S -> Sensing
                N -> Intuition
                T -> Thinking
                F -> Feeling
                J -> Judging
                P -> Perceiving
                """;
        System.out.printf("%s", key);
    }

    public String[][] createQuestion() {
        String[][] questions = new String[5][4];
        questions[0][0] = "expend energy, enjoy groups | Conserve energy, enjoy one-on-one";
        questions[0][1] = "Interpret literally | Look for meaning and possibilities ";
        questions[0][2] = "Logical, thinking, questioning | empathetic, feeling, accommodating";
        questions[0][3] = "organized, orderly | flexible, adaptable";
        questions[1][0] = "more outgoing, think out loud | more reserved, think to yourself";
        questions[1][1] = "practical, realistic, experiential | imaginative, innovative, theoretical";
        questions[1][2] = "candid, straight forward, frank | tactful, kind, encouraging";
        questions[1][3] = "plan, schedule | unplanned, spontaneous";
        questions[2][0] = "seek many tasks, public activities, interaction with others | seek private, solitary activities with quiet to concentrate";
        questions[2][1] = "standard, usual, conventional | different, novel, unique";
        questions[2][2] = "firm, tend to criticize, hold the line | gentle, tend to appreciate, conciliate";
        questions[2][3] = "regulated, structured | easygoing, \"live\" and \"let live\"";
        questions[3][0] = "external, communicative, express yourself | internal, reticent, keep to yourself";
        questions[3][1] = "focus on here-and-now | look to the future, global perspective, \"big picture\"";
        questions[3][2] = "tough-minded, just | tendered-hearted, merciful";
        questions[3][3] = "preparation, plan ahead | go with the flow, adapt as you go";
        questions[4][0] = "active, initiate | reflective, deliberate";
        questions[4][1] = "facts, things, \"what is\" |ideas, dreams, \"what could be\", philosophical";
        questions[4][2] = "matter of fact, issue-oriented | sensitive, people-oriented, compassionate";
        questions[4][3] = "control, govern | latitude, freedom";

        return questions;
    }

    public void setAnswers(){
        answers = new String[5][4];
        String[][] questions = createQuestion();
        int counter = 1;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            for(int j = 0; j < questions[0].length; j++){
                System.out.printf("%20s%20s%n", "A", "B");
                System.out.print(counter++ + ". ");
                System.out.println(questions[i][j]);
                    String response = input.next();
                    answers[i][j] = response;
            }
            System.out.println();
        }
    }
    public String[][] getAnswers(){
        return answers;
    }

    public void setResults(){
        int firstLetterCounter = 0;
        int secondLetterCounter = 0;
        results = new int[4][2];
        String[][] previousAnswers = getAnswers();
        for (int j = 0; j < previousAnswers[0].length; j++) {
            for (int i = 0; i < previousAnswers.length; i++) {
                String alphabet = previousAnswers[i][j];
                switch (alphabet){
                    case "A":
                        ++firstLetterCounter;
                        results[j][0] = firstLetterCounter;
                        break;
                    case "B":
                        ++secondLetterCounter;
                        results[j][1] = secondLetterCounter;
                }
            }
            firstLetterCounter = 0;
            secondLetterCounter = 0;
        }
    }

    public int[][] getResults(){
        return results;
    }

    public String[][] createGroupOfCharacters(){
        String[][] groupOfCharacters = new String[4][2];
        groupOfCharacters[0][0] = "E";
        groupOfCharacters[0][1] = "I";
        groupOfCharacters[1][0] = "S";
        groupOfCharacters[1][1] = "N";
        groupOfCharacters[2][0] = "T";
        groupOfCharacters[2][1] = "F";
        groupOfCharacters[3][0] = "J";
        groupOfCharacters[3][1] = "P";
        return groupOfCharacters;
    }
    public void setCharacter(){
        int highestFrequency = 0;
        String[][] characters = createGroupOfCharacters();
        int[][] results = getResults();
        character = new String[4];
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[0].length; j++) {
                if(results[i][j] > highestFrequency){
                    highestFrequency = results[i][j];
                }
            }
            for (int j = 0; j < results[0].length; j++) {
                if(results[i][j] == highestFrequency){
                    character[i] = characters[i][j];
                }
            }
            highestFrequency = 0;
        }

    }

    public String[] getCharacter(){
        return character;
    }
    public void displayTable(){
        int questionCounter = 0;
        int[][] results = getResults();
        String[][] answers = getAnswers();
        String[][] groupOfCharacters = createGroupOfCharacters();
        String[] character = getCharacter();
        System.out.printf("%n%s%n", "=".repeat(42));
        for (int i = 0; i < 4; i++) {
            System.out.printf("%5s%s%4s", "", "A", "B");
        }
        System.out.printf("%n%s%n", "=".repeat(42));
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[0].length; j++) {
                System.out.printf("%2d. ", ++questionCounter);
                if(answers[i][j].equals("A")) {
                    System.out.printf(" %s   %2s", answers[i][j], "");
                }
                if(answers[i][j].equals("B")) {
                    System.out.printf("    %s%2s", answers[i][j], "");
                }
            }
            System.out.println();
        }
        System.out.println("-".repeat(42));
        System.out.printf("%s ", "SUM:");
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[0].length; j++) {
                System.out.printf("%d%4s", results[i][j], "");
            }
        }
        System.out.println();
        System.out.printf("%s%n%5s",  "-".repeat(42), "");
        for (int i = 0; i < groupOfCharacters.length; i++) {
            for (int j = 0; j < groupOfCharacters[0].length; j++) {
                System.out.printf("%s%4s", groupOfCharacters[i][j], "");
            }
        }
        System.out.printf("%n%s%n", "=".repeat(42));
        System.out.printf("%s", "=>");
        for (int i = 0; i < character.length; i++) {
            System.out.printf("%7s%3s", character[i], "");
        }
        System.out.printf("%n%s%n", "=".repeat(42));
    }
}