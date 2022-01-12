import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000)
            return 0;
        else{
            return this.salary*0.03;
        }
    }

    public double bonus () {
        if (this.workHours >= 40) {
            int hours = this.workHours - 40;
            return this.workHours + (hours * 30);
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        int nowDate = Calendar.getInstance().get(Calendar.YEAR);
        int year = nowDate - this.hireYear;
        if(year<10){
            return this.salary * 0.05;
        }
        else if(year>9 && year<20 ){
            return this.salary * 0.10;
        }
        else{
            return this.salary * 0.15;
        }
    }

    public void printToString(){
        System.out.println("=========================");
        System.out.println("Adı : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maas Artisi : " + this.raiseSalary());
        double net = (this.bonus()-this.tax());
        System.out.println("Vergi ve Bonuslar Toplami : " +net);
        double totalSalary = this.salary+net+this.raiseSalary();
        System.out.println("Toplam Maas : " + totalSalary);
    }
}
