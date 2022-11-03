import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter 3 sides of triangle: ");
        triangle.a = scanner.nextInt();
        triangle.b= scanner.nextInt();
        triangle.c = scanner.nextInt();
        System.out.println("Area of a triangle: " + triangle.area());



//        Student student = new Student();
//
//        Student student1 = new Student();
//        student1.id = 111;
//        student1.name = "Mirbek Atabekov";
//        student1.age = 30;
//        student1.group = 1;
//
//        Student student2 = new Student();
//        student2.id = 222;
//        student2.name = "Sultan Sadyraliev";
//        student2.age = 34;
//        student2.group = 2;
//
//        Student student3 = new Student();
//        student3.id = 333;
//        student3.name = "Ulukmanapo";
//        student3.age = 25;
//        student3.group = 3;
//
//        while (true){
//            System.out.print("Enter student id: ");
//            int id = scanner.nextInt();
//            if (id == student1.id) {
//                student1.studentInfo();
//            } else if (id == student2.id) {
//                student2.studentInfo();
//            } else if (id == student3.id) {
//                student3.studentInfo();
//            } else {
//                System.out.println("Invalid id!");
//                System.out.println();
//            }
//        }

    }
}