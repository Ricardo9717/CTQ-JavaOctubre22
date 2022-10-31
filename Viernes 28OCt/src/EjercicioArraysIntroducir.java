import java.util.Scanner;

public class EjercicioArraysIntroducir {

	public static void main(String[] args) {
		
	
		int f;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de Filas");
        f = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el numero de Columnas");
        c = Integer.parseInt(sc.nextLine());


        int dosD[][] = new int[f][c];




        for(int i = 0; i<dosD.length; i++) {

            for(int j = 0; j<dosD[i].length;j++) {
                System.out.println("Ingrese el valor de la posiscion "+i+","+j);
                dosD[i][j]=Integer.parseInt(sc.nextLine());

            }


        }

        for(int i = 0; i<dosD.length; i++) {
            System.out.println();
            for(int j = 0; j<dosD[i].length;j++) {
                System.out.print(dosD[i][j]);

            }

        }
		
		

	}

}
