public class Main {
    public static void main(String[] args) {

        int[] threePines = new int [3];
        threePines [0] = 1;
        threePines [1] = 2;
        threePines [2] = 3;
        System.out.println(threePines [0] + ", " + threePines[1] + ", " + threePines[2]);

        double [] firewood = {1.57, 7.654, 9.986};
        System.out.println(firewood [0] + ", " + firewood [1] + ", " + firewood [2]);

        int [] sawdust = {9, 11, 8, 6, 10};
        System.out.println(sawdust [0] + ", " + sawdust [1] + ", " + sawdust [2] + ", " + sawdust [3] + ", " + sawdust [4]);


        System.out.println();
        System.out.println("задача 3");


        for (int i = 2; i >= 0; i--) {
                System.out.print(threePines[i] + ", ");
            }

        System.out.println(" ");

        for (int i = 2; i >=0; i--) {
            System.out.print(firewood[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 4; i >= 0; i--) {
            System.out.print (sawdust[i] + ",\s");
        }
        System.out.println("\n");


        System.out.println();
        System.out.println("задача 4");

//        int i = threePines [i];

        for (int i = 0; i <= 2; i++) {
            if ((i & 1) == 0) {
                System.out.print(++threePines[i] + ", ");}

            else {
                System.out.print(threePines[i] + ", ");}


        }
    }
}