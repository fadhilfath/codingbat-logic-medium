public int noTeenSum(int a, int b, int c) {
  int result = 0;
  if(a >= 13 && a <= 19){
    result += checkIfItIsTeen(a);
  }else{ result += a; }
  if(b >= 13 && b <= 19){
    result += checkIfItIsTeen(b);
  }else{ result += b; }
  if(c >= 13 && c <= 19){
    result += checkIfItIsTeen(c);
  }else{ result += c; }
  
  return result;
}

public int checkIfItIsTeen(int n){
  if(fixTeen(n) == 0){
      return 0;
    }else{
      return n;
    }
}

public int fixTeen(int n){
  if(n == 15 || n == 16) return n;
  
  return 0;
}