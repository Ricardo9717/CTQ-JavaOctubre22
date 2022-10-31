import java.util.Arrays;
import java.util.Scanner;

public class TareaAsecendentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner entrada=new Scanner(System.in);


        System.out.println("Dijite cunatos numeros quiere ordenar de forma ascendente");
        int numero= Integer.parseInt(entrada.nextLine());

            double[] valnum = new double[numero];

            for(int i =0; i<numero; i++){

                System.out.println("Digite sus numeros: "+" "+(i+1)+":");
                valnum[i]= Double.parseDouble(entrada.nextLine());

                }
            System.out.println("Los numero que ingreso son: ");
            for(int i=0; i<numero ; i++) {

                 System.out.println(valnum[i]);
                }


         System.out.println("Sus numeros han sido ordenados de forma acendente");
        Arrays.sort(valnum);
        for(int i=0; i < valnum.length; i++) {        //for(int i=valnum.length-1; i>=0; i--) Para realizarlo de forma decsendente
            System.out.println(" "+valnum[i]);

        }
		
		
		
		
	}

}
