//#2
public class Teenager extends Human{
  private boolean atSchool;
  // #2-1
  public Teenager(){
     super();
    atSchool=true;
  }
  // #2-1
  public Teenager(String name,int age,boolean atSchool ){
     super(name,age);
     this.atSchool=atSchool;
  }
  // #2-1
  public Teenager(String name,int age,Address address,boolean atSchool){
    super(name,age,address);
    this.atSchool=atSchool;
  }
   public boolean getAtSchool(){
    return this.atSchool;
  }
  public void setAtSchool(int age){
    this.atSchool=atSchool;
  }
   @Override//#2-2
  public int sleepHours(){
    return 5;
  }
   @Override//#2-2
  public String eat(){
    return "yum yum";
  }
  // #2-3
  public String study(){
    return "I have a test next week";
  }
  // #2-3
  public String socialMedia(){
    return "Instagram"; 
  }
  @Override//#2-2
  public String toString() {
    String temp ="";
    if(atSchool)
    // TODO Auto-generated method stub
      return super.toString()+"\nHaving class.";
    else{
      return super.toString()+"\nSkipping school.";
    }
  }

}