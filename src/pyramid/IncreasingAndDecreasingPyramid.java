package pyramid;

public class IncreasingAndDecreasingPyramid {
    public void increasingAndDecreasingPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
