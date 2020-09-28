package animal;

public class Main {

    public static void main(String[] args) {

        System.out.println("***********************");

        AnimalA dog = new AnimalA("Perro", 3, "Carnívoro", "Guaoo, guaoo");
        dog.mostrardatos();
        dog.SonidoAnimal();

        System.out.println("***********************");

        AnimalB cat = new AnimalB("León", 7, "Carnívoro", "Grrr grrr");
        cat.mostrardatos();
        cat.SonidoAnimal();
    }

}
