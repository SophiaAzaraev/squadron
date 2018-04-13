public class MazeSolver {
	private boolean isMazeSolved;
	public Maze progress;
	public MazeSolver(String sourceFilename, int explorerRank, int explorerFile) throws 
		java.io.FileNotFoundException{ 
  		 
  		progress = new Maze(sourceFilename, explorerRank, explorerFile);
		System.out.println("testing. created inProgress");
		pathFinder();
		System.out.println("Finished Path! Treasure: " + isMazeSolved);
	}
	public boolean getIsMazeSolved() {
		return isMazeSolved;
	}
	public String toString() {
		return progress.toString();
	}
    public void pathFinder() {
		if (progress.explorerIsOnA() == 0) { 
	    	isMazeSolved = true;
			System.out.println(isMazeSolved);
		}
		else{
			System.out.println("No treasure here");
		}	
    }
    
}