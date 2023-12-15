package JavaFS.clase30;

public class Ave {
    private String nombre;
    private int edad;

    public Ave(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Los getters y setters no son static!!

    // getters 
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
