public class add_VarArg {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum is : "+ sum(2, 3, 4));
        System.out.println("The sum is : " +sum(20, 30, 40));
    }
}
