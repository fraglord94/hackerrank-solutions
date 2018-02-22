package hackerrank.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String lesson;
    private int grade;

    public Student() {

    }

    public Student(String name, String lesson, int grade) {
        this.name = name;
        this.lesson = lesson;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLesson() {
        return lesson;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", lesson=" + lesson + ", grade=" + grade + '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.grade - this.grade;
    }

}

class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int x = o1.getGrade();
        int y = o2.getGrade();
        if (x > y) {
            return 1;
        } else if (x == y) {
            return 0;
        } else//(x < y)
        {
            return -1;
        }

    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }

}

public class MainComparatorExample {

    public static void main(String[] args) {
        Student student[] = new Student[3];
        student[0] = new Student();
        student[0].setName("Nick");
        student[0].setGrade(19);

        student[1] = new Student();
        student[1].setName("Helen");
        student[1].setGrade(12);

        student[2] = new Student();
        student[2].setName("Ross");
        student[2].setGrade(16);
        /*
        System.out.println("Order of students before sorting is: ");

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }

        Arrays.sort(student, new NameComparator());
        System.out
                .println("Order of students after sorting by student name is");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }

        System.out.println("Order of students after sorting by student grade F is");

        Arrays.sort(student, new Comparator<Student>() 
        {
            @Override
            public int compare(Student s1, Student s2){
                return -1; 
            }
        }
        
        );

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName() + "\t"
                    + student[i].getGrade());
        }*/

        PriorityQueue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
            public int compare(Student x, Student y) {
                return 1;
            }
        }
        );
        pq.add(student[0]);
        pq.add(student[1]);
        pq.add(student[2]);

        System.out.println(pq.poll().getGrade());
        System.out.println(pq.poll().getGrade());
        System.out.println(pq.poll().getGrade());

    }

}
