public class EMTest
{
   public static void main(String[] args)
   {
      EMDirectory emails = new EMDirectory("emdir.txt");  
      emails.listAll();
      
      
      
      
      
      
      emails.addEntry(new Name("Zach","Lin"),"zach06@gmail.com");
      emails.addEntry(new Name("Luke","Chpolasky"),"lukechpolansky@gmail.com");
      emails.addEntry(new Name("Jasmine","Bell"),"bunnyandlamby@gmail.com");
      emails.addEntry(new Name("Hailey","Morris"),"haileymorris@gmail.com");
      emails.addEntry(new Name("Edward","Lin"),"edward@gmail.com");
      
      emails.listAll();
      
      System.out.println(emails.lookUp(new Name("Ted", "Teacher")));
      System.out.println();
      
      System.out.println(emails.lookUp(new Name("Jasmine","Bell")));
      System.out.println();
      
      System.out.println(emails.lookUp(new Name("Destiny", "Vasquez")));
      System.out.println();
      
      System.out.println(emails.lookLastName("Binary"));
      System.out.println();
      
      System.out.println(emails.lookLastName("Bell"));
      System.out.println();
      
      emails.updateEmail(new Name("Edward", "Lin"), "edwardlin@gmail.com");
      
      emails.updateEmail(new Name("Zachs", "Lin"), "monekytype@gmail.com");
      
      emails.listAll();
      
      emails.removeName(new Name("Jerry", "Java"));
      
      emails.removeName(new Name("Hailey", "Morris"));
      
      emails.removeName(new Name("Alexander", "Mashhour"));
      
      emails.listAll();
      
      emails.removeLastName("Binary");
      
      emails.removeLastName("Bell");
      
      emails.removeLastName("Squarepants");
      
      emails.listAll();
      
      
      
      
     
      
      
   }
}