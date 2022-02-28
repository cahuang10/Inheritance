//#1
public class Human {
  private String name;
  private int age;
  private Address address; 
  //#1-1
  public Human(){
    name="unknown";
    address=new Address();
  }
  //#1-1
  public Human(String name,int age){
    this.name=name;
    this.age=age;
    address = new Address();
  }
  //#1-1
  public Human(String name,int age,Address address){
    this.name=name;
    this.age=age;
    this.address = address;
  }
  public String getName(){
    return this.name.substring(0,1).toUpperCase()+this.name.substring(1,name.length());
  }
  public void setName(String name){
    this.name=name;
  }
  public int getAge(){
    return this.age;
  }
  public void setAge(int age){
    this.age=age;
  }
  public Address getAddress(){
    return this.address;
  }
  public void setAddress(Address myadrr){
    this.address=myadrr;
  }
  //#1-2
  public int sleepHours(){
    return 8;
  }
  //#1-2
  public String eat(){
    return "Chomp chomp";
  }
  //#1-2
  public String greet(){
    return "Hello.";
  }
  //#1-2
  public String toString(){
    return "Name: "+name.substring(0,1).toUpperCase()+name.substring(1,name.length())+".\nAge: "+age+".\nAddress: "+address;
  }
}