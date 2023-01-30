public class Main {
    public static void main(String[] args) {

        int isPresent = 0;
        int isAbsent = 1;
        int dailySalary;
        int workingHours;

        int salaryPerhours=20;


        int checkAttendence =(int)((Math.random()*10)%2);
        if (checkAttendence==isPresent){
            System.out.println("Employee is present");
            workingHours=8;
        }
        else{
            System.out.println("Employee is absent");
            workingHours=0;
        }
        dailySalary=workingHours*salaryPerhours;
        System.out.println("daily salary  is" + dailySalary);

    }
}
