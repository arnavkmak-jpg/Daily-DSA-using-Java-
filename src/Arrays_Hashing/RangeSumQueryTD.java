package Arrays_Hashing;

public class RangeSumQueryTD {
    int[][] sum;
    public RangeSumQueryTD(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        sum = new int[rows + 1][cols + 1];
        for (int r = 0; r < rows; r++) {
            int prefix = 0; // initialise a prefix sum variable
            for (int c = 0; c < cols; c++) {
                prefix += matrix[r][c];// the prefix sum variable adds each element of the present row
                int above = sum[r][c + 1]; // we have to add the element above the current one
                sum[r + 1][c + 1] = prefix + above;


            }

        }
    }

        // we have to remove the row above and column to the left of the highlighted rows and columns we add the intersecting element to them however once since it's subtracted twice

    public int sumRegion(int row1, int col1, int row2, int col2) {
            row1++;
            col1++;
            row2++;
            col2++;
            int topLeft = sum[row1][col1];
            int bottomRight = sum[row2][col2]; // both of these are given
            int above = sum[row1-1][col2]; // above will be a row above the topLeft and on the same column as the bottomRight
            int left = sum[row2][col1-1]; // it is in the same row as the bottomRight and a column left to the topLeft
            int intersectingElement = sum[row1-1][col1-1];

            return bottomRight-above-left+intersectingElement;

    }

}
