package TestsAndRough.TestingPassByValue;

public class Client {

    public static void main(String[] args) {

        Student rameshStudent = new Student("Ramesh", "N101", "Jr. KG");
        Student sureshStudent = new Student("Suresh", "N102", "Jr. KG");

        Student ayanStudent = new Student("Ayan", "N103", "Sr. KG");
        Student faizStudent = new  Student("Faiz", "N104", "Sr. KG");

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(rameshStudent);
//        studentList.add(sureshStudent);
//        studentList.add(ayanStudent);
//        studentList.add(faizStudent);

        System.out.println("Initial List:");
        System.out.println("Name\tRoll Number\tGrade");
        System.out.println(rameshStudent.getName()+"\t"+rameshStudent.getRollNumber()+"\t\t"+rameshStudent.getGrade());
        System.out.println(sureshStudent.getName()+"\t"+sureshStudent.getRollNumber()+"\t\t"+sureshStudent.getGrade());
        System.out.println(ayanStudent.getName()+"\t"+ayanStudent.getRollNumber()+"\t\t"+ayanStudent.getGrade());
        System.out.println(faizStudent.getName()+"\t"+faizStudent.getRollNumber()+"\t\t"+faizStudent.getGrade());
//        studentList.forEach(student -> System.out.println(student.getName()+"\t"+student.getRollNumber()+"\t\t"+student.getGrade()));

        StudentUtility.updateGrade(sureshStudent, "Grade 1");

        System.out.println("\n*********************************************************\n");
        System.out.println("List after modification:");
        System.out.println("Name\tRoll Number\tGrade");
        System.out.println(rameshStudent.getName()+"\t"+rameshStudent.getRollNumber()+"\t\t"+rameshStudent.getGrade());
        System.out.println(sureshStudent.getName()+"\t"+sureshStudent.getRollNumber()+"\t\t"+sureshStudent.getGrade());
        System.out.println(ayanStudent.getName()+"\t"+ayanStudent.getRollNumber()+"\t\t"+ayanStudent.getGrade());
        System.out.println(faizStudent.getName()+"\t"+faizStudent.getRollNumber()+"\t\t"+faizStudent.getGrade());
//        studentList.forEach(student -> System.out.println(student.getName()+"\t"+student.getRollNumber()+"\t\t"+student.getGrade()));

    }

}
