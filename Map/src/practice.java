import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	String name;
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}
public class practice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Rishabh");
		s2.setName("Swati");
		
		Map<Student,ArrayList<Integer>> hm = new Hashtable<Student, ArrayList<Integer>>();
		ArrayList<Integer> markOfStudent = new ArrayList<Integer>();
		markOfStudent.add(12);
		markOfStudent.add(20);
		hm.put(s1, markOfStudent);
		hm.put(s2, markOfStudent);
		
		for(Map.Entry<Student, ArrayList<Integer>> m : hm.entrySet()) {
			
			System.out.println("Marks of the student S1 is "+m.getKey().name+" "+m.getValue().get(0));
			
		}
		
		//System.out.println("Marks of the student S1 is "+S.);

	}

}
