public class Student {
    String name;
    String stdNo;
    int classes;
    Course matematik;
    Course turkce;
    Course fizik;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stdNo, Course matematik,Course turkce,Course fizik) {
        this.name = name;
        this.classes = classes;
        this.stdNo = stdNo;
        this.matematik = matematik;
        this.turkce = turkce;
        this.fizik = fizik;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int verbMat, int fizik, int verbFizik, int turkce, int verbTurkce) {

        if (mat >= 0 && mat <= 100 && verbMat >= 0 && verbMat <= 100) {
            this.matematik.note = mat;
            this.matematik.verbNote = verbMat;
        }

        if (fizik >= 0 && fizik <= 100 && verbFizik >= 0 && verbFizik <= 100)  {
            this.fizik.note = fizik;
            this.fizik.verbNote = verbFizik;
        }

        if (turkce >= 0 && turkce <= 100 && verbTurkce >= 0 && verbTurkce <= 100) {
            this.turkce.note = turkce;
            this.turkce.verbNote = verbTurkce;
        }

    }

    public void isPass() {
        if (this.matematik.note == 0 || this.fizik.note == 0 || this.turkce.note == 0
            || this.matematik.verbNote == 0 || this.fizik.verbNote == 0 || this.turkce.verbNote == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8 + this.fizik.verbNote * 0.2) + (this.turkce.note * 0.8 +
            this.turkce.verbNote * 0.2)  + (this.matematik.note * 0.8 + this.matematik.verbNote * 0.2) ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matematik.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Turkce Notu : " + this.turkce.note);
    }

}

