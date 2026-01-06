package pyramid;

public class NormalPyramid {
    public void normalPyramid(int n){
        for(int i=1;i<=n;i++){
            String shape = "*".repeat(i);
            System.out.println(shape);
        }
    }
}
