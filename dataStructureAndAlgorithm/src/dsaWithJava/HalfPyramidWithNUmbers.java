package dsaWithJava;

public class HalfPyramidWithNUmbers {
    public static void main(String[] args) {
        System.out.println("half pyramid with Numbers..");
        int n=5;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
