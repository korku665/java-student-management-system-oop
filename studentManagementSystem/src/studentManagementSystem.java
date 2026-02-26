
import java.util.ArrayList;
import java.util.Scanner;

public class studentManagementSystem {
    
    public static void main(String[] args) {
      
      int secim;
      Scanner scanner = new Scanner(System.in);
      StudentClass SClass = new StudentClass();
      
      while(true){
          System.out.println("\n*** Öğrenci Yönetim Sistemi ***");
          System.out.println("----------------------------------------------");
          System.out.println("Merhabalar, sisteme hoşgeldiniz. Öncelikle lütfen yapmak istediğiniz işlemi seçiniz.");
          System.out.println("\n1 - Öğrenci Ekle\n2 - Öğrenci Sil\n3 - Öğrenci Ara\n4 - Tüm Öğrencileri Listele\n0 - Çıkış");
          System.out.print("\nLütfen işlem numaranızı tuşlayınız: ");
          secim = scanner.nextInt();
          
          scanner.nextLine(); // dummy input
          
          if (secim == 1){
              SClass.addStudent(scanner);
              
          }
          
          else if (secim == 2){
              SClass.deleteStudent(scanner);
          }
          
          else if(secim == 3){
              SClass.findStudent(scanner);
          }
          
          else if (secim == 4){
              SClass.findAllStudents();
          }
          
          else if(secim == 0){
              System.out.println("\nSistemden çıkış yapılmıştır, iyi günler dileriz.");   
              break;
          }
          
      }
        
    }
}
