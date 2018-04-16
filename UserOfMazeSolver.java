public class UserOfMazeSolver {
  
  	public static void main(String[] commandLine)
  			throws java.io.FileNotFoundException  {
                
                Displayer displayer = null; //purpose unknown

                MazeSolver solver = new MazeSolver(displayer);

                if( commandLine.length >= 4) //note: useless
                    displayer = new Displayer( Integer.parseInt( commandLine[3]));

      	        Maze testMaze = new Maze(commandLine[0],
      			                  Integer.parseInt( commandLine[1]), 
                                          Integer.parseInt( commandLine[2]));
      		System.out.println( testMaze + System.lineSeparator());
              
                System.out.println(
                                   "Boolean value of \"Found a path to treasure\":"
                                    + solver.pathFinder( testMaze) + System.lineSeparator());

      }                                        
}
