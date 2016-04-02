//CountDiv: https://codility.com/demo/results/trainingWZHR8S-2YX/

class Solution {
  public int solution(int A, int B, int K) {
    int smallest = (A % K) == 0 ? A : A + (K - (A % K));
    int biggest = (B % K) == 0 ? B : B - (B % K);

    return ((biggest - smallest) / K) + 1;
  }
}
