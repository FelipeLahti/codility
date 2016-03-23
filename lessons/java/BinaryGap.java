//https://codility.com/demo/results/training2AZF4B-3ZZ
import java.util.*;

class Solution {
  public boolean getBit(int N, int index) {
    return (N & (1 << index)) != 0;
  }

  public int solution(int N) {
    int max = 0, segmentSize;
    List<Integer> ones = new ArrayList<Integer>(32);

    for(int i = 0; i < 32; i++) {
      if(getBit(N, i)) {
        ones.add(i);
      }
    }

    for(int i = 1; i < ones.size(); i++) {
      segmentSize = ones.get(i) - ones.get(i-1) - 1;
      if(segmentSize > max) {
        max = segmentSize;
      }
    }

    return max;
  }
}
