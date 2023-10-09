class Solution {

  public int diagonalSum(int[][] mat) {
    int sum = 0;
    for (int row = 0; row < mat.length; row++) {
      for (int col = 0; col < mat[row].length; col++) {
        if (row == col || row + col == mat.length - 1) {
          sum += mat[row][col];
        }
      }
    }
    return sum;
  }
}
