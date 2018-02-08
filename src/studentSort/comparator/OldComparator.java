package studentSort.comparator;

import studentSort.Student;

import java.util.Comparator;

public class OldComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        Integer age1=o1.getAge();
        Integer age2=o2.getAge();

        return age1.compareTo(age2);
    }
}
