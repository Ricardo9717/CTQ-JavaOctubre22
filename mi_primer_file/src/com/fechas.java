package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fechas=new File("C:\\Users\\epifa\\Desktop\\ceteg\\fechas.txt");
		String dia,mes,año;
		int dn,mn; 
		try { fechas.createNewFile();
	
		FileWriter fw= new FileWriter(fechas);
		
		fw.write("19081993" + "\n");
		fw.write("29011992" + "\n");
		fw.write("28031985" + "\n");
		fw.write("27101981" + "\n");
		fw.write("08111963" + "\n");
		fw.write("23021963" + "\n");
		
		fw.close();
		
		FileReader fr= new FileReader(fechas);
		BufferedReader br= new BufferedReader(fr);
		String linea;
		while ((linea=br.readLine()) !=null) {
			dia= linea.substring(0,2);
			mes= linea.substring(2,4);
			año= linea.substring(4,8);
			dn= Integer.parseInt(dia);
			mn= Integer.parseInt(mes);
		
			switch (dn) {
		case 1: dia = "uno de "; break;
		case 2: dia = "dos de "; break;
		case 3: dia = "tres de "; break;
		case 4: dia = "cuatro de "; break;
		case 5: dia = "cinco de "; break;
		case 6: dia = "seis de "; break;
		case 7: dia = "siete de "; break;
		case 8: dia = "ocho de "; break;
		case 9: dia = "nueve de "; break;
		case 10: dia = "diez de"; break;
		case 11: dia = "once de "; break;
		case 12: dia = "doce de "; break;
		case 13: dia = "trece de "; break;
		case 14: dia = "catorce de "; break;
		case 15: dia = "quince de "; break;
		case 16: dia = "dieciséis de "; break;
		case 17: dia = "diecisiete de "; break;
		case 18: dia = "dieciocho de "; break;
		case 19: dia = "diecinueve de "; break;
		case 20: dia = "veinte de"; break;
		case 21: dia = "veintiuno de "; break;
		case 22: dia = "veintidos de "; break;
		case 23: dia = "veintitres de "; break;
		case 24: dia = "veinticuatro de "; break;
		case 25: dia = "veinticinco de "; break;
		case 26: dia = "veintiseis de "; break;
		case 27: dia = "veintisiete de "; break;
		case 28: dia = "veintiocho de "; break;
		case 29: dia = "veintinueve de "; break;
		case 30: dia = "treinta de "; break;
		case 31: dia = "treinta uno de "; break;
		}
			switch (mn ) {
		case 01: mes = "enero de "; break;	
		case 02: mes = "febrero de "; break;	
		case 03: mes = "marzo de "; break;	
		case 04: mes = "abril de "; break;	
		case 05: mes = "mayo de "; break;	
		case 06: mes = "junio de "; break;	
		case 07: mes = "julio de "; break;	
		case 8: mes = "agosto de "; break;	
		case 9: mes = "septiembre de "; break;	
		case 10: mes = "octubre de "; break;	
		case 11: mes = "noviembre de "; break;	
		case 12: mes = "diciembre de "; break;	
			}
		System.out.println(dia + mes + año);
		}
		
	        
		  } 
		catch (IOException e) {e.printStackTrace();}
	        
	}

}
