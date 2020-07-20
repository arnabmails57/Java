public class CheckPosNegZero {
  static public void main(String[]args){
       int a=Integer.parseInt(args[0]);
       if(a==0) {
                System.out.println("The number "+a+" is zero.");
                }
        else if(a>0) {
        	System.out.println("The number "+a+" is positive.");
                     }
        else {
             System.out.println("The number "+a+" is negative.");
              }
    }
}