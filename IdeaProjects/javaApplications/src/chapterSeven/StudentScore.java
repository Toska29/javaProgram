package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScore {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudent = input.nextInt();

        System.out.println("Enter the number of subjects offered by student: ");
        int numberOfSubject = input.nextInt();

        double [][] studentRecord = new double[numberOfStudent][numberOfSubject];
        for(int row = 0; row < numberOfStudent; row++){
            System.out.println("Enter the score for each subject offered by student " + (row + 1));
            for(int column = 0; column < numberOfSubject; column++){
                System.out.println("Enter score for subject " + (column + 1));
                double scores = input.nextDouble();
                studentRecord[row][column] = scores;
            }
            System.out.println();
        }
        studentRecordHeader(studentRecord);
        System.out.println();
        studentRecordFormation(studentRecord);

        subjectTotalScoreFooter(studentRecord);
        System.out.println("\n".repeat(1));
        System.out.println("Overall highest Scoring student");
        highestScoringStudent(studentRecord);
        System.out.println(" ");
        System.out.println("Overall lowest Scoring student");
        lowestScoringStudent(studentRecord);
        System.out.println(" ");
        highestScoringStudentPerSubject(studentRecord);
        System.out.println(" ");
        lowestScoringStudentPerSubject(studentRecord);
        System.out.println(" ");
        displayHardestSubject(studentRecord);
        System.out.println(" ");
        displayEasiestSubject(studentRecord);
        System.out.println(" ");
        totalAndAverageClassScore(studentRecord);

    }


    public static void subjectTotalScoreFooter(double[][] arrays){
        double total = 0;
        double averageCounter = 0;
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("=".repeat(35));
        }
        System.out.println();
        System.out.printf("%s","Total");
         double[] eachSubjectScoreTotal = calculateTotalScoresOfSubject(arrays);
        for(int i = 0; i < eachSubjectScoreTotal.length; i++){
            System.out.printf("%10s%.1f"," ",eachSubjectScoreTotal[i]);
        }
        for(double[]row:arrays){
            for(double column: row){
                total+=column;
                averageCounter+=1;
            }
        }
        System.out.printf("%12s%.1f%12s%.1f", " ", total, " ", total/averageCounter);
    }

    public static void studentRecordHeader(double [][] arrays){
        System.out.println("TABLE SHOWING STUDENT SCORES IN VARIOUS SUBJECTS");
            for (int column = 0; column < arrays[0].length; column++) {
                System.out.printf("%16s%d", "Sub ", (column + 1));
            }
        System.out.printf("%15s%15s%14s", "Total","Average","Position");
        System.out.println();
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("=".repeat(35));
        }
    }

    public static void studentRecordFormation(double [][] arrays){
        double [] average = calculateAverageScoreOfStudent(arrays);
        double [] total = summationOfStudentScores(arrays);
        int[] position = position(arrays);
        for(int row = 0; row < arrays.length; row++){
            System.out.printf("Student %d", (row +1));
           for(int column = 0; column < arrays[row].length; column++){
               System.out.printf("%5s%.1f%7s", "", arrays[row][column], " ");

           }
            System.out.printf("%6s%.1f","",total[row]);
            System.out.printf("%10s%.1f", "", average[row]);
            System.out.printf("%10d", position[row]);

            System.out.println();
        }

    }

    public static double[] summationOfStudentScores(double [][] arrays){
        double [] arrayTotal = new double[arrays.length];
        double total = 0;
        for(int row = 0; row < arrays.length; row++ ) {
            for (int column = 0; column < arrays[row].length; column++) {
                total += arrays[row][column];
            }
            arrayTotal[row] = total;
            total = 0;
        }
        return arrayTotal;
    }

    public static double [] calculateAverageScoreOfStudent(double [][] arrays){
        double [] arrayAverage = new double[arrays.length];
        double average = 0;
        double [] total = summationOfStudentScores(arrays);
        for(int i = 0; i < arrays.length; i++){
            average = total[i] / arrays[i].length;
            arrayAverage[i] = average;
        }
        return arrayAverage;
    }
    public static void displayTotalAndAverage(double [][] arrays){
        double [] average = calculateAverageScoreOfStudent(arrays);
        double [] total = summationOfStudentScores(arrays);
        int i = 0;
        for(; i < total.length; i++ ){
            System.out.print("Student" + (i+1) +"\t" + total[i] + "\t\t" );
            System.out.print(average[i]);
           System.out.println();
        }
    }

    public static void highestScoringStudent(double [][] arrays){
        double[] average = calculateAverageScoreOfStudent(arrays);
        double[] total = summationOfStudentScores(arrays);
        double maximum = Integer.MIN_VALUE;
        double studentScore = 0;
        int student = 0;
        for (int i = 0; i < average.length; i++){
            if (average[i] > maximum){
                maximum = average[i];
                studentScore = total[i];
                student = i + 1;
            }

        }

        System.out.printf("%s%d%s%n%s%.1f%n%s%.1f%n", "Student ", student, " is the highest scoring student:", "Total: ", studentScore, "Average: ", maximum);

    }

    public static void lowestScoringStudent(double [][] arrays){
        double[] average = calculateAverageScoreOfStudent(arrays);
        double[] total = summationOfStudentScores(arrays);
        double minimum = Integer.MAX_VALUE;
        double studentScore = 0;
        int student = 0;
        for(int i = 0; i < average.length; i++){
            if(average[i] < minimum){
                minimum = average[i];
                studentScore = total[i];
                student = i + 1;
            }

        }
        System.out.printf("%s%d%s%n%s%.1f%n%s%.1f%n","Student ",student, " is lowest scoring student:", "Total: ", studentScore,"Average: ", minimum);
    }

    public static double[] calculateTotalScoresOfSubject(double [][] arrays){
        double[] columnAddition = new double[arrays[0].length];
        int total = 0;
        for(int column = 0; column < arrays[0].length; column++) {
            for (int row = 0; row < arrays.length; row++) {
                total += arrays[row][column];
            }
            columnAddition[column] = total;
            total = 0;
        }
        return columnAddition;
    }

    public static double[] averageScorePerSubject(double [][] arrays){
        double [] averagePerSubject = new double[arrays.length];
        double [] totalPerSubject = calculateTotalScoresOfSubject(arrays);
        for (int i = 0; i < arrays.length; i++) {
            averagePerSubject[i] = totalPerSubject[i] / totalPerSubject.length;
        }
        return averagePerSubject;
    }
    public static void highestScoringStudentPerSubject(double [][] arrays){
        double maximum = Double.MIN_VALUE;
        int student = 0;
        for (int column = 0; column < arrays.length; column++){
            System.out.println("The highest scoring student in subject "+ (column+1) + " is");
            for(int row = 0; row < arrays.length; row++){
                if(arrays[row][column] > maximum){
                    maximum = arrays[row][column];
                    student = row + 1;
                }
            }
            System.out.println("Student " + student + ": " + maximum);
        }
    }
    public static void lowestScoringStudentPerSubject(double [][] arrays){
        double minimum = Double.MAX_VALUE;
        int student = 0;
        for (int column = 0; column < arrays.length; column++){
            System.out.println("The lowest scoring student in subject "+ (column+1) + " is");
            for(int row = 0; row < arrays.length; row++){
                if(arrays[row][column] < minimum){
                    minimum = arrays[row][column];
                    student = row + 1;
                }
            }
            System.out.println("Student " + student + ": " + minimum);
        }
    }

    public static void totalAndAverageClassScore(double[][] arrays){
        double total = 0;
        double average = 0;
        int averageCounter = 0;
        for (double[]row: arrays){
            for(double column: row){
                total += column;
                averageCounter +=1;
            }
        }
        System.out.println("Total class score is " + total);
        System.out.printf("Average class score is %.2f", total/averageCounter);
    }

    public static void displayHardestSubject(double[][] arrays){
        double[] subject = averageScorePerSubject(arrays);
        int subjectNumber = 0;
        double minimum = Double.MAX_VALUE;
        for(int i = 0; i < subject.length; i++){
            if(subject[i] < minimum){
                minimum = subject[i];
                subjectNumber = i + 1;
            }
        }
        System.out.printf("%s%d%s%n%s%.1f%n", "Subject ", subjectNumber, " is the hardest subject","Subject Average score: ", minimum);
    }
    public static void displayEasiestSubject(double[][] arrays){
        double[] subject = averageScorePerSubject(arrays);
        int subjectNumber = 0;
        double maximum = Double.MIN_VALUE;
        for(int i = 0; i < subject.length; i++){
            if(subject[i] > maximum){
                maximum = subject[i];
                subjectNumber = i + 1;
            }
        }
        System.out.printf("%s%d%s%n%s%.1f%n","Subject ",subjectNumber, " is the easiest subject","Subject Average score: ",maximum);
    }

    public static int[] position(double [][] arrays){
        int[] position = new int[arrays.length];
        double[] total = summationOfStudentScores(arrays);
        int currentPosition = 0;
        int highestScore = position[0];
        for(int i = 0; i < total.length; i++){
            for(int j = 0; j < total.length; j++) {
                if (total[j] > highestScore) {
                    highestScore = (int)total[j];
                }
            }
            for(int k = 0; k < position.length; k++ ){
                if(total[k] == highestScore){
                    position[k] = ++currentPosition;
                    total[k] = currentPosition;
                    highestScore = position[0];
                }
            }
       }
        return position;
    }
}