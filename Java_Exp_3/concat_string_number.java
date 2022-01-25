/*Java program to concatenate two numbers and strings using method
overloading concept.*/
public class concat_string_number {
  public static void main(String args[])
   {
   concat_string_number Obj=new concat_string_number();
   Obj.consum(5+""+6);
   Obj.consum("Sarah"+" "+"Akku");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
}
