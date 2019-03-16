package com.exmyth.beyond.hello.datastructure.array;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> studentArray = new Array<>();
        studentArray.addLast(new Student("Alice", 100));
        studentArray.addLast(new Student("Bob", 90));
        studentArray.addLast(new Student("Charlie", 80));
        System.out.println(studentArray);
    }
}
