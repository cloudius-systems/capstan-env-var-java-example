package io.osv;

public class Main {
  public static void main(String[] args) {
    final String val1 = System.getenv("my_var");      
    System.out.println("The local value is: " + val1);
    final String val2 = System.getenv("cloud_var"); 
    System.out.println("The remote value is: " + val2);
  }
}
