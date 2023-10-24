class Main {
  public static void main(String[] args) {

    int n = 2903, reversed = 0;
    
    System.out.println("Original Number: " + n);

    while(n != 0) {
    
      int digit = n % 10;
      reversed = reversed * 10 + digit;

      n /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
