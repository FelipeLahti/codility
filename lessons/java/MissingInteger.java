//MissingInteger: https://codility.com/demo/results/trainingJHVW24-UWV

class Solution {
  public int solution(int[] A) {
    boolean[] counter = new boolean[A.length + 1];

    for(int number : A) {
      if(number > 0 && number < counter.length) {
        counter[number] = true;
      }
    }

    for(int i = 1; i < counter.length; i++) {
      if(!counter[i]) {
        return i;
      }
    }

    return counter.length; 
  }
}
