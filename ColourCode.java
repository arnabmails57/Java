public class ColourCode {
  static public void main(String[]args) {
        char colour=args[0].charAt(0);
        switch(colour){
        case 'R':
        System.out.println("R->Red");
        break;
        case 'B':
        System.out.println("B->Blue");
        break; 
        case 'G':
        System.out.println("G->Green");
        break;
        case 'O':
        System.out.println("O->Orange");
        break;
        case 'Y':
        System.out.println("Y->Yellow");
        break;
        case 'W':
        System.out.println("W->White");
        break;
        default:
        System.out.println("Invalid Code");
        }
    }
}