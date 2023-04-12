
import java.util.Scanner;

class Student

{

    int roll;

    String name;

    int score;

    void set_data(int roll,String name,int score)

    {

        this.roll=roll;

        this.name=name;

        this.score=score;

    }

    void show_data()

    {

        System.out.println("roll :"+roll);

        System.out.println("name :"+name);

        System.out.println("roll :"+score);

    }

    void copy_to(Student s)

    {

        s.roll=this.roll;

        s.name=String.copyValueOf(this.name.toCharArray());

        s.score=this.score;

    }

    

}

class Q6

{

    

    public static void main(String args[])

    {

        Student s1=new Student();

        s1.set_data(1092,"Ritabrata",100);

        Student s2=new Student();

        s1.copy_to(s2);

        s2.show_data();

        

        

    }

}


