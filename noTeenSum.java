public int noTeenSum(int a, int b, int c) {
  int result = 0;
  if(checkTeensRange(a)){
    result += checkIfItIsTeen(a);
  }else{ result += a; }
  if(checkTeensRange(b)){
    result += checkIfItIsTeen(b);
  }else{ result += b; }
  if(checkTeensRange(c)){
    result += checkIfItIsTeen(c);
  }else{ result += c; }
  
  return result;
}

public boolean checkTeensRange(int n){
  return n >= 13 && n <= 19;
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
