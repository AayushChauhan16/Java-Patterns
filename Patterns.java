public class Patterns {
    public static void main(String args[]) {

        /*
         * 1) Solid rectangle :
         *****
         *****
         *****
         */
        System.out.println("Solid rectangle: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        /*
         * 2) Hollow rectangle:
         *****
         * *
         * *
         *****
         */
        System.out.println("Hollow Rectangle: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        /*
         * 3) Half pyramid:
         *
         * *
         * * *
         * * * *
         */
        System.out.println("Half pyramid: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
         * 4) Inverted half pyramid:
         * * * *
         * * *
         * *
         * 
         */
        System.out.println("Inverted half pyramid: ");
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
         * 5) Rotated half pyramid:
         */
        System.out.println("Rotated half pyramid: ");
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * 6) Number pyramid:
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        System.out.println("Number pyramid");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * 7) Inverted number pyramid:
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        System.out.println("Inverted number pyramid: ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        /*
         * 8) Floyd's triangle:
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        System.out.println("Floyd's triangle");
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println();
       

        /*
         * 9) 0-1 triangle:
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         */
        System.out.println("0-1 triangle: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
