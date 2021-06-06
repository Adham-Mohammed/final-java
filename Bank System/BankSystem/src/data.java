public class data {
    Account accounts[] = new Account[3] ;

    public void createAcc(String name,String pw,int id){
        
        Account acc = new Account();
        accounts[id]= acc;
        acc.setName(name);
        acc.setPassword(pw);
        acc.setID(id+1);
        System.out.println(acc.getName() + " " + acc.getID());  
    }

    public void deposit(int id, double money) {
        Account acc = accounts[id];
        double currentBalance = acc.getBalance();
        if(currentBalance == 0){
           acc.setBalance(money); 
        }else{
           acc.setBalance( currentBalance + money); 
        }
        
    }

    
    
}
