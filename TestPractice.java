class TestPracticeC {

    public static boolean isSum2(int[] a, int num) {
        int temp = num;
        boolean c5 = wrapper2(a, temp, 0, -1);
        return c5;
    }

    public static boolean isSum(int[] a, int num) {
        int temp = num;
        boolean c3 = wrapper(a, temp, 0);
        return c3;
    }
    private static boolean wrapper(int[] a, int currentSum, int index) {
        if (currentSum == 0) {
            return true;
        }
        if (index > a.length - 1) {
            return false;
        } else {
            index++;
            boolean c1 = wrapper(a, currentSum, index);
            currentSum = currentSum - a[index];
            boolean c2 = wrapper(a, currentSum, index);
            if (c1 == true || c2 == true) {
                return true;
            }
            return false;
        }
    }
    private static boolean wrapper2(int[] a, int currentSum, int index, int last_index_wasnt_chosen) {
        if (currentSum == 0) {
            return true;
        }
        if (index > a.length - 1) {
            return false;
        } else {
            index++;
            boolean c1 = wrapper2(a, currentSum, index, index);
            boolean c2 = wrapper2(a, currentSum - a[index], index, last_index_wasnt_chosen);
            boolean c4 = (index - last_index_wasnt_chosen < 3);
            return (c1 || (c2 && c4));
        }
    }
}
