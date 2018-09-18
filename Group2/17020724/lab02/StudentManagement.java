class Student{
private
	String name;
	String ID;
	String group;
	String email;
public Student(){
	name = "student";
	ID = "000";
	group = "INT22041";
	email = "uet@vnu.edu.vn";
}
public Student(String n, String sid, String em){
	name = n;
	ID = sid;
	group = "INT22042";
	email = em;
}
public Student(Student s){
	name = s.name;
	ID = s.ID;
	group = s.group;
	email = s.email;
}
public String getName(){
	return name;
}
public void setName(String n){
	name = n;
}
public String getID(){
	return ID;
}
public void setID(String n){
	ID = n;
}
public String getGroup(){
	return group;
}
public void setGroup(String n){
	group = n;
}
public String getEmail(){
	return email;
}
public void setEmail(String n){
	email = n;
}
String getInfor(){
	return ("Name: " + name + "\nID: " + ID + "\nGroup: " + group + "\nEmail: " + email + "\n");
}
};
public class StudentManagement{
	static Student []students = new Student[100];
	static int count = 0;
	static String gr = "INT22042";
	public static void main (String[] args){
	Student s1	= new Student("Nguyen Thu Hang","17020724","17020724@vnu.edu.vn");
	Student s2 = new Student ("NTH","9909","nth@vnu.edu.vn");
	Student s3 = new Student ("xyz","909","xyz@vnu.edu.vn");
	Student s4 = new Student();
	students[count++] = s1;
	students[count++] = s2;
	students[count++] = s3;
	students[count++] = s4;
   	removeStudent("909");
      	studentsByGroup();
	}
	public static boolean sameGroup(Student s1, Student s2){
		return s1.getGroup().equalsIgnoreCase(s2.getGroup());
	}
	public static void studentsByGroup(){
		System.out.printf("\n********* GROUP %s *********\n",gr);
		for(int i=0; i<count; i++){
			if (students[i].getGroup().equals(gr)){
               			System.out.println(students[i].getInfor());
			}
		}
		for(int i=0; i<count; i++){
			if (!students[i].getGroup().equals(gr)){
			System.out.printf("\n********* GROUP %s *********\n",students[i].getGroup());
               			System.out.println(students[i].getInfor());
			}
		}
	}
	public static void removeStudent(String id){
      		int dem=count;
		for(int i=0,k=0; i<count; i++){
        			if(!students[i].getID().equals(id)) {
				students[k]=students[i];	
				k++; dem--;
			}
		}
      		count = count - dem;
	}
  }                             
                             
