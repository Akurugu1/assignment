public class GradeReport {
    void executeGradeReport(double score) {
         validateScore(score);

    }


    void validateScore(double score) {
        if(score >= 0 && score <= 100){
            char grade = calculateLetterGrade(score);
            displayLetterGrade(grade);
        }
        else{
            System.out.println("Invalid Score");
        }
    }


    char calculateLetterGrade(double score){
        if (score > 80) {
            return 'A';
        }
        else if (score > 70){
            return 'B';
        }
        else if (score > 60){
            return 'C';
        }
        else if (score > 50){
            return 'D';
        }
        else if (score > 40){
            return 'E';
        }
        else {
            return 'F';
        }

    }


    void displayLetterGrade(char grade){
        if(grade == 'A'){
            System.out.println("Your results is Execellent");
        }
        else if(grade == 'B'){
            System.out.println("Your results is Very Good");
        }
        else if(grade == 'C'){
            System.out.println("Your results is Good");
        }
        else if(grade == 'D'){
            System.out.println("Your results is Okay");
        }
        else{
            System.out.print("Bad results");
        }
    }
}
