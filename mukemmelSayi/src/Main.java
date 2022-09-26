public class Main {

    public static void main(String[] args) {
        //6 mukemmel bir sayidir. 1 e bolunur 2 ye bolunur 3 e bolunur 1+2+3 = 6
        //28------> 1,2,4,7,14

        int number = 6;
        int total = 0;

        if(number < 0 ){
            System.out.println("Wrong number.");
            return;
        }

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total = total + i;
            }
        }
        if(total == number){
            System.out.println("This is perfect number.");
        }
        else{
            System.out.println("This is not perfect number.");
        }

    }
}
