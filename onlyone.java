import java.util.Scanner;
class onlyone{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next(),b=sc.next();
    boolean ketemu=false;
    if(a.length()-b.length()>1||a.length()<=b.length()){
      System.out.println("Wah, tidak bisa :(");
      System.exit(0);
    }else{
      for(int i=0;i<b.length();i++){
        if(ketemu==false){
          if(a.charAt(i)!=b.charAt(i)){
            if(a.charAt(i+1)!=b.charAt(i)){
              System.out.println("Wah, tidak bisa :(");
              System.exit(0);
            }
            ketemu=true;
          }
        }else if(a.charAt(i+1)!=b.charAt(i)){
          System.out.println("Wah, tidak bisa :(");
          System.exit(0);
        }
      }
      System.out.println("Tentu saja bisa!");
    }
  }
}
