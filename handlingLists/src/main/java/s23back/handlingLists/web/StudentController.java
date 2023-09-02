package s23back.handlingLists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s23back.handlingLists.domain.Student;


@Controller
public class StudentController {
	
	@GetMapping("/hello")
	public String studentList(Model model) {
		Student student1 = new Student("Mikko", "Mallikas");
		Student student2 = new Student("Matti", "Meikalainen");
		Student student3 = new Student("John", "Doe");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
//		Student[] students = {student1, student1, student3};
		model.addAttribute("students", students);
		return "studentlist";
	}

}
