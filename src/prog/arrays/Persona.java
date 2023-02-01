public class Persona {
    String nombre;
    int edad;
    Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String toString(){
        String pibe=this.nombre+" tiene "+this.edad;
        return pibe;
    }
}