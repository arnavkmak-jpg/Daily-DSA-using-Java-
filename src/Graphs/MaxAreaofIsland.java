package Graphs;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int max = 0;
        for (int r = 0; r< rows; r++){
            for (int c = 0; c< columns; c++){
                int currArea = dfs(grid,r,c);
                max = Math.max(max,currArea);
            }
        }

        return max;

    }

    private int dfs(int[][] grid, int r, int c){
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }

        grid[r][c] = 0;

        return 1+dfs(grid,r-1,c)+ dfs(grid,r+1,c)+ dfs(grid,r,c-1)+ dfs(grid,r,c+1);

    }
}
