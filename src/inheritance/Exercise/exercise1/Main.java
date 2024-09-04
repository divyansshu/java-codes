package inheritance.Exercise.exercise1;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Lawyer lawyer = new Lawyer();
        Secretary secretary = new Secretary();
        LegalSecretary legalSecretary = new LegalSecretary();
        Marketer marketer = new Marketer();

        System.out.println(employee.getVacationDays());
        System.out.println(lawyer.getVacationDays());
        legalSecretary.SayLegalOath();
    }
}
