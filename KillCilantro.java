public class KillCilantro {
   public static String killCilantro(String str) {
      String a = "";
      String b = "";
      while (str.indexOf("cilantro") != -1) {
      a = str.substring(0, str.indexOf("cilantro"));
      b = str.substring(str.indexOf("cilantro")+ 7, str.length()+1);
            
   
      


      }
      return a;

   }
   
  public static void main(String [] args) {
  String c = "ihatecilantro";
  System.out.print(c.length());
    
  }
}