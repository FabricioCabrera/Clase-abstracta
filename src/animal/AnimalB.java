
package animal;

public class AnimalB extends Animal {
    
    public AnimalB(String nombre, int edad, String tipo, String sonido) {
        super(nombre, edad, tipo, sonido);
    }

    public void mostrardatos() {
        System.out.println("El nombre del animal es: " + getNombre() + "\nSu edad es: " + getEdad() + " años\n"
                + "Tipo de alimentación: " + getTipo());
    }

    @Override
    public void SonidoAnimal() {
        System.out.println("El sonido del " + getNombre()+ " es: "+getSonido());
    }

}
