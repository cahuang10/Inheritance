public class Address{
  private String streetNumberAndName;
  private String city;
  private String state;
  private int zipCode;

  public Address(){
    streetNumberAndName="not found";
    city="not found";
    state="not found";
    zipCode=-1;
  }
  public Address(String streetNumberAndName,String city,String state,int zipCode){
    this.streetNumberAndName=streetNumberAndName;
    this.city=city;
    this.state=state;
    this.zipCode=zipCode;
  }
  public String getAddress(){
    return streetNumberAndName+", "+city+", "+state+", "+zipCode+".";
  }

  public String toString(){
    if(streetNumberAndName.equals("not found")){
      return "not found";
    }
    return streetNumberAndName+", "+city+", "+state+", "+zipCode+".";
  }
}