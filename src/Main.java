public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1,12,343,676,878};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.print(max);
    }
}
