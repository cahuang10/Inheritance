//#2
public class Adult extends Human{
  // #2-1
  public Adult(){
    super();
  }
  // #2-1
   public Adult(String name,int age){
     super(name,age);
  }
  // #2-1
  public Adult(String name,int age,Address address){
    super(name,age,address);
  }
   @Override //#2-2
  public String greet(){
    return super.greet()+", Good Morning";
  }
  // #2-3
  public String work(){
    return "I have a job";
  }
}