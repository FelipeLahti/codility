//FrogJmp: https://codility.com/demo/results/trainingA2EF5K-V2X/

import java.lang.*;

class Solution {
  public int solution(int X, int Y, int D) {
    return (int) Math.ceil((Y - X) / (double) D);
  }
}
