import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

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

            for (int i = 0; i < NUMBER_OF_ELEMENT; i++) {
                System.out.print(mas[i] + " ");
            }

            int k0 = 0;
            int[] mas0 = new int[NUMBER_OF_ELEMENT];
            int k0_10 = 0;
            int[] mas0_10  = new int[NUMBER_OF_ELEMENT];

            for (int i = 0; i < NUMBER_OF_ELEMENT; i++){
                if (mas[i] < 0) {
                    mas0[k0] = mas[i];
                    k0 = k0 + 1;
                }
                else {
                    mas0_10[k0_10] = mas[i];
                    k0_10 = k0_10 + 1;
                }
            }

            System.out.println("");
            for (int i = 0; i < k0; i++){
                System.out.print(mas0[i] + " ");
            }

            for (int i = k0; i < k0_10; i++){
                System.out.print(mas0_10[i] + " ");
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }



    }
}
