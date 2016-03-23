//CyclicRotation: https://codility.com/demo/results/training69W2CV-XV8

class Solution {

  public void shiftRightByOneIndex(int[] A) {
    int temp = A[A.length - 1];

    for(int i = A.length - 1; i > 0; i--) {
      A[i] = A[i - 1];
    }

    A[0] = temp;
  }

  public int[] solution(int[] A, int K) {
    if(A == null) {
      return new int[]{};
    }

    if(A.length <= 1) {
      return A;
    }

    while(K-- != 0) {
      shiftRightByOneIndex(A);
    }
    return A;
  }
}
