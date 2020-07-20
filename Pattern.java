public class Pattern {
  static public void main(String[]args){
       int a=Integer.parseInt(args[0]);
       if(args.length==0){
             System.out.println("Please enter an integer number");
        }
       else{
        for(int i=0;i<a;i++){
          for(int j=0;j<=i;j++){
             System.out.print("* ");
            }
          System.out.println();
          }
        }
    }
}