public class Main {

    public static void main(String[] args) {
        //for
        //i++ == (i = i+1)
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("For dongusu bitti. ");

        //while
        //i =2, i+ = 2 (even)
        int i = 0;
        while(i++ < 10){
            System.out.println(i);
        }
        System.out.println("While dongusu bitti. ");

        //do while
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }
        while(j <= 10);
            System.out.println("Do-while dongusu bitti. ");
    }
}
