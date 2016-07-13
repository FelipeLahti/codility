//MinAvgTwoSlice: https://codility.com/demo/results/training82HPS7-F38/

class Solution {
  public int solution(int[] A) {
    double minAvg = Double.MAX_VALUE;
    int minIndex = 0;

    for(int i = 0; i < A.length - 1; i++) {
      if( (A[i] + A[i+1]) / 2.0 < minAvg ) {
        minAvg = (A[i] + A[i+1]) / 2.0;
        minIndex = i;
      }

      if( i < A.length - 2 && (A[i] + A[i+1] + A[i+2]) / 3.0 < minAvg ) {
        minIndex = i;
        minAvg = (A[i] + A[i+1] + A[i+2]) / 3.0;
      }
    }

    return minIndex;
  }
}
