//OddOccurrencesInArray: https://codility.com/demo/results/trainingU2N2AE-Z5F

class Solution {
  public int solution(int[] A) {
    int unpaired = 0;

    for(int number : A) {
      unpaired ^= number;
    }

    return unpaired;
  }
}
