package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String empty = " ", star = "*";
        int i = cathetusLength - 1, x = 1;
        while (x <= cathetusLength){
            System.out.println(empty.repeat(i) + star.repeat(x));
            i--; 
            x++;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
