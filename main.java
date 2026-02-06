public class Main{
    public static void main(String[] args){
        ClassAverage result2 = new ClassAverage();

        result2.calculateClassAverage(30.50, 40,40);
        result2.calculateClassAverage(67.8, 34.678, 20);
        double[] marks = {23.4, 34.833, 35};
        result2.calculateClassAverage(marks);



      
        GradeReport report1 = new GradeReport();
        report1.executeGradeReport(88);



      
      FinalGPA result = new FinalGPA();
      result.getFinalGPA(85);

    }      
}
}
