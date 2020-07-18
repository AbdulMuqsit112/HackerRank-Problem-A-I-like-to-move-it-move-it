You are given an n x n grid. The cells in this grid are numbered 0 to n^2-1 starting with the top left column, increasing towards the left. The first row contains cell IDs 0 through n-1, the second row starts on the left with n and goes up to cell ID 2n – 1. A piece is placed on a specific cell on this grid and you are given its cell ID. The piece can move one step in any direction. 0 means move north, 1 means move northeast, 2 means move east, 3 means move southeast, 4 means move south, 5 means move southwest, 6 means move west and 7 means move northwest.

You are given an initial cell ID where a piece is placed and a sequence of moves. Your job is to output the cell ID of the final position.

Input Format

The file starts with the number of test cases. Each test case consists of three lines. The first line in a test case gives the value of n for this test. The second line in each test gives the cell ID where the piece starts. The next line gives a space separated list of moves.


Constraints

nan

Output Format

For each test case, print a single line that says “CaseN:” where N is the test case number, starting at 1, followed by the cell ID for the final location of the piece on the grid after all the moves have been made in the order specified in the input.


Sample Input 0

2
8
38
7 1 7 3 1 7
7
27
0 2 1 4 7 4 0 3 0 5 2 3 6 2 3 7 4

Sample Output 0

Case1: 6

Case2: 30
