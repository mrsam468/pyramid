package pyramid;

public class RightPyramid {
    public void rightPyramid(int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
