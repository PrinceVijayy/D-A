package design_patterns.proxy;

public class RemoteFinanceService {
    public static double calculateGst(double basicAmount){
        return basicAmount+ (basicAmount/100)* 18;
    }
}
