public class Main {

    public static void main(String[] args) {

        int number = 34;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if(number == 1){
            System.out.println("Number is not prime.");
            return;
        }
        if(number < 1){
            System.out.println("Wrong number. ");
            return;
        }

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = true;
            }
        }

        if(isPrime == true){ //(isPrime ile icine yazilan sey esit anlam icerir.
            System.out.println("Number is prime. ");
        }
        else{
            System.out.println("Number is not prime. ");
        }




    }
}