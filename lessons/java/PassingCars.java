//PassingCars: https://codility.com/demo/results/trainingJ93YY6-GRW/

//O(N)
class Solution {
  public int solution(int[] A) {
    int travelingEast = 0;
    int passingCars = 0;
    for(int i = 0; i < A.length; i++) {
      if(A[i] == 0) {
        travelingEast++;
      } else {
        passingCars += travelingEast;
        if(passingCars > 1000000000L) {
          return -1;
        }
      }
    }
    return passingCars;
  }
}
// O(N^2)
// class Solution {
//     public int solution(int[] A) {
//         int passingCars = 0;
//         for(int i = 0; i < A.length; i++) {
//             for(int j = i + 1; j < A.length; j++) {
//                 if(A[j] == 1 && A[i] == 0) {
//                     passingCars++;
//                 }
//             }
//         }
//         return passingCars;
//     }
// }
