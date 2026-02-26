
import java.util.ArrayList;
import java.util.Scanner;


public class StudentClass {
    ArrayList <Student> StudentList = new ArrayList<>();
    
    void addStudent(Scanner scanner){
        String name_chs, surname_chs, faculty_chs, department_chs, identityId_chs, schoolId_chs;
        int sayac = -1;
        System.out.println("\n*** Öğrenci Ekle ***");
              System.out.println("----------------------------------------------");
              System.out.println("\nEklemek istediğiniz Öğrencinin;");
              
              System.out.print("Adı: ");
              name_chs = scanner.nextLine();
              
              System.out.print("\nSoyadı: ");
              surname_chs = scanner.nextLine();
              
              System.out.print("\nFakültesi: ");
              faculty_chs = scanner.nextLine();
              
              System.out.print("\nBölümü: ");
              department_chs = scanner.nextLine();
              
              System.out.print("\nOkul Numarası: ");
              schoolId_chs = scanner.nextLine();
              
              System.out.print("\nKimlik Numarası: ");
              identityId_chs = scanner.nextLine();
              
              for(int i = 0; i < StudentList.size(); i++){
                  if (StudentList.get(i).getSchoolId().equals(schoolId_chs) || StudentList.get(i).getIdentityId().equals(identityId_chs)){
                      sayac = 0;
                  }
              }
              if (sayac == -1){
                  Student newStudent = new Student(name_chs, surname_chs, faculty_chs, department_chs, identityId_chs, schoolId_chs);
              StudentList.add(newStudent);
              
              System.out.println("Öğrenci başarıyla eklendi!\n");
              }
              
              else{
                  System.out.println("Eklemeye çalıştığınız öğrencinin sistemde kaydı bulunmaktadır.\n");
              }
              sayac = -1;
    }
    
    void deleteStudent(Scanner scanner){
        String schoolId_chs;
        int sayac = -1;
        System.out.println("\n*** Öğrenci Sil ***");
              System.out.println("----------------------------------------------");
              
              System.out.print("Lütfen sistemden silinmesini istediğiniz öğrencinin okul numarasını giriniz: ");
              schoolId_chs = scanner.nextLine();              
              
              for (int i = 0; i < StudentList.size(); i++){
                  if (StudentList.get(i).getSchoolId().equals(schoolId_chs)){
                      sayac = i;
                  }
              }
              if (sayac != -1){
                    System.out.println("\nSistemden silinecek öğrenci;");
                    System.out.println(StudentList.get(sayac));
              
                    StudentList.remove(sayac);
              
                    System.out.println("\nİşlem başarıyla tamamlanmıştır.\n");
              }
              
              else{
                  System.out.println("\nSistemde bu okul numarasına ait öğrenci kaydı bulunamamıştır.");
              }
              
              sayac = -1;   
    }
    
    void findStudent(Scanner scanner){
              String schoolId_chs;
              int sayac = -1;
              System.out.println("\n*** Öğrenci Ara ***");
              System.out.println("----------------------------------------------");
              
              System.out.print("Lütfen sistemde bulmak istediğiniz öğrencinin okul numarasını giriniz: ");
              schoolId_chs = scanner.nextLine();
              
              for (int i = 0; i < StudentList.size(); i++){
                  if (StudentList.get(i).getSchoolId().equals(schoolId_chs)){
                      sayac = i;
                  }
              }
              
              if (sayac != -1){
                    System.out.println("\nÖğrenci bulundu; ");
                    System.out.println(StudentList.get(sayac));
              }
              
              else{
                 System.out.println("\nSistemde bu okul numarasına ait öğrenci kaydı bulunamamıştır."); 
              }
              
              sayac = -1;
    }
    
    void findAllStudents(){
        
        if (StudentList.isEmpty() == true){
            System.out.println("Sistemde kaydı bulunan öğrenci bulunamamıştır.");
        }
        else{
            for(int i = 0; i < StudentList.size(); i++){
                    System.out.print("\n" + (i+1) + "." + StudentList.get(i));
            }
        }
    }
}
