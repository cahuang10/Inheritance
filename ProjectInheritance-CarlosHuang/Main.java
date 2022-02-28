//#3
import java.util.*;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    //#2-6
    ArrayList <Human> people = new ArrayList <Human>();
    people.add(new Adult("Marcus",42,new Address("122 Cayuga","Sf","CA",94412)));
    people.add(new Teenager("alex",12,true));
    people.add(new Human ("David",49,new Address("144 paris","San Diego","CA",90345)));

    System.out.println();
    //#2-4
    for (Human elem :people){
       System.out.println(elem.greet());
      System.out.println(elem);
      System.out.println(elem.getName()+" who is "+elem.getAge()+" years old, \nmakes \""+elem.eat()+"\" when eating, and sleeps "+elem.sleepHours()+" hours.");
      System.out.println();
      }
    System.out.println("--------------------------------------------------------\nDowncasting:");
    //#2-5
    Human robert= new Adult("robert",56,new Address());
    Human rober= new Teenager("caio",15,new Address(),false);
    System.out.println();
    System.out.println(((Adult)robert).work());
    System.out.println();
    System.out.println(((Teenager)rober).socialMedia());

  }
}
//  public int sleepHours(){
//     return 8;
//   }
//   public String eat(){
//     return "Chomp chomp";
//   }
//   public String greet(){
//     return "Hello";
//   }