package interfaces;

public class Phone implements Rate {
    private int monthlyPayment;
    private int monthlyRatePayment;

    public Phone(int monthlyPayment, int monthlyRatePayment) {
        this.monthlyPayment = monthlyPayment;
        this.monthlyRatePayment = monthlyRatePayment;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public int getMonthlyRatePayment() {
        return monthlyRatePayment;
    }

    @Override
    public int monthlyRate() {
        return monthlyRatePayment * 100 / monthlyPayment;
    }

    @Override
    public void printInfo() {
        System.out.println("monthly rate for " + getMonthlyPayment() + " monthly payment and " + getMonthlyRatePayment() + " monthly rate payment is " + monthlyRate() + "%");
    }

}
