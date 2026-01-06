import pyramid.*;

public class Main{
    public static void main(String[] args){
        IncreasingAndDecreasingPyramid increasePyramid = new IncreasingAndDecreasingPyramid();
        increasePyramid.increasingAndDecreasingPyramid(5);
        InvertedPyramid invertedPyramid = new InvertedPyramid();
        invertedPyramid.invertedPyramid(5);
        NormalPyramid normalPyramid = new NormalPyramid();
        normalPyramid.normalPyramid(5);
        RightInvertedPyramid rightInvertedPyramid = new RightInvertedPyramid();
        rightInvertedPyramid.rightInverted(5);
        RightPyramid rightPyramid = new RightPyramid();
        rightPyramid.rightPyramid(5);
    }
}