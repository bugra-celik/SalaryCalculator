public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double increaseSalary;


    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0.0;
        this.bonus = 0.0;
        this.increaseSalary = 0.0;

    }
    void tax(){
        if(this.salary < 1000){
            this.tax =0.0;
        }
        if(this.salary > 1000){
            this.tax = this.salary * 0.03;
        }


    }
    void bonus(){
        if(workHours > 40){
            this.bonus = (workHours - 40) * 30 ;

        }

    }
    void raiseSalary(){
        int yearCalc = 2021 - hireYear;
        if(yearCalc < 10){
            this.increaseSalary = this.salary * 0.05;
        }
        if(yearCalc>9 &&yearCalc < 20){
            this.increaseSalary = this.salary * 0.10;
        }
        if(yearCalc > 19){
            this.increaseSalary = this.salary * 0.15;
        }

    }

    void print(){
        System.out.println("Adı :" +this.name);
        System.out.println("Maaşı :" +this.salary);
        System.out.println("Çalışma saati :" +this.workHours);
        System.out.println("Başlangıç yılı :" +this.hireYear);
        System.out.println("Vergi :" +this.tax);
        System.out.println("Bonus :" +this.bonus);
        System.out.println("Maaş artışı :" +this.increaseSalary);
        System.out.println("vergi ve bonuslar ile birlikte maaş :" + (this.salary + (this.increaseSalary- (this.bonus + this.tax))));
        System.out.println("Toplam maaş : " + (this.salary + this.increaseSalary));
    }
}


