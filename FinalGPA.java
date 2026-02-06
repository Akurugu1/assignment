public class FinalGPA {
    void getFinalGPA(double numericScore){
        char letter = calculateLetterGrade(numericScore);
        calculateGPA(letter);
    }


    char calculateLetterGrade(double numericScore) {
        if (numericScore > 80) {
            return 'A';
        } else if (numericScore > 70) {
            return 'B';
        } else if (numericScore > 60) {
            return 'C';
        } else if (numericScore > 50) {
            return 'D';
        } else if (numericScore > 40) {
            return 'E';
        } else {
            return 'F';
        }
    }

    void calculateGPA(char letter){
        if(letter == 'A'){
            System.out.println("Your GPA is 4.0");
        }
        else if (letter == 'B') {
            System.out.println("Your GPA is 3.5");
        }
        else if (letter == 'C'){
            System.out.println("Your GPA is 3.0");
        }
        else if (letter == 'D'){
            System.out.println("Your GPA is 2.5");
        }
        else if(letter == 'E'){
            System.out.println("Your GPA is 2.0");
        }
        else{
            System.out.println("Your GPA is 0");
        }
    }
}
