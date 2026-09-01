package Graphs;

public class NumberofIslands {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int islands = 0; // count of island

        for (int r = 0; r<rows; r++){
            for (int c = 0; c<columns; c++){
                if (grid[r][c]=='1'){ // check if the element is part of the land
                    dfs(grid,r,c);
                    islands++;

                }
            }
        }
        return islands;

    }
    private void dfs (char[][] grid, int r, int c){
        // Base case
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] == '0'){ // check if r is within 0 to length of row and c within 0 to length of columns and if the element is already 0 ie it is water then we simply end the dfs
            return;
        }

        grid[r][c] = '0'; // flood the land that is mark it as read or simply convert the 1 to 0

        //1. up
        dfs(grid,r-1,c);
        //2. down
        dfs(grid,r+1,c);
        //3. left
        dfs(grid,r,c-1);
        //4. right
        dfs(grid,r,c+1);
        // recursion through surrounding elements of the current element

    }
}
