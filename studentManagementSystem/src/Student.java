
public class Student {
    
    private String name;
    private String surname;
    private String faculty;
    private String department;
    private String identityId;
    private String schoolId;
    
    public Student(String name, String surname, String faculty, String department, String identityId, String schoolId){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.department = department;
        this.identityId = identityId;
        this.schoolId = schoolId;
    }

    //Name Getter - Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Surname Getter - Setter
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Faculty Getter - Setter
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    //Department Getter - Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //IdentityId Getter - Setter
    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    //StudentId Getter - Setter
    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
    
    @Override // bir nevi güvenlik kilidi gibi çalışıyor, halihazırdaki toString metodunun üstüne yazarken yazım yanlışı yaparsak da bizi uyarıyor.
    public String toString(){
        return "Öğrenci Bilgileri: \n" + "Ad Soyad: " + this.name + " " + this.surname + 
                "\nFakülte: " +  this.faculty + "\nBölüm: " + this.department + 
                "\nOkul Numarası: " + this.schoolId + "\nKimlik Numarası: " + this.identityId + "\n";
    }
}
