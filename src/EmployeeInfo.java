import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {
  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  public EmployeeInfo(){
    in = new Scanner(System.in);
    //p = Pattern.compile("\\b[A-Z][a-z][a-z][a-z][0-9][0-9]\\b");
    setName();
    createEmployeeCode(this.name);
    setDeptId();
    in.close();
  }

  public StringBuilder getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  private void setName(){
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name){
    if(checkName(name)){
      code = name.charAt(0) + name.substring(name.indexOf(" ")+1);
    }else {
      code = "guest";
    }
  }

  private String inputName(){
    System.out.println("Please enter your first and last name: ");
    return in.nextLine();
  }

  private boolean checkName(StringBuilder name){
    return (name.indexOf(" ") > 0);
  }

  public String getDeptId(){
    System.out.println("Please enter the department ID: ");
    return in.nextLine();
  }

  private void setDeptId(){
    String dummyDeptID = getDeptId();
    if(validId(dummyDeptID)){
      String encodedDeptID = reverseString(dummyDeptID);
      this.deptId = encodedDeptID;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId(){
    return deptId;
  }

  private boolean validId(String deptString){
    return deptString.matches("\\b[A-Z][a-z][a-z][a-z][0-9][0-9]\\b");
  }

  public String toString(){
    return "Employee Code : " + getCode() + "\nDepartment Number : " + getId();
  }

  public String reverseString(String id){
    String dmyString = "";
    for (int i = id.length() - 1; i >= 0; i--){
      dmyString = dmyString + id.charAt(i);
    }
    return dmyString;
  }
}