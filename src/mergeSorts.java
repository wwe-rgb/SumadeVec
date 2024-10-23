import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class mergeSorts {
    public mergeSorts(int[] data) {
    }

    public static void mergeSort(int[] data) {
        if (data.length > 1) {
            int mitad = data.length / 2;
            int[] izquierda = Arrays.copyOfRange(data, 0, mitad);
            int[] derecha = Arrays.copyOfRange(data, mitad, data.length);

            System.out.println(Arrays.toString(izquierda) + " --- " + Arrays.toString(derecha));

            // Recursivamente llamamos a mergeSort
            mergeSort(izquierda);
            mergeSort(derecha);

            // Fusionar las sublistas ordenadas
            int i = 0, d = 0, k = 0;
            while (i < izquierda.length && d < derecha.length) {
                if (izquierda[i] < derecha[d]) {
                    data[k] = izquierda[i];
                    i++;
                } else {
                    data[k] = derecha[d];
                    d++;
                }
                k++;
            }

            // Copiar los elementos restantes de izquierda
            while (i < izquierda.length) {
                data[k] = izquierda[i];
                i++;
                k++;
            }

            // Copiar los elementos restantes de derecha
            while (d < derecha.length) {
                data[k] = derecha[d];
                d++;
                k++;
            }
        }
        System.out.println("Regreso de rec: " + Arrays.toString(data));
    }



    public static void main(String[] args) {
        System.out.println("-,-,-,-,-MERGE,-,-,-,-");
        int [] infos= {3,6,2,4,7,8,5};
        mergeSort(infos);
        System.out.println(Arrays.toString(infos));


    }
}