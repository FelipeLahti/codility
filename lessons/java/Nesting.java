//Nesting: https://codility.com/demo/results/trainingVMTN6W-JEP/

import java.util.*;

class Solution {
  public int solution(String S) {
    int N = S.length();
    int openParenteses = 0;

    if(N == 0) return 1;

    for(int i = 0; i < N; i++) {
      if(S.charAt(i) == '(') {
        openParenteses++;
      } else if(openParenteses <= 0) {
        return 0;
      } else {
        openParenteses--;
      }
    }

    return openParenteses == 0 ? 1 : 0;
  }
}
