package Phase1Projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\Downloads\\java files\\data.txt");
		if(f.createNewFile()) {
			System.out.println(f.exists());
		}
		
		FileWriter fw = new FileWriter(f);
		fw.write("Print this line \n Hi!!! ");
		fw.flush();
		System.out.println("Reading file");
		Scanner reader = new Scanner(f);
		while (reader.hasNext()) {
			String content = reader.nextLine();
			System.out.println(content);
		}
		System.out.println("The File has been read");
		reader.close();
		System.out.println("\n\nAdding another line..");
		FileWriter fw1 = new FileWriter(f, true);
		fw1.write("\nWelcome to java");
		fw1.flush();
		System.out.println("New Line is added into the exixting file");

	}

}
