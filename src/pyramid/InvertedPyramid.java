package pyramid;

public class InvertedPyramid {
    public void invertedPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
