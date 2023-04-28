package _03_To_Do_List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton addButton = new JButton();
		JButton viewButton = new JButton();
		JButton removeButton = new JButton();
		JButton saveButton = new JButton();
		JButton loadButton = new JButton();
		
		frame.add(panel);
		panel.add(addButton);
		panel.add(viewButton);	
		panel.add(removeButton);
		panel.add(saveButton);
		panel.add(loadButton);
		
		frame.setVisible(true);
		
		addButton.setText("Add Task");
		viewButton.setText("View Task");
		removeButton.setText("Remove Task");
		saveButton.setText("Save List");
		loadButton.setText("Load List");
		
		addButton.addActionListener(null);
		viewButton.addActionListener(null);
		removeButton.addActionListener(null);
		saveButton.addActionListener(null);
		loadButton.addActionListener(null);
	}
}
