import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //Input: take marks obtained(out of 100) in each subject
        System.out.print("Enter the number of subjects:");
        int numSubjects= scanner.nextInt();
        int[] marks = new int[numSubjects];

        for (int i =0;i<numSubjects;i++){
            System.out.print("Enter the marks obtained in subjects" + (i+1)+":");
            marks[i] = scanner.nextInt();


        }
        //calculate toatl marks
        int totalMarks =0;
        for(int mark : marks){
            totalMarks+=mark;
        }

        //calculate Average percentage
        double averagePercentage = (double) totalMarks/numSubjects;

        //grade calculation
        String grade= calculateGrade(averagePercentage);

        //Display Results

       System.out.println("Total MArks :"+totalMarks);
       System.out.println("Average Percentage:"+ String.format("%.2f", averagePercentage)+"%");
       System.out.println("Grade:"+grade);
       scanner.close();
    }
    public static String calculateGrade(double percentage){
        if(percentage >= 90){
            return "A+";

        }else if(percentage >= 80){
            return"A";

        }else if(percentage >= 70){
            return "B+";
        }else if(percentage >= 60){
            return "B";
        }else if(percentage >=50){
            return "C";

        }else if(percentage >=40){
            return "D";
        }else {
            return "F";
        }
    }


    
}