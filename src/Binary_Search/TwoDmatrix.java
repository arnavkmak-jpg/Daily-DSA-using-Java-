package Binary_Search;

public class TwoDmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int rows = matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows-1;

        while (top<=bottom){
            int mRow = (top+bottom)/2;
            if (target>matrix[mRow][columns-1]){
                top = mRow+1;
            }
            else if (target<matrix[mRow][0]){
                bottom = mRow-1;
            }
            else {
                break;
            }
        }

        if (!(top<=bottom)){
            return false;
        }
        int l = 0;
        int r = columns-1;
        int mRow = (top+bottom)/2;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (target>matrix[mRow][mid]){
                l = mid+1;
            }
           else if (target<matrix[mRow][mid]){
                r = mid-1;
            }
            else {
                return true;
            }
        }
        return false;






    }
}
