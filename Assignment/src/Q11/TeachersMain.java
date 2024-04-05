package Q11;

import java.util.Scanner;

	class TeacherTeaches extends Teachers {
		 private String name;

		 public TeacherTeaches(String type) {
		     this.type = type;
		 }

		 public void Subjects() {
		     Scanner scan = new Scanner(System.in);
		     System.out.print("Enter the subject: ");
		     name = scan.nextLine();
		     scan.close();
		     System.out.println("The teacher is teaching " + name);
		 }
		}

		public class TeachersMain {
		 public static void main(String[] args) {

		     TeacherTeaches teacher = new TeacherTeaches("Mathematics");

		     teacher.Teaches();

		     teacher.Subjects();
		 }
		}