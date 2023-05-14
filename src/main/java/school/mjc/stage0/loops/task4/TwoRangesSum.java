package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int number, int lastInRow) {
        if(lastInRow < number) {
            System.out.println("number to skip is bigger then the last");
            return;
        }else if(lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int first = number*(number+1) / 2;
        int second = lastInRow*(lastInRow+1) / 2;

        System.out.printf("skipped sum is %d\ncounted sum is %d\n", first, second-first);
    }
}
