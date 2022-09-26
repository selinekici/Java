public class Main {

    public static void main(String[] args) {
        String student1 = "Selin";
        String student2 = "Baran";
        String student3 = "Mehmet";
        String student4 = "Ayse";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("******************");

        //arrays
        String [] students = new String[4];

        students[0] = "Selin";
        students[1] = "Baran";
        students[2] = "Mehmet";
        students[3] = "Ayse";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("***************");

        for(String studentt:students){
            System.out.println(studentt);
        }


    }
}
