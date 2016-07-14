//Triangle: https://codility.com/demo/results/trainingMVDY55-SEZ/

import java.util.*;

class Solution {
  public int solution(int[] A) {
    if(A == null || A.length < 3) return 0;

    int N = A.length;

    Arrays.sort(A);

    for(int i = 0; i < N - 2; i++) {
      if(isTriangular(A, i, i + 1, i + 2))
        return 1;
    }

    return 0;
  }

  private boolean isTriangular(int[] A, int P, int Q, int R) {
    return A[Q] > A[R] - A[P];
  }
}
