import java.util.*;

public class Student {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, String> students = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n4. Delete Student\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        students.put(id, name);
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students.");
        } else {
            students.forEach((id, name) -> System.out.println(id + ": " + name));
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (students.containsKey(id)) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            students.put(id, name);
            System.out.println("Updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        if (students.remove(id) != null) {
            System.out.println("Deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
