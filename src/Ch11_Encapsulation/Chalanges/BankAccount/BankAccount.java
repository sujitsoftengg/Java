package Ch11_Encapsulation.Chalanges.BankAccount;
import java.util.Arrays;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private long bankBalance;

    private long[] amountDepositHistory;
    private long[] amountWithdrawalHistory;


    public BankAccount(String accountHolderName){

        if (accountHolderName == null || accountHolderName.isBlank()){
            throw new IllegalArgumentException(
                    "Account Holder name cannot be null or blank"
            );
        }
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumberGenerator();

        amountDepositHistory = new long[0];
        amountWithdrawalHistory = new long[0];
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        if (accountHolderName == null || accountHolderName.isBlank()){
            throw new IllegalArgumentException(
                    "Account Holder name cannot be null or blank"
            );
        }else {
            this.accountHolderName = accountHolderName;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public long getBankBalance(){
        return bankBalance;
    }

    public long[] getAmountDepositHistory(){
        return Arrays.copyOf(amountDepositHistory, amountDepositHistory.length);
    }

    public void printAmountDepositHistory(){
        for(long num : amountDepositHistory){
            System.out.println(num);
        }
    }

    public long[] getAmountWithdrawalHistory(){
        return Arrays.copyOf(amountWithdrawalHistory, amountWithdrawalHistory.length);
    }

    public void printAmountWithdrawalHistory(){
        for(long num : amountWithdrawalHistory){
            System.out.println(num);
        }
    }

    public void deposit(int depositAmount){
       if (depositAmount <= 0){
           System.out.println("Invalid Amount");
       }else if(bankBalance > Long.MAX_VALUE - depositAmount){
           System.out.println("Balance Overflow");
       }else {
           this.bankBalance += depositAmount;

           amountDepositHistory = Arrays.copyOf(
                   amountDepositHistory,
                   amountDepositHistory.length + 1
           );
           amountDepositHistory[amountDepositHistory.length-1] = depositAmount;
       }
    }

    public void withdraw(int withdrawAmount){
        if (withdrawAmount <= 0){
            System.out.println("Invalid Amount");
        }else {
            if (withdrawAmount <= bankBalance){
                this.bankBalance -= withdrawAmount;

                amountWithdrawalHistory = Arrays.copyOf(
                        amountWithdrawalHistory,
                        amountWithdrawalHistory.length + 1
                );

                amountWithdrawalHistory[amountWithdrawalHistory.length-1] = withdrawAmount;
            }else {
                System.out.println("Balance Not Available as per your required");
            }
        }
    }

    public static String accountNumberGenerator(){
        String accountNumber = "";
        for (int i=0; i < 10; i++){
            int num = (int) (Math.random()*10);
            accountNumber += num;
        }
        return accountNumber;

    }


}
