import java.util.Arrays;

public class CloneArrays {
    public static void main(String[] args) {
        //Creamos varios objetos
        Persona p1=new Persona("Jovani",32);
        Persona p2=new Persona("Lucas",23);
        Persona p3=new Persona("Roberto",13);

        //Creamos un array de objetos
        Persona[] personas={p1,p2,p3};

        //Imprimimos por pantalla el primer array (lo que nos muestra la referencia)
        System.out.println(personas);

        //Usando el metodo toString para mostrar el contenido del array, nos muestra la referencia.
        System.out.println(Arrays.toString(personas));
        //Hemos modificado la clase Persona y hemos modificado el metodo toString, para que los objetos usen ese metodo
        // en vez del mismo metodo de la clase Object. Nos muestra el nombre y la edad
        System.out.println(Arrays.toString(personas));
    }
}