package animal;

public abstract class Animal {

    private String nombre;
    private int edad;
    private String tipo;
    private String sonido;

    public Animal(String nombre, int edad, String tipo, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo= tipo;
        this.sonido= sonido;
    }

    public abstract void mostrardatos();
    public abstract void SonidoAnimal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

   

  
}
