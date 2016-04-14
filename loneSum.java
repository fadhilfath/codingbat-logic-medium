public int loneSum(int a, int b, int c) {
  if(a != b && b != c && c != a){
    return a + b + c;
  }else{
    if(a == b && b == c && c == a) return 0;
    if(a == b) return c;
    if(a == c) return b;
    if(b == c) return a;
  }
  
  return 0;
}
