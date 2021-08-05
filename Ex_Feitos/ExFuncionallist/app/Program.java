/*package Ex_Feitos.ExFuncionallist.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ex_Feitos.ExFuncionallist.entities.Employee;


public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employee will be registered");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            
            System.out.println();
            System.out.println("Employee #"+ (i+1)+":");
           System.out.print("id: ");
            Integer id =sc.nextInt();
            sc.nextLine();
           System.out.print("name: ");
            String name = sc.nextLine();
           System.out.print("salary: ");
           Double salary = sc.nextDouble();

           Employee emp = new Employee(id, name, salary);
           list.add(emp);
        }
        System.out.println("Enter the employee id that salary will increase: ");
        int idIncrease = sc.nextInt();
        Integer pos = searchId(list, idIncrease);
        if (pos == null){
            System.out.println("This id does not exist");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).IncreaseSalary(percent);
        }
        System.out.println();
        System.out.println("list of employee: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }
        sc.close();
    }


    static Integer searchId(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()==id) {
                return i;
            }
        }
        return null;
    }
}
*/