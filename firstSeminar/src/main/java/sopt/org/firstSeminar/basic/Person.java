package sopt.org.firstSeminar.basic;

public abstract class Person {
    private String gender;

    public abstract void walk();
}

class Student extends Person {
    @Override
    public void walk() {
        System.out.println("학교로 걸어갑니다.");
    }
}