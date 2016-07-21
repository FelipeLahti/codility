//NumberOfDiscIntersections: https://codility.com/demo/results/trainingZVRW27-UCJ/

import java.util.*;
import java.lang.*;

class Solution {
  public int solution(int[] A) {
    int N = A.length;
    long[] upper = new long[N];
    long[] lower = new long[N];
    int intersections = 0, rangeLowerIndex = 0;

    for(int i = 0; i < N; i++) {
      upper[i] = i + (long)A[i];
      lower[i] = i - (long)A[i];
    }

    Arrays.sort(upper);
    Arrays.sort(lower);

    // System.out.println("Upper");
    // for(int i = 0; i < N; i++)
    //     System.out.println(upper[i]);

    // System.out.println("Lower");
    // for(int i = 0; i < N; i++)
    //     System.out.println(lower[i]);

    for(int rangeUpperIndex = 0; rangeUpperIndex < N; rangeUpperIndex++) {
      while(rangeLowerIndex < N && upper[rangeUpperIndex] >= lower[rangeLowerIndex]) {
        rangeLowerIndex += 1;
      }
      // System.out.println(String.format("Upper => %s Lower => %s Sum => %s", rangeUpperIndex, rangeLowerIndex,
      // rangeLowerIndex - rangeUpperIndex - 1));
      intersections += rangeLowerIndex - rangeUpperIndex - 1;

      if(intersections > 10000000)
        return -1;
    }

    return intersections;
  }
}
