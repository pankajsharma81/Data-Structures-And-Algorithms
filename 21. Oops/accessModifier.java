public class accessModifier {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount();
    ba.setPassword(123456);
    System.out.println(ba.getPassword());

  }
}

class BankAccount{
  public String name;
  private int password;

  void setPassword(int newPass){
    this.password = newPass;
  }

  int getPassword(){
    return this.password;
  }
}
