package Encapsulation;

public class Task1Main {

    public static void main(String[] args) {

        try {
            Task1 t = new Task1("Shruti", 51);
            System.out.println(t.getName());
            System.out.println(t.getAge());

        } catch (Task1Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
