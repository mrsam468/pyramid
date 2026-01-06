package pyramid;

public class InvertedPyramid {
    public void invertedPyramid(int n){
        for(int i=n;i>0;i--){
            String shape = "*".repeat(i);
            System.out.println(shape);
        }
    }
}
