public class Main {

    public static void main(String[] args) {

        char grade = 'F';

        switch(grade){
            case 'A':
                System.out.println("Perfect, you passed. ");
                break;
            case 'B':
                System.out.println("Pretty good, you passed. ");
                break;
            case 'C':
                System.out.println("Good, you passed. ");
                break;
            case 'D':
                System.out.println("Not bad, You passed. ");
                break;
            case 'F':
                System.out.println("You failed. ");
                break;
            default:
                System.out.println("You entered wrong note.");
        }
    }
}
