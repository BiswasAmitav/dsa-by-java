package dsaWithJava;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        System.out.println("Inverted half pyramid with numbers..");

        int n=5;

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
