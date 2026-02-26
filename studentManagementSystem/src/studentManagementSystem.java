
import java.util.ArrayList;
import java.util.Scanner;

public class studentManagementSystem {
    
    static void addStudent(Scanner scanner, ArrayList <Student> StudentList){
        String name_chs, surname_chs, faculty_chs, department_chs, identityId_chs, schoolId_chs;
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
              
              Student newStudent = new Student(name_chs, surname_chs, faculty_chs, department_chs, identityId_chs, schoolId_chs);
              StudentList.add(newStudent);
              
              System.out.println("Öğrenci başarıyla eklendi!\n");
    }
    
    static void deleteStudent(Scanner scanner, ArrayList <Student> StudentList){
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
    
    static void findStudent(Scanner scanner, ArrayList <Student> StudentList){
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
    
    public static void main(String[] args) {
      
      int secim;
      
      ArrayList <Student> StudentList = new ArrayList();
      
      Scanner scanner = new Scanner(System.in);
      
      while(true){
          System.out.println("\n*** Öğrenci Yönetim Sistemi ***");
          System.out.println("----------------------------------------------");
          System.out.println("Merhabalar, sisteme hoşgeldiniz. Öncelikle lütfen yapmak istediğiniz işlemi seçiniz.");
          System.out.println("\n1 - Öğrenci Ekle\n2 - Öğrenci Sil\n3 - Öğrenci Ara\n0 - Çıkış");
          System.out.print("\nLütfen işlem numaranızı tuşlayınız: ");
          secim = scanner.nextInt();
          
          scanner.nextLine(); // dummy input
          
          if (secim == 1){
              addStudent(scanner, StudentList);
              
          }
          
          else if (secim == 2){
              deleteStudent(scanner, StudentList);
          }
          
          else if(secim == 3){
              findStudent(scanner, StudentList);
          }
          
          else if(secim == 0){
              System.out.println("\nSistemden çıkış yapılmıştır, iyi günler dileriz.");   
              break;
          }
          
      }
        
    }
}
