public boolean makeBricks(int small, int big, int goal) {
  // fail # 1: Not enough breaks
  if(goal > big * 5 + small) return false;
  
  // fail #2: Not enough small breaks
  int smBreaks = goal % 5;
  if(small < smBreaks) return false;
  
  
  return true;
}
