package studentSort;

public class Student {

    private String name;
    private String surName;
    private int age;
    private double averageScore;

    public Student(String surName, String name, int age, double averageScore) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                " surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }
}
