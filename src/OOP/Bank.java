package OOP;

public class Bank {
    private String acctNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;


    public Bank(){
        System.out.println("Empty constructor ");
    }
    public Bank(String acctNumber,double balance,String name,String email,String phoneNumber){
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

public void setAcctNumber(String acctNumber){
    this.acctNumber = acctNumber;
}
public String getAcctNumber(){
    return acctNumber;
}
public void setBalance(double balance){
    this.balance = balance;
}
public double getBalance(){
    return balance;
}
public void setName(String name){
    this.name = name;
}
public String name(){
    return name;
}
public void setEmail(String email){
    this.email = email;
}
public String getEmail(){
    return email;
}
public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
}
public String getPhoneNumber(){
    return phoneNumber;
}
public void deposit(double depositAmount){
    this.balance += depositAmount;
}
public void withdraw(double withdrawalAmount){
    if (this.balance - withdrawalAmount <= 0){
        System.out.println("only " + this.balance + "available withdrawal not processed");
    }else{
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance " + balance);
    }
}


}
