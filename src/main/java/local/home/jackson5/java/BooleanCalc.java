package local.home.jackson5.java;

public class BooleanCalc {
        public static void printOne(boolean b0, boolean b1) {
            System.out.print( b0 | b1);
            System.out.print("\t");
            System.out.print( b0 || b1);
            System.out.print("\t");
            System.out.print( b0 & b1);
            System.out.print("\t");
            System.out.print( b0 && b1);
            System.out.print("\t");
            System.out.print( b0 ^ b1);
            System.out.println("");
        }
        public static void printHeader() {
            System.out.print("    | \t || \t & \t     && \t ^ \n");
        }

        public static void main(String[] args) {
            printHeader();
            printOne(false, false);
            printOne(true, false);
            printOne(false, true);
            printOne(true, true);
        }
}
