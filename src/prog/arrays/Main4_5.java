package EjerciciosMoodle;

import com.sun.tools.javac.Main;

public class Main4_5 {
        public static void main(String[] args) {
            Main4_5 objeto = new Main4_5();
            int[] arr = {7, 3, 1, 2, 9};
            int[] out = objeto.insertarElemento(arr, 5);
            for (int i : out)
                System.out.print(i + " ");
        }

    private int[] insertarElemento(int[] arr, int i) {
        return arr;
    }
}
