import java.awt.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.ImageIcon;

// Task 1: Create a Cat cla
public Cat(String name){
    this.name = name;
    this.setDescription();
  }

public String getDescription(){
    return this.description;
}

public void setDescription(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter cat description: ");
    String description = scanner.nextLine();
    System.out.println(description);
    this.description = description;
}
