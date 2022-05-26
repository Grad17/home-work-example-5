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


        for (int i = threePines.length - 1; i >= 0; i--) {
            if (i == 0 ) {
                System.out.print (threePines[i]);
            } else
                System.out.print (threePines[i] + ", ");
            }

        System.out.println();

        for (int i = firewood.length - 1; i >= 0; i--) {
            if (i == 0 ) {
                System.out.print (firewood[i]);
            } else
                System.out.print (firewood[i] + ", ");
        }

        System.out.println();

        for (int i = sawdust.length - 1; i >= 0; i--) {
            if (i == 0 ) {
                System.out.print (sawdust[i]);
            } else
                System.out.print (sawdust[i] + ", ");
        }

        System.out.println("\n");


        System.out.println("задача 4\n");

        for (int i = 0; i <= threePines.length - 1; i++) {
            if ((i & 1) == 0) {
                threePines[i] ++;
            }
            if (i == threePines.length - 1) {
                System.out.print (threePines[i]);
            }else
                System.out.print (threePines[i] + ", ");
        }
    }
}



