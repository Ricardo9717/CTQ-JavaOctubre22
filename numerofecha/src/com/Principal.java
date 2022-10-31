package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convierte fechas formato 10112022 a texto décimo de noviembre de 2022
		
		File f = new File("C:\\Users\\Alfonso Z\\Documents\\workspace-spring-tool-suite\\numerofecha\\src\\com\\fecha.txt"); 
		String d,m,a;
		int dm, mn;
		
		try {
			
			FileWriter fw = new FileWriter(f);
			
			fw.write("17011991"+"\n");
			fw.write("28102022"+"\n");
			fw.write("31122000"+"\n");
			fw.write("04072020"+"\n");
			
			fw.close();
			
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			while((linea = br.readLine()) != null) {
				d = linea.substring(0,2);
				m = linea.substring(2,4);
				a = linea.substring(4,8);
				
				dm = Integer.parseInt(d);
				System.out.println(dm);
				mn = Integer.parseInt(m);
				
				switch(dm) {
				case 1:
					d = "Primero de ";
					break;
				case 2:
					d = "Segundo de ";
					break;
				case 3:
					d = "Tercero de ";
					break;
				case 4:
					d = "Cuarto de ";
					break;
				case 5:
					d = "Quinto de ";
					break;
				case 6:
					d = "Sexto de ";
					break;
				case 7:
					d = "Séptimo de ";
					break;
				case 8:
					d = "Octavo de ";
					break;
				case 9:
					d = "Noveno de ";
					break;
				case 10:
					d = "Décimo de ";
					break;
				case 11:
					d = "Undécimo de ";
					break;
				case 12:
					d = "Duodécimo de ";
					break;
				case 13:
					d = "Decimotercero de ";
					break;
				case 14:
					d = "Decimocuarto de ";
					break;
				case 15:
					d = "Decimoquinto de ";
					break;
				case 16:
					d = "Decimosexto de ";
					break;
				case 17:
					d = "Decimoséptimo de ";
					break;
				case 18:
					d = "Decimooctavo de ";
					break;
				case 19:
					d = "Decimonoveno de ";
					break;
				case 20:
					d = "Vigésimo de ";
					break;
				case 21:
					d = "Vigesimoprimero de ";
					break;
				case 22:
					d = "Vigesimosegundo de ";
					break;
				case 23:
					d = "Vigesimotercero de ";
					break;
				case 24:
					d = "Vigesimocuarto de ";
					break;
				case 25:
					d = "Vigesimoquinto de ";
					break;
				case 26:
					d = "Vigesimosexto de ";
					break;
				case 27:
					d = "Vigesimoséptimo de ";
					break;
				case 28:
					d = "Vigesimooctavo de ";
					break;
				case 29:
					d = "Vigesimonoveno de ";
					break;
				case 30:
					d = "Trigésimo de ";
					break;
				case 31:
					d = "Trigésimo primero de ";
					break;
				default:
					d = "Día no válido";
				}
				
				switch(mn) {
				case 1:
					m = "Enero de";
					break;
				case 2:
					m = "Febrero de";
					break;
				case 3:
					m = "Marzo de";
					break;
				case 4:
					m = "Abril de";
					break;
				case 5:
					m = "Mayo de";
					break;
				case 6:
					m = "Junio de";
					break;
				case 7:
					m = "Julio de";
					break;
				case 8:
					m = "Agosto de";
					break;
				case 9:
					m = "Septiembre de";
					break;
				case 10:
					m = "Octubre de";
					break;
				case 11:
					m = "Noviembre de";
					break;
				case 12:
					m = "Diciembre de";	
					break;
				default:
					m = "Mes no Válido";
				}
				
				System.out.println(d+m+a);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}

}
