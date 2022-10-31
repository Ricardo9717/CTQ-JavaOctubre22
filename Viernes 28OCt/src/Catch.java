import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Catch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\Ruben M\\Desktop\\Nueva carpeta\\Ejemplo.txt");
		
		try { 
			boolean b= f.createNewFile();
			System.out.println(b);
			FileWriter fw=new FileWriter(f);
			
			for(int i=0; i<10;i++) {
				fw.write("hola mundo"+"\n");
				
			}
			fw.close();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
	
	}

}
