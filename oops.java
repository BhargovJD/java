class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
    }
}

public class oops{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Bhargov";
        s1.age=25;
        s1.getInfo();

        s1.name="Das";
        s1.age=24;
        s1.getInfo();
    }
}
