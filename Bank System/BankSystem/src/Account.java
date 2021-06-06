
public class Account {
    private String clientName;
    private String password;
    private int ID;
    private boolean status;
    private double creditCard;
    private double balance;

    
    private int numOfAcc;

    
    
    public Account(){
        numOfAcc = 0;
        numOfAcc++;
    }
    //set customer name
    public void setName(String name) {
        this.clientName = name;
    }
    //set customer pw
    public void setPassword(String pw) {
        this.password = pw;
    }
    // set customer status
    public void setStatus(boolean status) {
        this.status = status;
    }
    // set customer credit amount
    public void setCredit(double credit){
        this.creditCard = credit;
    }
    // set customer balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    // set customer ID
    public void setID(int id){
        ID = id;
        // return ID;
    }


    //get customer name
    public String getName() {
        return this.clientName;
    }
    //get customer name
    public String getPassword() {
        return this.password;
    }
    //get customer status
    public boolean getStatus() {
        return this.status;
    }
    //get customer credit amount
    public double getCredit() {
        return this.creditCard;
    }
    //get customer balance
    public double getBalance() {
        return this.balance;
    }
    //get customer ID
    public int getID() {
        return this.ID;
    }
}
