package design_patterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        double gstAfterCalculation = LocalFinanceService.getGstAfterCalculation(1000);
        System.out.println(gstAfterCalculation);
    }
}
