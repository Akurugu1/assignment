public class ClassAverage{
    double calculateClassAverage(double score1, double score2){
        double answer = (score1 + score2)/2;
        System.out.println(answer);
        return answer;
    }

    double calculateClassAverage(double score1, double score2, double score3){
        double answer = (score1 + score2 + score3)/3;
        System.out.println(answer);
        return answer;

    }

    double calculateClassAverage(double[]  score){
        double sum = 0;
        for (int i = 0; i < score.length; i++){

                sum = score[i] + sum;
        }
        double answer = (sum)/score.length;
        System.out.println(answer);
        return answer;
    }
}
