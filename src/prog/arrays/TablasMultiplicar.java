public class TablasMultiplicar {

    public void main(String[] args) {

        int[][] tabla = new int[5][5];

        tabla = array(5,5);


    for (int i = 0; i < tabla.length ; i++)
    {
        for (int j = 0; j < tabla[i].length; j++)
        {
            System.out.printf("%2d ",tabla[i][j]);
        }
        System.out.println();

    }
}

public int[][] array(int a, int b)
{
    int [][] array = new int[a][b];
    for (int i = 0; i < array.length ; i++)
    {
        for (int j = 0; j < array[i].length; j++)
        {
            array[i][j] = (i+1)*(j+1);
        }

    }
    return array;
}

}