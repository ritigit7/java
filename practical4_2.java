class Account
{
  long Ac_No;
  String Name;
  double balance;
   

 void setdata(long acno,String n,double bal)
  {
      Ac_No=acno;
      Name=n;
      balance= bal;
 }
  void deposite(double bal)
  {
  this.balance+=bal;
   }
void display()
     {
            System.out.println("ACCOUNT NO:"+Ac_No);
            System.out.println("NAME :"+Name);
            System.out.println("BALANCE:"+balance);

     }    
Account()
  {
System.out.println("WELCOME TO BANK");
  }
    Account(long acno,String n,double bal)
  {
    Ac_No=acno;
      Name=n;
     balance=bal;
     
  }
}
 
class practical4_2
 {
   public static void main(String args[])
   {
   Account a2=new Account(Long.parseLong(args[0]),args[1],Double.parseDouble(args[2]));
   a2.display();
   }
}
  