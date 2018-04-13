public class UserOfMazeSolver {
  
  	public static void main(String[] commandLine)
  			throws java.io.FileNotFoundException  {
      				MazeSolver testMaze = new MazeSolver(commandLine[0],
      				Integer.parseInt( commandLine[1]), 
                    Integer.parseInt( commandLine[2]));
      		System.out.println( testMaze + System.lineSeparator());
      }                                        
}