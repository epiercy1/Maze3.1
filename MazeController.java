import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
public class MazeController {
	public static void main(String[] args) {
		MazeController controller = new MazeController();
		controller.go();

	}
	
	private List <Integer>coordinates = new ArrayList<Integer>();
	
	public void go() {
		JFileChooser chooser = new JFileChooser();
		
		int returnVal = chooser.showOpenDialog(null);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			
			Scanner input = null;
			try {
				Scanner input = new Scanner(file);
			}catch(FileNotFoundException e) {
				
				System.out.println("Could not find the file " + file.getName());
				return;
			}
			Maze maze = new Maze();
			
			readMazeFromFile(maze);
			//for each start and end pair
			//{
			//	result = maze.solve(startrow, startcol, endrow, endcol) 
			//	output the answer
			//}
		}
		
		public Maze readMazeFromFile(Maze maze) {
			File file = getMazeFileFromUser();
			//create scanner
			
			//read width of maze
			//read height of maze
			Maze maze = new Maze(width, height);
			
			for(int row = 0; row < height; row++)
				for(int column = 0; column < width; column++)
					//read character
					maze.set(character, row, column);
			
			//while we have start and end coordinates
			//{
			//	read start coordinates and add them to the list
			//	read end coordinates and add them to the list
			//}
			
			//close scanner
			
			return maze;
			
		}
		
		public File getMazeFileFromUser() {
			return null;
		}
	}

}
