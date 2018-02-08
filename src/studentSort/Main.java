package studentSort;

import studentSort.comparator.AverageScoreComparator;
import studentSort.comparator.OldComparator;
import studentSort.comparator.SurNameComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();

        addStudents(listStudent);
        Collections.sort(listStudent, new SurNameComporator());
        System.out.println(listStudent);
        Collections.sort(listStudent, new OldComparator());
        System.out.println(listStudent);
        Collections.sort(listStudent, new AverageScoreComparator());
        System.out.println(listStudent);
        System.out.println(highAverageScore(listStudent));
    }

    private static Student highAverageScore(List<Student> listStudents) {
        Student bestStudent = listStudents.get(0);

        for (Iterator<Student> iterator = listStudents.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (bestStudent.getAverageScore() < student.getAverageScore()) {
                bestStudent = student;
            }
        }

        return bestStudent;
    }

    private static void addStudents(List<Student> students) {
        students.add(new Student("Иванов", "Иван", 22, 6.4));
        students.add(new Student("Петров", "Сергей", 22, 6.6));
        students.add(new Student("Петров", "Виталий", 17, 7.4));
        students.add(new Student("Сергеев", "Александр", 21, 8.4));
        students.add(new Student("Дмитрюк", "Сергей", 19, 6.2));
        students.add(new Student("Безруков", "Николай", 18, 9.4));
        students.add(new Student("Булкин", "Алексей", 17, 8.1));
        students.add(new Student("Сидоров", "Дмитрий", 21, 8.1));
    }
}
