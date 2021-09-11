public class LuxuryPolicy implements PolicyProducer{
    
    public AutoInsurance getAutoObj() {
        return new LuxuryInsur();
    }
}
