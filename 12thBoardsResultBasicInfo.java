class Students {
    String name;
    int age;
    int boardsperc;
    void display(String name,int age,int boardsperc) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("12th Boards Percentage: " + boardsperc);
    }
}
public class Demo {
    public static void main(String[] args) {
        Students s = new Students();
        s.display("Rudra", 17, 89);
    }
}
