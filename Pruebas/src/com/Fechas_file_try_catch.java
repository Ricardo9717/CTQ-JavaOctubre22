package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fechas_file_try_catch {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Castellanos\\Desktop\\Ejemplo.txt");
		String d,m,a;  
		int d1,m1;
		// es una estructura (intenta hacer este metodo)
		
		  try {
			  f.createNewFile();
				 
			  FileWriter fw = new FileWriter(f);
			  
			  fw.write("04041999" + '\n');
			  fw.write("05081989" + '\n');
			  fw.write("06082009" + '\n');
			  fw.write("28102003" + '\n');
			  
			  fw.close();
			  
			     FileReader fr = new FileReader(f);
			     BufferedReader br = new BufferedReader(fr);
			     String linea;
			     
			     while((linea = br.readLine()) != null) {
			    	d = linea.substring(0,2);
			    	m = linea.substring(2,4);
			    	a = linea.substring(4,8);
			    	
			    	d1 = Integer.parseInt(d);
			    	m1 = Integer.parseInt(m);		
		    	 
			     switch(d1){
			     case 1:
			    	 d = "Primero de";
			    	 break;
			     case 2:
			    	 d = "Dos de";
			    	 break;
			     case 3:
			    	 d = "Tres de";
			    	 break;
			     case 4:
			    	 d = "Cuatro de";
			    	 break;
			     case 5:
			    	 d = "Cinco de";
			    	 break;
			     case 6:
			    	 d = "Seis de";
			    	 break;
			     case 7:
			    	 d = "Siete de ";
			    	 break;
			     case 8:
			    	 d = "Ocho de";
			    	 break;
			     case 9:
			    	 d = "Nueve de";
			    	 break;
			     case 10:
			    	 d = "Diez de";
			    	 break;
			     case 11:
			    	 d = "Once de";
			    	 break;
			     case 12:
			    	 d = "Doce de";
			    	 break;
			     case 13:
			    	 d = "Trece de";
			    	 break;
			     case 14:
			    	 d = "Catorce de";
			    	 break;
			     case 15:
			    	 d = "Quince de";
			    	 break;
			     case 16:
			    	 d = "Dieciseis de";
			    	 break;
			     case 17:
			    	 d = "Diecisiete de";
			    	 break;
			     case 18:
			    	 d = "Diesiocho de";
			    	 break;
			     case 19:
			    	 d = "Diesinueve de";
			    	 break;
			     case 20:
			    	 d = "Veinte de";
			    	 break;
			     case 21:
			    	 d = "Veintiuno de";
			    	 break;
			     case 22:
			    	 d = "Veintidos de";
			    	 break;
			     case 23:
			    	 d = "Veintitres de";
			    	 break;
			     case 24:
			    	 d = "Veinticuatro de";
			    	 break;
			     case 25:
			    	 d = "Veinticinco de";
			    	 break;
			     case 26:
			    	 d = "Veintiseis de";
			    	 break;
			     case 27:
			    	 d = "Veintisiete de";
			    	 break;
			     case 28:
			    	 d = "Veintiocho de";
			    	 break;
			     case 29:
			    	 d = "Veintinueve de";
			    	 break;
			     case 30:
			    	 d = "Treinta de";
			    	 break;
			     }
			     
			     switch(m1){
			     case 1:
			    	 m = " Enero de ";
			    	 break;
			     case 2:
			    	 m = " Febrero de ";
			    	 break;
			     case 3:
			    	 m = " Marzo de ";
			    	 break;
			     case 4:
			    	 m = " Abril de ";
			    	 break;
			     case 5:
			    	 m = " Mayo de ";
			    	 break;
			     case 6:
			    	 m = " Junio de ";
			    	 break;
			     case 7:
			    	 m = " Julio de ";
			    	 break;
			     case 8:
			    	 m = " Agosto de ";
			    	 break;
			     case 9:
			    	 m = " Septiembre de ";
			    	 break;
			     case 10:
			    	 m = " Octubre de ";
			    	 break;
			     case 11:
			    	 m = " Noviembre de ";
			    	 break;
			     case 12:
			    	 m = " Diciembre de ";
			    	 break;
			     }
			     
			     System.out.println(d + m + a);
		     }
		     
		  } catch (IOException e) {
			// Da informacion sobre el error
			e.printStackTrace();
		  }

	}

}
