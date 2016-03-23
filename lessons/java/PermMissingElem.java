//PermMissingElem: https://codility.com/demo/results/trainingYH8D63-8XR/

class Solution {
  public int solution(int[] A) {
    long N = A.length + 1;

    long sumNumbers = N * (N + 1) / 2;

    for(int i : A) {
      sumNumbers -= i;
    }

    return (int)sumNumbers;
  }
}
