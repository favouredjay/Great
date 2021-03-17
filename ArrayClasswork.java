package chapterFour;

public class ArrayClasswork {


    public static int getAdd(int[] array) {
        int total = array[0] + array[1] + array[2];
        return total;
    }

    public static int getAverage(int[] array) {
        int total = array[0] + array[1] + array[2] / 3;
        return total;
    }

    public static int getMax(int[] array) {
        int maximumNum = array[0];
        for (int i = 1; i < array.length; i++)
            maximumNum = Math.max(array[i], maximumNum);
        return maximumNum;
    }

    public static int getMin(int[] array) {
        int minimumNum = array[0];
        for (int i = 1; i < array.length; i++)
            minimumNum = Math.min(array[i], minimumNum);
        return minimumNum;
    }



