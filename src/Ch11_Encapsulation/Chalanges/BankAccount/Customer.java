package Ch11_Encapsulation.Chalanges.BankAccount;

public class Customer {

    static void main(String[] args) {
        BankAccount firstCustomer = new BankAccount("Sujit Tomar");
        firstCustomer.deposit(500);
        System.out.println(firstCustomer.getBankBalance());
        firstCustomer.withdraw(1000);
        System.out.println(firstCustomer.getBankBalance());
        firstCustomer.withdraw(-1000);
        System.out.println(firstCustomer.getAccountNumber());
    }
}
