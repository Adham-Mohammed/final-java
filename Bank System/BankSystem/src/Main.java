import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc= new Scanner(System.in);
		 
        data mydata = new data();
        
        for (int i = 0; i < 3; i++) {
           String name=sc.nextLine();
           String pw=sc.nextLine();
           mydata.createAcc(name,pw,i);
        }
        
        // acc1.setID();
        // Account acc2 = new Account();
        // acc2.setName("basel");
        
        
        // System.out.println(acc2.getName() + " " + acc2.getID());
    }
}
