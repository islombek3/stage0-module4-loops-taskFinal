package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String empty = " ";
        int l = cathetusLength, x = 1;
        String xString = "";
        while (l > 0){
            if (l == cathetusLength){
                xString = "" + x + xString;
            } else {
                xString = "" + x + xString + x;
            }
            System.out.println(empty.repeat(l-1) + xString);
            l--;
            x++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
