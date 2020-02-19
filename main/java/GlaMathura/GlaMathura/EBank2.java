package GlaMathura.GlaMathura;

import java.util.Random;
import java.util.Scanner;

public class EBank2 {
	long accountBalance;  
	
	public void createAccount(EBank1 e1)throws InterruptedException
	{
		Random rand = new Random();
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("----------------Welcome to Account Creation Portal-------------------");
       
        e1.setAccountNumber(rand.nextInt(1000));
        
        System.out.println("Enter your Address Fields");
        System.out.println("Enter your Address Line 1");
        
        e1.setAddressline1(scan.nextLine());
        
		
		  System.out.println("Enter your Address Line 2");
		  e1.setAddressline2(scan.nextLine());
		  System.out.println("Enter your City Name"); 
		  e1.setCity(scan.next());
		  System.out.println("Enter your State Name"); 
		  e1.setState(scan.next());
		  System.out.println("Enter your Country Name");
		  e1.setCountry(scan.next()); 
		  System.out.println("Enter your Zip code");
		  e1.setZip(scan.nextInt()); 
        
        System.out.println("Enter Your Name(Without Space Between Name) : ");
        
        e1.setAccountHolderName(scan.next());
        
        
        System.out.println("Enter New Password : ");  
        e1.setPassword(scan.next());
        
        System.out.println("Enter Contact Number : "); 
        e1.setContact(scan.nextLong());
        
        System.out.println("Enter Aadhar Number : "); 
        e1.setAadhar(scan.nextLong());
        
        System.out.println("Enter PAN Number : "); 
        e1.setPan(scan.nextLong());
        
        System.out.println("Enter DOB : "); 
        e1.setDob(scan.next());
        
        System.out.println("Enter Gender : "); 
        e1.setGender(scan.next());
        
        System.out.println("Enter Your Account Type Savings/Current");
        e1.setAccountType(scan.next());
        
        System.out.println("Enter your starting balance : ");
        e1.setAccountBalance(scan.nextLong());
        
        bal:if(e1.getAccountBalance()<5000){
            System.out.println("Oops!!! Your Account balance should be minimum 5000 or more.\nYou need to fill the form again.");
            System.exit(0);
        }

        System.out.println("Account Created Successfully.\nYour Account Number is: "+e1.getAccountNumber()+" Please Note it Down.");
        System.out.println("------------------------------------------------------------");
      
        Thread.sleep(5000);
        System.out.flush();
	}
	
	
	public void DisplayAccount(EBank1 e1) throws InterruptedException
    {
        System.out.println("Displaying Account Information for Account Number : "+e1.getAccountNumber());
        System.out.println("------------------------------------------------------------");
        System.out.println("Account Number  : "+e1.getAccountNumber());
        System.out.println("Account Name    : "+e1.getAccountHolderName());
        System.out.println("Contact Number  : "+e1.getContact());
        System.out.println("Aadhar  Number  : "+e1.getAadhar());
        System.out.println("PAN  Number     : "+e1.getPan());
        System.out.println("Date of Birth   : "+e1.getDob());
        System.out.println("Gender          : "+e1.getGender());
        System.out.println("Account Type    : "+e1.getAccountType());
        System.out.println("Account balance : "+e1.getAccountBalance());
        System.out.println("Your Password   : _Hidden_"); 
        System.out.println("------------------------------------------------------------");
        Thread.sleep(5000);
        System.out.flush();
    }
	
	
	 public void DepositAmount(EBank1 e1) throws InterruptedException
	    {
	        Scanner scan = new Scanner(System.in); 
	        long depositAmt;
	        System.out.println("---------------Welcome to Deposit Portal----------------");
	        System.out.println("You are Depositing amount for Account Number: "+e1.getAccountNumber());
	        System.out.println("\nEnter the Amount to Deposit : ");
	        depositAmt=scan.nextLong();
	        accountBalance=e1.getAccountBalance()+depositAmt;
	        System.out.println("Amount Deposited Successfully.. \nUpdated Balance: "+accountBalance);
	        System.out.println("------------------------------------------------------------");
	        Thread.sleep(5000);
	        System.out.flush();
	    }
	
	  public void WithdrawAmount(EBank1 e1) throws InterruptedException
	    {
	        Scanner scan = new Scanner(System.in); 
	        long withdrawAmt;
	        System.out.println("---------------Welcome to Deposit Portal----------------");
	        System.out.println("You are Withdrawing amount for Account Number: "+e1.getAccountNumber());
	        System.out.println("\nEnter the Amount to Withdraw : ");
	        withdrawAmt=scan.nextLong();
	        accountBalance=accountBalance-withdrawAmt;
	        System.out.println("Amount Withdrawn Successfully.. \nUpdated Balance: "+accountBalance);
	        System.out.println("------------------------------------------------------------");
	        Thread.sleep(5000);
	        System.out.flush();
	    }
	  
	  
	  public void login(EBank1 e1) throws InterruptedException
	    {
	        int ch=0;
	        Scanner scan = new Scanner(System.in);
	        long accNum=0;
	        String passWd="0";
	        System.out.println("Enter Account Number : ");
	        accNum=scan.nextLong();
	        System.out.println("Enter Your Password  : ");
	        passWd=scan.next();           
	        if (accNum==e1.getAccountNumber() && passWd.equals(passWd)) {
	            System.out.println("Logged In Successfully with account number: "+e1.getAccountNumber()+"\n-------------------------------------");   
	            System.out.println("Choose Option Number From Below Menu");
	            System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Display Account Info\n4.Close Account\n5.Exit");
	            ch=scan.nextInt();
	            switch(ch)
	            {
	                case 1: DepositAmount(e1);
	                        break;
	                case 2: WithdrawAmount(e1);
	                        break;
	                case 3: DisplayAccount(e1);
	                        break;
	                case 4: System.out.println("You cannot close your account. Feature Coming Soon...");
	                        break;
	                case 5: System.exit(0);
	                        break;
	            }
	        } 
	        else if(accNum!=e1.getAccountNumber() && passWd!=e1.getPassword()) {
	            System.out.println("You have Entered Incorrect Account Number or Password. Please Check Again.");
	            Thread.sleep(5000);
	            System.out.flush();
	            System.exit(0);
	        }
	        else{
	            System.out.println("Unknown Error Occured. Try Agian Later");
	            Thread.sleep(5000);
	            System.out.flush();
	            System.exit(0);
	        }
	    }



	    EBank2()
	    {
	        int accountNumber = 0000;
	        String AccountHolderName = "UNDEFINED";
	        String AccountType = "UNDEFINED";
	        accountBalance=0000;
	        int accountNumberGenerator = 0000;
	        int AccTypeNumVal = 9;  
	    	String Addressline1="UNDEFINED";
	    	String Addressline2="UNDEFINED";
	    	String city="";
	    	String state="";
	    	String country="";
	    	int zip=0;
	    	long contact=0000000;
	    	long aadhar=00000000;
	    	long pan=000000;
	        String dob="";
	        String gender="";
	    }
	
	

public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in); 
   EBank2 a1=new EBank2();
   EBank1  ee=new EBank1();
    int ch;
    int i=0;
    System.out.println("Welcome to Bank E Portal\n");
   while(i!=5)
   {
    System.out.println("Select any Choice Number From below menu...");
    System.out.println("1. Create Account\n2. Login\n3. Exit Portal");
    System.out.print("Enter Your Choice Code 1-4: ");
    ch=scan.nextInt();
    switch(ch)
    {
        case 1: a1.createAccount(ee);
                break;

        case 2: a1.login(ee);
                break; 

        case 3: System.exit(0);
                break;

    }

   }
}
}
