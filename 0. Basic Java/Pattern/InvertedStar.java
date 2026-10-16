import java.util.Scanner;;
public class InvertedStar {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-i+1; j>=1; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
