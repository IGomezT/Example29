import java.util.Scanner;

public class Example29 {
    public static void main(String [] args) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        float dividendo;
        float divisor;
        float cociente =0;


        System.out.println("Escriba primer numero");
        dividendo = inputValue.nextInt();

        System.out.println("Escriba segundo numero");
        divisor = inputValue.nextInt();

        while (dividendo >0){
            System.out.println(dividendo);
            cociente++;
            dividendo = dividendo-divisor;
        }

        System.out.println("Cociente : " +cociente);
        System.out.println("Resto : " +dividendo);



    }
}
