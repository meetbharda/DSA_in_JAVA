public class Patterns {

    public static void hollow_rectangle(int totRows, int totCols) {
        // outer Loop
        for(int i=1; i<=totRows; i++){
            //inner loop
            for(int j=1; j<=totCols; j++){

                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid() {
        for(int i=1; i<=4; i++){
            for(int j=4-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(7, 10);
        inverted_rotated_half_pyramid();
    }
}