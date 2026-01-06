package pyramid;

public class RightInvertedPyramid {
    public void rightInverted(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
//                String shape = " ".repeat(j);
                System.out.print(" ");

            }
            String pyramid = "*".repeat(i);
            System.out.print(pyramid);
            System.out.println();
        }
    }
}
