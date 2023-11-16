class Product
{
  double mrp;
  int quantity;
   void display()
     {
            System.out.println("MRP:"+mrp);
            System.out.println("QUANTITY:"+quantity);

     }    

 void setdata(double mrp,int quantity)
  {
      this.mrp=mrp;
      this.quantity=quantity;
  }
Product()
  {
System.out.println("WELCOME TO SUPer market");
  }
Product(double m,int q)
  {
mrp=m;
quantity=q;
  }
}
 
class practical4_1
 {
   public static void main(String args[])
   {
   Product p2=new Product(Double.parseDouble(args[0]),Integer.parseInt(args [1]));
   p2.display();
   }
}
  