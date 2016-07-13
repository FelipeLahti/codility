//GenomicRangeQuery: https://codility.com/demo/results/training2TWV73-UMQ/

class Solution {
  public int[] solution(String S, int[] P, int[] Q) {
    int[] result = new int[P.length];
    int[][] prefixSum = new int[3][S.length() + 1];
    int a,c,g;

    for(int i = 1; i < S.length() + 1; i++) {
      a = c = g = 0;

      if(S.charAt(i-1) == 'A') a = 1;
      if(S.charAt(i-1) == 'C') c = 2;
      if(S.charAt(i-1) == 'G') g = 3;

      prefixSum[0][i] = prefixSum[0][i - 1] + a;
      prefixSum[1][i] = prefixSum[1][i - 1] + c;
      prefixSum[2][i] = prefixSum[2][i - 1] + g;
    }

    for(int k = 0; k < P.length; k++) {
      result[k] = minGenomeSlice(P[k], Q[k], prefixSum);
    }

    return result;
  }

  public int minGenomeSlice(int p, int q, int[][] prefix) {
    if(prefix[0][q+1] - prefix[0][p] != 0) {
      return 1;
    }

    if(prefix[1][q+1] - prefix[1][p] != 0) {
      return 2;
    }

    if(prefix[2][q+1] - prefix[2][p] != 0) {
      return 3;
    }

    return 4;
  }
}
