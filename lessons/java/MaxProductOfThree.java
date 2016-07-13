//MaxProductOfThree: https://codility.com/demo/results/trainingDQPJ7D-R3R/

import java.util.*;
import java.lang.*;

class Solution {
  public int solution(int[] A) {
    int N = A.length;        
    Arrays.sort(A);

    int maxTriple = Math.max(A[0] * A[1] * A[2], A[N-1] * A[N-2] * A[N-3]);

    if(A[0] * A[1] > 0 && A[0] < 0) {
      maxTriple = Math.max(maxTriple, A[0] * A[1] * A[N-1]);
    }

    return maxTriple;
  }
}
