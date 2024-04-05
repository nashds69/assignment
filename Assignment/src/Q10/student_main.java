package Q10;

public class student_main {
	    public static void main(String[] args) {
	        
	        student student1 = new student();
	        student student2 = new student();
	        student student3 = new student();
	        student1.setInfo("Deanne", 20);
	        student2.setInfo("Warren", 22, "Majorda");
	        student3.setInfo("Irvin", 19, "Colva");
	        System.out.println("Student 1:");
	        student1.printInfo();
	        System.out.println();

	        System.out.println("Student 2:");
	        student2.printInfo();
	        System.out.println();

	        System.out.println("Student 3:");
	        student3.printInfo();
	    }
}
	