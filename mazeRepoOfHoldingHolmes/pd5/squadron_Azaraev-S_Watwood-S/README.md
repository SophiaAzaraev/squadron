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

## recursive abstraction/ algorithm
### note: We chose to lump the two together for the moment 
### because the thinking involved happens at the same time
### maybe we will separate them later, but that would require more thinking
### and maybe a level of complex syntactic understanding
### (Which is not actually necessary to code the problem)
Tentative:

notes:
will have to compile a list of solutions
junk pile and legal pile
    junk pile  --> irrelevent, ultimately
    legal pile --> if anything is in the legal pile, 
        the answer to the ULTIMATE QUESTION (are there legal paths) is yes.
at the smallest level of the problem, a single move, three things can happen
    we hit a deadend        --> that solution is junk and we delete it 
                                and try from most recently working solution. 
    legal move, no treasure --> the most recently working solution is now this one? 
                                I am not so sure that I am right about this part
    we hit treasure!        --> stop everything the answer is yes there is a solution

junk pile is collected as we hit dead ends
the current, which is what we are working with and not in the junk pile or the legal pile
    is the solution that has not YET hit a dead end
    but has also not yet reached the treasure. 


I think maybe we can split the problem into steps/turns...

Take step, check if it is legal. If legal, take another step. 
(Take a step is just "go forward one unit")

to "Check:" take a step.
    if it is illegal, turn right, check step. 

