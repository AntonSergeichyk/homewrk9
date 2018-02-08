package studentSort.comparator;

import studentSort.Student;

import java.util.Comparator;

public class AverageScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Double score1=o1.getAverageScore();
        Double score2=o2.getAverageScore();

        return score1.compareTo(score2);
    }
}
