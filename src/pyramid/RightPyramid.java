package pyramid;

public class RightPyramid {
    public void rightPyramid(int n){
        for (int i=0;i<n;i++){

            for(int j=i;j<n;j++){
                System.out.print(" ");

            }
            String pyramid = "*".repeat(i+1);
            System.out.print(pyramid);
            System.out.println();

        }
    }
}
