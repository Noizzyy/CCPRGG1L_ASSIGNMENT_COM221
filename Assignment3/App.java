public class App {

  public static void main(String[] args) throws Exception {
    int[][] mdArray = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };

    // PATTERN 1
    int sum = 0;
    System.out.println("1. SUM OF PATTERN 1");

    for (int i = 0; i < mdArray.length; i++) {
      sum += mdArray[0][i];
    }
    System.out.println("Sum of Pattern 1: "+ sum);

    // PATTERN 2
    System.out.println("");
    System.out.println("2. SUM OF PATTERN 2");

    int sum1 = 0;
    for (int row1 = 0; row1 < mdArray.length; row1++) {
      sum1 += mdArray[row1][0];
    }
    System.out.println("Sum of Pattern : "+ sum1);

    // PATTERN 3
    System.out.println("");
    System.out.println("3. SUM OF PATTERN 3");

    int sum2 = 0;
    for (int row3 = 0; row3 < mdArray.length; row3++) {
      for (int col = 0; col < 4; col++) {
        if (row3 == 0 || col == 0) {
          sum2 += mdArray[row3][col];
        }
      }
    }
    System.out.println("Sum of Pattern 3: "+ sum2);

    // PATTERN 4
    System.out.println("");
    System.out.println("4. SUM OF PATTERN 4");

    int sum3 = 0;
    for (int row4 = 0; row4 < mdArray.length; row4++) {
      for (int col1 = 0; col1 < 4; col1++) {
        if(row4 == 0 && col1 == 0 || row4 == 0 && col1 == mdArray.length - 1 || row4 == mdArray.length - 1 && col1 == 0 || row4 == mdArray.length - 1 && col1 == mdArray.length - 1){
          sum3 += mdArray[row4][col1];
        }
      }
    }
    System.out.println("Sum of Pattern 4: "+ sum3);

    // PATTERN 5
    System.out.println("");
    System.out.println("5. SUM OF PATTERN 5");
    int sum4 = 0;
    for (int row5 = 0; row5 < mdArray.length; row5++) {
      for (int col2 = 0; col2 < 4; col2++) {
        if(row5 == 1 && col2 == 1 || row5 == 1 && col2 == mdArray.length - 2 || row5 == mdArray.length - 2 && col2 == 1 || row5 == mdArray.length - 2 && col2 == mdArray.length - 2 ){
          sum4 += mdArray[row5][col2];
        }
      }
    }
    System.out.println("Sum of Pattern 5: "+ sum4);

    // PATTERN 6
    System.out.println("");
    System.out.println("6. SUM OF PATTERN 6");
    int sum5 = 0;
    for (int row6 = 0; row6 < mdArray.length; row6++) {
      for (int col3 = 0; col3 < 4; col3++) {
        if(row6 == 1 && col3 == 1 || row6 == 1 && col3 == mdArray.length - 2 || row6 == mdArray.length - 2 && col3 == 1 || row6 == mdArray.length - 2 && col3 == mdArray.length - 2 || row6 == 0 && col3 == 0 || row6 == 0 && col3 == mdArray.length - 1 || row6 == mdArray.length - 1 && col3 == 0 || row6 == mdArray.length - 1 && col3 == mdArray.length - 1){
          sum5 += mdArray[row6][col3];
        }
      }
    }
    System.out.println("Sum of Pattern 6: "+ sum5);
  }
}
