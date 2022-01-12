public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbNote;
    Teacher courseteacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbNote = 0;
    }

    public void addTeacher(Teacher tName){
        if(this.prefix.equals(tName.branch)){
            this.courseteacher=tName;
            System.out.println(" Yeni ogretmen eklendi" );
        }
        else{
            System.out.println(tName.branch+" Bu ders verilemez");
        }
    }


    void printTeacher(){
        if(courseteacher!=null){
            System.out.println("Ders: "+this.name+" Ogretmen: "+this.courseteacher.name);
        }
        else{
            System.out.println("Bu derste ogretnmen yok "+ this.name);
        }
    }
}
