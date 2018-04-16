public class MazeSolver {

	private boolean isMazeSolved;
	public Maze progress;
        private Displayer displayer;
        private int displayCount; // num. of moves

        /**
         * To implement maze solver, call in Terminal:
         * java MazaSolver mazeFile.name rank# file #
         **/
	public MazeSolver(Displayer displayer){
                this.displayer = displayer;
	}

	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}

	public String toString() {
		return progress.toString();
	}
        
        private final static int[] DIRECTIONS = {
                                                  Maze.EAST,
                                                  Maze.NORTH,
						  Maze.WEST,
                                                  Maze.SOUTH,
                                                };

        public boolean pathFinder(Maze candidate) {
                if (displayer !=null)
		displayer.atTopOfWindow(candidate
		    +String.format(" %5d moves", displayCount++)
		    +System.lineSeparator());

		if(candidate.explorerIsOnA() == Maze.WALL) return false;
                if(candidate.explorerIsOnA() == Maze.TREASURE) return true;

		//recursive
		Maze snapshot = new Maze( candidate);
		for( int look : DIRECTIONS) {
		    candidate.dropA( Maze.WALL); 

		candidate.go( look);
		if( pathFinder( candidate)) return true;

		candidate = new Maze(snapshot);
			

		}
                return false;	
    }


}
