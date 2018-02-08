package studentSort.comparator;

import studentSort.Student;

import java.util.Comparator;

public class NameComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
