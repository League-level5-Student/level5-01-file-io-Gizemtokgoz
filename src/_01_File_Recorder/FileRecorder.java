package _01_File_Recorder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/FileRecorder", true);
			String input = JOptionPane.showInputDialog("Write A Message!");
			fw.write(input);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
