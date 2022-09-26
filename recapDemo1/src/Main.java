public class Main {

    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 21;
        int number3 = 222;
        int highestNumber = number1;

        if(highestNumber < number2){
            highestNumber = number2;
        }
        if(highestNumber < number3){
            highestNumber = number3;
        }
        System.out.println("The highest number is " +highestNumber);

    }
}
