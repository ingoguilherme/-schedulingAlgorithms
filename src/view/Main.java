package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.UnsupportedLookAndFeelException;

import controller.file.FileController;
import exception.file.FileException;

public class Main {
	public static void main(String[] x) {
		
		try {
			/*
			FileController ucFile = new FileController(FileController.CHOOSER_TYPE_SAVE, false);
			
			File selectedFile = ucFile.chooseFile();
			System.out.println(selectedFile.getAbsolutePath());
			
			String content = "Teste";
			
			for(int i = 1; i <= 10; i++)
				ucFile.writeFile(i + " - " + content);
			*/
			
			
			
			FileController ucFile = new FileController(FileController.CHOOSER_TYPE_LOAD, false);
			
			File selectedFile = ucFile.chooseFile();
			System.out.println(selectedFile.getAbsolutePath());
			
			int lines = ucFile.countLines();
			System.out.println(lines);
			
			System.out.println("\nContent:\n");
			
			for(int i = 0; i < lines; i++) {
				System.out.println(ucFile.readLine());
			}
			/*
			*/
			
			ucFile.closeBuffer();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (FileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}