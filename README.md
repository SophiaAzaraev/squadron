# squadron
maze and groupwork project

## personnel
Sophia Azaraev
Sophie Watwood

## statement of problem
Returns Boolean value of the statement “the maze is navigable, having at least one legal
travel path that is continuous from designated start-point to existing treasure”
A maze is: A grid in which some borders are permeable and others are not. 
Legal is:
    Path does not intersect with impermeable walls
    orthagonal turns only
    looping disallowed: reaching any stepping stone at most once 
    a turn may not be made without a subsequent legal forward move. 

Clarified for usefulness: A maze is navigable if 
	there is at least one series of legal steps and turns
	from the designated start-point to existing treasure

## recursive abstraction
   we don't know yet
Tentative:
I think maybe we can split the problem into steps/turns. 
Take step, check if it is legal. If legal, take another step. 

to "Check:" take a step.
if it is illegal, turn right, check step. 
