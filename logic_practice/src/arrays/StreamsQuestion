   // select employee order by salary for each dept. We can also find 3rd highest salary of each dept
   
   List<Employee> allEmployees = new ArrayList<>();
        Map<String, Employee> topEmployees =
                allEmployees.stream()
                        .collect(groupingBy(
                                e -> e.department,
                                collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get)
                        ));
