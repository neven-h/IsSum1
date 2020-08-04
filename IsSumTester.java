public class IsSumTester {

    public static void main(String[] args) {
        System.out.println("*****Tester*****");

        int[] a1 = {1, 5, 7, 8, 4, 2, 4, 6, 9};
        int[] a2 = {2, 3, 4, 5, 6};
        int[] a3 = {81, 7, 56, 3, 1, 8};
        int[] a4 = {22, 1, 98, 7, 13, 9, 6};

        int num1 = 16;
        int num2 = 15;
        int num3 = 19;
        int num4 = 5;

        System.out.println("\n isSum test :");
        System.out.println(TestPractice.isSum2(a1, num1) ? "Test Passed" : "Test Failed");

        System.out.println("\n isSum test :");
        System.out.println(TestPractice.isSum2(a2, num2) ? "Test Passed" : "Test Failed");

        System.out.println("\n isSum test :");
        System.out.println(TestPractice.isSum2(a3, num3) ? "Test Passed" : "Test Failed");

        System.out.println("\n isSum test :");
        System.out.println(TestPractice.isSum2(a4, num4) ? "Test Passed" : "Test Failed");
    }


}

