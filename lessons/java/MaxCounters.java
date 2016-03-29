//MaxCounters: https://codility.com/demo/results/training7VP4D6-5QN/

import java.lang.*;

class Solution {
  public int[] solution(int N, int[] A) {
    int[] counter = new int[N];
    int max = 0, lastMaxAllOp = 0;

    //O(M)
    for(int k = 0; k < A.length; k++) {
      if(A[k] >= 1 && A[k] <= N) {
        int index = A[k]-1;

        if(counter[index] < lastMaxAllOp) {
          counter[index] = lastMaxAllOp;
        }

        counter[index]++;    
        max = Math.max(max, counter[index]);
      } else if(A[k] == N + 1) {
        lastMaxAllOp = max;
      }
    }

    //O(N)
    for(int i = 0; i < counter.length; i++) {
      if(counter[i] < lastMaxAllOp) {
        counter[i] = lastMaxAllOp;
      }
    }

    return counter;
  }
}
