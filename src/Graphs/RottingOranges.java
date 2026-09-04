package Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>(); // queue that stores an int array of indices
        int timer = 0; // minutes taken for all oranges to rot
        int fresh = 0; // count of fresh oranges
        int rows = grid.length;
        int columns = grid[0].length;
        for (int r = 0; r<rows; r++){
            for (int c = 0; c<grid[0].length; c++){
                if (grid[r][c]==1){
                    fresh++;
                }
                else if(grid[r][c]==2){
                    queue.offer(new int[]{r,c}); // put the indices of the element in queue if it is 2 ie rotten
                }
            }
        }
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        while (fresh>0 && !queue.isEmpty()){
            int length = queue.size();
            for (int i = 0; i<length; i++){ // iterate through the elements amount of times that is current length of the queue
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for (int[] d:directions){ // for traversing to the the up, down, left and right elements
                    int row = r + d[0];
                    int col = c + d[1];
                    if (row >= 0 && row < grid.length && col>= 0 && col < grid[0].length && grid[row][col]==1){
                        queue.offer(new int[]{row,col});
                        grid[row][col] = 2; // set to so it's rotten
                        fresh--;
                    }
                }
            }

            timer++;



        }
        return fresh == 0? timer:-1;

    }

}
