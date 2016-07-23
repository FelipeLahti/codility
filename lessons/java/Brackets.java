//Brackets: https://codility.com/demo/results/trainingNERRWZ-75R/

import java.util.*;

class Solution {
  public int solution(String S) {
    Map<Character, Character> closeOpen = new HashMap<Character,Character>();
    closeOpen.put('}', '{');
    closeOpen.put(']', '[');
    closeOpen.put(')', '(');

    if(S.length() == 0) return 1;

    Stack<Character> stack = new Stack<Character>();
    stack.add(S.charAt(0));

    for(int i = 1; i < S.length(); i++) {
      if(!closeOpen.containsKey(S.charAt(i))) {
        stack.add(S.charAt(i));
      } else {
        if(stack.empty() || closeOpen.get(S.charAt(i)) != stack.pop()) {
          return 0;
        }
      }
    }

    return stack.empty() ? 1 : 0;
    }
}
