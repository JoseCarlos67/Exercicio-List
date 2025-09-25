package application;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "3\n333\nMaria Brown\n4000.00\n536\nAlex Grey\n3000.00\n772\nBob Green\n5000.00\n536\n10.0";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);


  }
}