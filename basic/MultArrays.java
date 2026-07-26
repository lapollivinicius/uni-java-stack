public class MultArrays {
  public static void main(String[] args) {

    // array of array
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    double[][] notes = new double[2][3];

    notes[0][0] = 10;
    notes[1][0] = 6.8;

    notes[0][1] = 8.7;
    notes[1][1] = 5.9;

    notes[0][2] = 9.7;
    notes[1][2] = 3.9;

    // iterate - use nested loops
    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix[i].length; j++) {

        System.out.print(matrix[i][j] + " ");

      }
      System.out.println("");
    }

  }
}
