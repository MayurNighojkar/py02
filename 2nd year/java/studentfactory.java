class student{
    String Name;
    int marks;
}

class studentFactory{
    student createfactory() {
        student s = new student();
        s.Name="om";
        s.marks=99;
        return s;
    }
}

public class studentfactory{
    public static void main (String[]args){

        studentFactory h = new studentFactory();

        student s1 = h.createfactory();

        System.out.println("the name is "+ s1.Name);
        System.out.println("marks are "+ s1.marks);

    }
}