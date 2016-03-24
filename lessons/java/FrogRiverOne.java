//FrogRiverOne: https://codility.com/demo/results/training9EPVAQ-5QR/

import java.util.*;

class Solution {
  public int solution(int X, int[] A) {
    boolean[] path = new boolean[X + 1];

    for(int i = 0; i < A.length; i++) {
      if(!path[A[i]]) {
        path[A[i]] = true;
        X--;
      }
      if(X == 0) return i;
    }

    return -1;
  }
}
