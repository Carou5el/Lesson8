package kulkov.JavaCore;

import java.io.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		String strToOutput1 = "Текст из файла №1. Текст из файла №1. Текст из файла №1. " +
				"Текст из файла №1. Текст из файла №1. Текст из файла №1. Текст из файла №1. ";
		String strToOutput2 = "Текст из файла №2. Текст из файла №2. Текст из файла №2. Текст из файла №2. ";
		String fileName1 = "output1.txt";
		String fileName2 = "output2.txt";
		String fileName3 = "result.txt";
		
		createFile(fileName1, strToOutput1);
		createFile(fileName2, strToOutput2);
		
		String inputStr1 = readNAppend(fileName1);
		String inputStr2 = readNAppend(fileName2);
		
		inputStr1 += inputStr2;
		
		createFile(fileName3, inputStr1);
	}
	
	public static String readNAppend(String filename) {
		
		File file = new File(filename);
		String outputString = "";
		String tempString;
		
		try {
			if(file.exists())   {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				while((tempString = reader.readLine()) != null) {
					outputString += tempString;
				}
				reader.close();
			} else  {
				System.out.printf("File doesn't exist.\n");
			}
		} catch (IOException e) {
			e.getMessage();
		}
		
		return outputString;
	}
	
	public static boolean createFile(String name, String textFile) {
		
		boolean result = false;
		File file = new File(name);
		
		try {
			
			FileWriter output = new FileWriter(file);
			output.write(textFile);
			file.createNewFile();
			output.close();
			
		} catch(IOException e)  {
			System.out.printf("Cannot crate a file\n");
			e.getMessage();
		}
		
//		if(file.exists())    {
//			result = false;
//		} else {
//			file.
//		}
		
		
		
		return result;
	}
	
	public static void Task1()  {
	
	}
}
