package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int x = 1;
        while (x < 11){
            int result = x * numberTableToPrint;
            System.out.println(x + " x " + numberTableToPrint + " = " + result);
            x++;
        }
    }
}
