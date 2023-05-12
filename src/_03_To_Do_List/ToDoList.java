package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
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
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton viewButton = new JButton();
	JButton removeButton = new JButton();
	JButton saveButton = new JButton();
	JButton loadButton = new JButton();
	
	ArrayList<String> tasks = new ArrayList<String>();
	
	static FileWriter fw;
	
	public static void main(String[] args) {	
		new ToDoList().run();
	}
	
	public void run() {
		try {
			fw = new FileWriter("src/ToDoList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		removeButton.addActionListener(this);
		saveButton.addActionListener(this);
		loadButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == addButton) {
			String addWhat = JOptionPane.showInputDialog("Whats task would you like to add?");
			tasks.add(addWhat);
		}	
		if (arg0.getSource() == viewButton) {
			JOptionPane.showMessageDialog(null, tasks);
		}	
		if (arg0.getSource() == removeButton) {
			String removeWhat = JOptionPane.showInputDialog("Whats task would you like to remove?");
			for (int i = 0; i < tasks.size(); i++) {
				if (removeWhat == tasks.get(i)) {
					tasks.remove(i);
				}	
			}
				
		}	
		if (arg0.getSource() == saveButton) {
			for (int i = 0; i < tasks.size(); i++) {
				try {
					fw.write(tasks.get(i));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		if (arg0.getSource() == loadButton) {
			tasks.add(fw.toString());
		}
	}
}
