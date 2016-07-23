//Fish: https://codility.com/demo/results/trainingP7W8EW-6WC/

import java.util.*;

class Solution {
  public int solution(int[] A, int[] B) {
    int N = A.length, count = 0;
    Stack<Integer> q = new Stack<Integer>();
    q.add(0);

    for(int Q = 1; Q < N; Q++) {
      if(B[q.peek()] == 1 && B[Q] == 0) {
        while(!q.empty() && B[q.peek()] == 1) {
          if(A[q.peek()] < A[Q]) {
            q.pop();
          } else {
            break;
          }
        }
        if(q.empty() || B[q.peek()] == 0) q.add(Q);
      } else {
        q.add(Q);
      }
    }

    return q.size();
  }
}
