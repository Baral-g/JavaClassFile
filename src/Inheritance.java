public class Inheritance {
    public static void main(String[] args) {
        Cat b = new Cat();
        b.id = 1;
        b.color = "White";
        b.name = "Bob";
        b.sound = "Mew";
        System.out.println(b.sound);
        System.out.println(b.name);


    }

}
    class Animal{
    int id;
    String name;
    String color;

    }

    class Cat extends Animal{
    String sound;



    }
