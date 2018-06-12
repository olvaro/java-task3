package package3_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("src/in.txt"));
            final int NUMBER_OF_ELEMENT = sc.nextInt();
            int[] mas = new int[NUMBER_OF_ELEMENT];
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                mas[i] = sc.nextInt();
            }

            System.out.println("Ishodniy massiv:");
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++) {
                System.out.print(mas[i] + " ");
            }

            int k0 = 0;
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                if (mas[i] < 0) {
                    int tmp = mas[k0];
                    mas[k0] = mas[i];
                    mas[i] = tmp;
                    k0++;
                }
            }

            System.out.println("");
            System.out.println("<0 v nachale massiva:");
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                System.out.print(mas[i] + " ");
            }

            int k10 = NUMBER_OF_ELEMENT - 1;
            for (int i = NUMBER_OF_ELEMENT - 1; i > 0; i--){
                if (mas[i] > 10) {
                    int tmp = mas[k10];
                    mas[k10] = mas[i];
                    mas[i] = tmp;
                    k10--;
                }
            }

            System.out.println("");
            System.out.println(">10 v konche massiva:");
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                System.out.print(mas[i] + " ");
            }

/*            System.out.println("");
            System.out.println("k0=" + k0 + "; k10=" + k10);
*/
            System.out.println("");
            System.out.println("Sortirovka massiva:");
            for (int i = k0 - 1; i > 0; i--){
                for (int j = 0; j < i; j++){
                    if (mas[j] > mas[j+1]){
                        int tmp = mas[j];
                        mas[j] = mas[j+1];
                        mas[j+1] = tmp;
                    }
                }
            }

            for (int i = NUMBER_OF_ELEMENT - 1; i > k10; i--){
                for (int j = k10 + 1; j < i; j++){
                    if (mas[j] < mas[j+1]){
                        int tmp = mas[j];
                        mas[j] = mas[j+1];
                        mas[j+1] = tmp;
                    }
                }
            }

            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                System.out.print(mas[i] + " ");
            }

            int k0_10 = 0;
            int[] mas0_10  = new int[NUMBER_OF_ELEMENT];
            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                if (mas[i] >= 0 && mas[i] <= 10) {
                    mas0_10[k0_10] = mas[i];
                    k0_10 = k0_10 + 1;
                }
            }

            System.out.println("");
            System.out.println("Massiv ot 0 do 10:");
            for (int i = 0; i < k0_10; i++){
                System.out.print(mas0_10[i] + " ");
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}
