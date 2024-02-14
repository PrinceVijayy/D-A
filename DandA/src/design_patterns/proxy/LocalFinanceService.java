package design_patterns.proxy;

public class LocalFinanceService {
    public static double getGstAfterCalculation(double amountWithoutGst){
        return RemoteFinanceService.calculateGst(amountWithoutGst);
    }
}
