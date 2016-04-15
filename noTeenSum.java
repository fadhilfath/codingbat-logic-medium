public int noTeenSum(int a, int b, int c) {
  int result = 0;
  if(a >= 13 && a <= 19){
    if(fixTeen(a) == 0){
      result += 0;
    }else{
      result += a;
    }
  }else{ result += a; }
  if(b >= 13 && b <= 19){
    if(fixTeen(b) == 0){
      result += 0;
    }else{
      result += b;
    }
  }else{ result += b; }
  if(c >= 13 && c <= 19){
    if(fixTeen(c) == 0){
      result += 0;
    }else{
      result += c;
    }
  }else{ result += c; }
  
  return result;
}

public int fixTeen(int n){
  if(n == 15 || n == 16) return n;
  
  return 0;
}
