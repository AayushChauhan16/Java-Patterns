public class AdvancePatterns {
    public static void main(String args[]) {
        // 1) Butterfly pattern:

        // Upper part
        System.out.println("Butterfly pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (4 - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {  
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= 2 * (4 - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 2) Solid Rhombus:
        System.out.println("Solid Rhombus:");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 3) Number pyramid:
        System.out.println("Number pyramid: ");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 4) Palindromic pattern:
        System.out.println("Palindromic pattern: ");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5) Diamond pattern: 
        System.out.println("Diamond pattern: ");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++){
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=5; i>=1; i--){
            for(int j=1; j<=(5-i); j++){
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
