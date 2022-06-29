class Main {
  public static void main(String[] args) {
    for(int i = 1; i <=100;i++){
      System.out.print(i);
      if(i%3 == 0 || i%5 == 0){
        consolePrint(i);
      }
      System.out.println("\n");
    }
  }
  public static void consolePrint(int i){
      if(i%3==0 && i%5==0){
        System.out.print(" fizzbuzz");
      }else if(i%3==0){
        System.out.print(" fizz");
      }else if(i%5==0){
        System.out.print(" buzz");
      } 
    }
}