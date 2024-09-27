package org.example;

public class SavingAccount {
    public static double AnnualInterestRate;
    private double SavingBalance;
    //

    public SavingAccount(double savingBalance) {
        setSavingBalance(savingBalance);
    }

    public static double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }
    public double CalculateMounthlyInterest(){
        return (getAnnualInterestRate() * getSavingBalance()) / 12;
    }
}
