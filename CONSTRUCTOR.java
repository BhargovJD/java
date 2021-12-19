// Class with non parameterized constructor
class Pen{

    String color;

    public void getInfo(){
        System.out.println(this.color);
    }

    Pen(){
        System.out.println("Constructor is created");
    }

    Pen(String color){
        this.color=color;
    }
}

public class CONSTRUCTOR {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color="Red";
        p1.getInfo();

        Pen p2 = new Pen("black");
        p2.getInfo();



    }
}
