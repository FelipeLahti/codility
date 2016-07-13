//Distinct: https://codility.com/demo/results/training7FWFZ6-A22


import java.util.*;
import java.lang.*;

class Solution {
  public int solution(int[] A) {
    if(A.length == 0) return 0;

    Arrays.sort(A);
    int result = 1;
    for(int i = 1; i < A.length; i++) {
      if(A[i-1] != A[i]) {
        result++;
      }
    }
    return result;
  }
}
