public class Main {
    public static void main(String[] args) {

        Course mat = new Course("matematik", "MAT01", "MAT");
        Course turkce = new Course("turkce", "TR11", "TR");
        Course fizik = new Course("fizik", "FZK10", "FZK");

        Teacher t1 = new Teacher("Kerim Hoca", "54454", "MAT");
        Teacher t2 = new Teacher("Selim Ayşe", "4545", "TR");
        Teacher t3 = new Teacher("Sami Veli", "4554", "FZK");

        mat.addTeacher(t1);
        turkce.addTeacher(t2);
        fizik.addTeacher(t3);

        Student s1 = new Student("Sas Kom", 4, "5454554", mat, turkce, fizik);
        s1.addBulkExamNote(85,85,80,45,56,66);
        s1.isPass();

        Student s2 = new Student("Tayfun Hasan", 4, "24245", mat, turkce, fizik);
        s2.addBulkExamNote(85,50,14,56,25,22);
        s2.isPass();

        Student s3 = new Student("Semih Arda", 4, "256566", mat, turkce, fizik);
        s3.addBulkExamNote(65,45,90,56, 85 ,69);
        s3.isPass();
    }
}
