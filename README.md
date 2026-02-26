# 🇹🇷 Öğrenci Yönetim Sistemi (Java)

Java programlama dilinin temel prensiplerini ve Nesne Yönelimli Programlama (OOP) yaklaşımını uygulamak amacıyla geliştirilmiş, konsol tabanlı bir öğrenci yönetim simülasyonudur. Bu proje, nesne modelleme, veri yönetimi ve kullanıcı etkileşimi konularında pratik kazanmak için oluşturulmuştur.


## 🚀 Özellikler

### ➕ Öğrenci Ekleme
Kullanıcıdan alınan ad, soyad, fakülte, bölüm, kimlik numarası ve okul numarası bilgileri ile yeni öğrenci oluşturulur ve sisteme eklenir.

### 🔍 Öğrenci Arama
Okul numarası kullanılarak sistemde kayıtlı öğrenciler hızlı şekilde bulunabilir.

### ❌ Öğrenci Silme
Okul numarası üzerinden seçilen öğrenci sistemden güvenli şekilde kaldırılır.

### 📋 Tüm Öğrencileri Listeleme
Sistemde kayıtlı tüm öğrenciler formatlı şekilde görüntülenebilir.

### 🧠 Dinamik Veri Yönetimi
Öğrenci verileri, Java’nın ArrayList veri yapısı kullanılarak dinamik olarak saklanır ve yönetilir.


## 🛠 Kullanılan Teknolojiler

### Java
### Object-Oriented Programming (OOP)
### ArrayList (Java Collections Framework)
### Console I/O (Scanner)


## 🧩 Uygulanan OOP Prensipleri

### 🔒 Encapsulation (Kapsülleme)
Student sınıfındaki tüm değişkenler private olarak tanımlanmış ve erişim Getter/Setter metodları ile kontrol altına alınmıştır.

### 🔁 Method Overriding
Öğrenci bilgilerini okunabilir şekilde göstermek için toString() metodu override edilmiştir.

### 🧱 Class-Based Structure
Veri modeli (Student) ve iş mantığı (StudentClass) birbirinden ayrılarak daha düzenli ve sürdürülebilir bir yapı oluşturulmuştur.


## 📂 Proje Yapısı

student-management-system
│
├── Student.java
├── StudentClass.java
└── studentManagementSystem.java


## ▶️ Kurulum ve Çalıştırma

Repoyu klonlayın:

git clone https://github.com/korku665/java-student-management-system-oop.git

Proje klasörüne girin:

cd java-student-management-system-oop

Derleyin:

javac *.java

Çalıştırın:

java studentManagementSystem


# 🇺🇸 Student Management System (Java)

A console-based student management simulation developed to practice core Java concepts and Object-Oriented Programming (OOP) principles. This project demonstrates object modeling, dynamic data management, and user interaction.


## 🚀 Features

### ➕ Add Student
Creates and registers new students using name, surname, faculty, department, national ID, and school ID.

### 🔍 Search Student
Quickly finds students using their unique school ID.

### ❌ Delete Student
Safely removes students from the system.

### 📋 List All Students
Displays all registered students in a clean, formatted output.

### 🧠 Dynamic Data Management
Student records are managed dynamically using Java’s ArrayList structure.


## 🛠 Technologies Used

### Java
### Object-Oriented Programming (OOP)
### ArrayList (Java Collections Framework)
### Console Input/Output (Scanner)


## 🧩 OOP Concepts Applied

### 🔒 Encapsulation
All student fields are private and accessed via getters and setters.

### 🔁 Method Overriding
The toString() method is overridden for formatted student display.

### 🧱 Class-Based Architecture
Separation of data model and logic improves maintainability and readability.


## ▶️ Installation and Usage

Clone the repository:

git clone https://github.com/korku665/java-student-management-system-oop.git

Navigate into project folder:

cd java-student-management-system-oop

Compile:

javac *.java

Run:

java studentManagementSystem
