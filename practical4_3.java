class Student 
{
  static long enrollment_no;
  String Name;
   

 void setdata(long enrno,String n)
  {
      Student.enrollment_no=enrno;
      Name=n;
     
 }
  
void display()
     {
            System.out.println("Enrooment NO:"+Student.enrollment_no);
            System.out.println("NAME :"+Name);

     }    
Student()
  {
System.out.println("WELCOME To STUDENT INFORMATION SYSTEM");
  }
    Student(long enrno,String n)
  {
 Student.enrollment_no=enrno;
      Name=n;
    
  }
}
 
class practical4_3
 {
   public static void main(String args[])
   {
   Student s2=new Student(Long.parseLong(args[0]),args[1]);
   s2.display();
   }
}
  