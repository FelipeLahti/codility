//TapeEquilibrium: https://codility.com/demo/results/trainingQZ6A4Y-5GD/

class Solution {
  public int solution(int[] A) {
    int min = Integer.MAX_VALUE, left, right;
    int[] temp = new int[A.length];

    // Acumulative sum
      temp[0] = A[0];
    for(int i = 1; i < A.length; i++) {
      temp[i] = A[i] + temp[i - 1];
    }

    //Find the min difference
    for(int i = 0; i < A.length - 1; i++) {
      left = temp[i];
      right = temp[A.length - 1] - left;

      if(Math.abs(left - right) < min) {
        min = Math.abs(left - right);
      }
    }

    return min;
  }
}
