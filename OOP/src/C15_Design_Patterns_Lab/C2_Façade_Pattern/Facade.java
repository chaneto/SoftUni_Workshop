package C15_Design_Patterns_Lab.C2_Façade_Pattern;

public class Facade {
    private MyPaimentAPI myPaimentAPI;

    public Facade(MyPaimentAPI paimentApi) {
        this.myPaimentAPI = paimentApi;
    }
    public void paySubscription(){

    }
    public void loadPayment(){

    }
}
