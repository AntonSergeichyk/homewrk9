package studentSort.comparator;

import studentSort.Student;

import java.util.Comparator;

public class SurNameComporator implements Comparator<Student> {

    private NameComporator nameComporator = new NameComporator();

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getSurName().compareTo(o2.getSurName());
        if (result==0){
            result=nameComporator.compare(o1,o2);
        }

        return result;
    }
}
