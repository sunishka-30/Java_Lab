package constructor;

import java.util.Scanner;


class Student{
    String name;

    public Student(String s){
        name = s;
    }
    public Student(){
        name = "Unknown";
    }
}

public class TestStudent
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        Student s = new Student(ss);
        Student a = new Student();

        if(ss.isEmpty())
        System.out.println(a.name);
        else
        System.out.println(s.name);
    }
}
