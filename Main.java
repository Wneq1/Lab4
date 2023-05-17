/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scaner = new Scanner(System.in);
      //s.addStudent(new Student("Krzysztof", 20));
      //s.addStudent(new Student("Janusz", 40));

      

      
      System.out.println("Menu");
      System.out.println("1. Wprowadz Studenta");
      System.out.println("2. Wyswietl Studentow");
      System.out.println("3. Modyfikuj studenta");
      
    int stan = scaner.nextInt(); scaner.nextLine();
    switch(stan){
    case 1:
     System.out.println("Podaj imie studenta:");
     String name = scaner.nextLine();
    
     System.out.println("Podaj wiek studenta:");
    int age = scaner.nextInt();

    s.addStudent(new Student(name ,age));
    break;

        
  case 2:
   
    break;
  case 3:

    break;
}
      
    //  var students = s.getStudents();
     // for(Student current : students) {
      //  System.out.println(current.ToString());
      
    } catch (IOException e) {

    }
  }
}