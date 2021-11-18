import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuestionSample {

    public static void main(String[] args) {
        int a[] = {1, 12, 13, 41, 612, 7131, 612, 131, 912, 1131, 142, 1371, 129, 173};
        //  a = IntStream.of(a).sorted().toArray();
        List<Integer> t = Arrays.asList(1, 12, 13, 41, 612, 7131, 612, 131, 912, 1131, 142, 1371, 129, 173);
//     t =   t.stream().sorted().collect(Collectors.toList());
        //   t =   t.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());   // sort in reverse
        //  t =   t.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()); // top 3 elements
       // t = t.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   //     printData(t);

        /******************************************************/

        Employee e1 = new Employee(50, "it", "Aa");
        Employee e2 = new Employee(60, "market", "Ha");
        Employee e3 = new Employee(20, "sales", "Ba");
        Employee e4 = new Employee(67, "market", "Da");
        Employee e5 = new Employee(90, "sales", "Ca");
        Employee e6 = new Employee(120, "it", "Ea");
        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);


      /*employees=  employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());*/
/*
     employees= employees.stream()
              .sorted(Comparator.comparing(Employee::getDept))
              .collect(Collectors.toList());*/

   /* Map<String,List<Employee>> map = employees.stream()           //  gorup by dept
            .collect(Collectors.groupingBy(Employee::getDept));*/

        /*Optional<Employee> x = employees.stream()       // 3rd height age
                 .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(2)
                .findFirst();
        System.out.println(" third height salary" + x.get());*/


        /*Map<String, Employee> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
        printDataMap(collect);*/

       /* employees.stream().sorted(Map.Entry.<String,Employee>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry<String,Employee>::getKey,Map.Entry<String,Employee>::getValue,(e,r)->e, LinkedHashMap::new));

        */
        //printData(employees);



    }

    public static void printData(int a[]) {
        IntStream.of(a).forEach(System.out::println);
    }
    public static void printData(Map<String,List<Employee>> map) {
        map.entrySet().stream().forEach(key-> System.out.println(key.getKey()+"=> "+key.getValue()));
    }
    public static void printDataMap(Map<String,Employee> map) {
        map.entrySet().stream().forEach(key-> System.out.println(key.getKey()+"=> "+key.getValue()));
    }
    public static void printData(List l) {
        l.forEach(System.out::println);
    }

    public static void printData1(List<Employee> e) {
        e.forEach(System.out::println);
    }
}

class Employee implements Comparable<Map.Entry<String,Employee>> {
   public int salary;
  public   String dept;
    public String name;

    Employee(int a, String dept, String name) {
        salary = a;
        this.dept = dept;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Map.Entry<String, Employee> stringEmployeeEntry) {
        return 0;
    }
}
