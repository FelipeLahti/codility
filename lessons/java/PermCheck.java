//PermCheck: https://codility.com/demo/results/training2E4R44-H7G

class Solution {
  public int solution(int[] A) {
    boolean[] counter = new boolean[A.length + 1];
    int N = A.length;

    for(int value : A) {
      if(value > N || value < 1) return 0;
      if(counter[value]) return 0;
      counter[value] = true;
    }

    return 1;
  }
}

