package student;

public class StudentManagement {

    Student[] sv = new Student[100];

    public static void main(String[] args) {
     Student s1 = new Student();
     Student s2 = new Student("HoangYen", "17021144", "hy@gmail.com");
     Student s3 = new Student(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getInfo());
    StudentManagement svn = new StudentManagement();
        System.out.println(svn.sameGroup(s1, s2));
     Student s4 = new Student();
     Student s5 = new Student();
     Student s6 = new Student();
        s6.setGroup("INT22042");
        System.out.println(s6.getInfo());
        svn.sv[0] = s1;
        svn.sv[1] = s2;
        svn.sv[2] = s3;
        svn.sv[3] = s4;
        svn.sv[4] = s5;
        svn.sv[5] = s6;
        System.out.println("danh sach moi lọc id");
        svn.removeStudent("17021144");
        
        
    }


    public boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }
    public void StudentByGroup() {
      // System.out.println("\nStudentByGroup: " + getGroup());
      boolean kt[]=new boolean[6];
      for(int i=0;i<6;i++)
      {
          kt[i]=true;
      }
        for (int i = 0; i < 6; i++) {
          if(kt[i]==true)
          {
              System.out.println(sv[i].getInfo());
              kt[i]=false;
              for(int j=i+1;j<6;j++)
              {
                  if(sv[i].getGroup().equals(sv[j].getGroup()))
                  {
                      System.out.println(sv[j].getInfo());
                      kt[j]=false;
                  }
              }
          }
       }
    }

    public void removeStudent(String id){
        int n = 6;
      	for(int i=0;i<6;i++) {
      		if(sv[i].getId().equals(id)) {
      		      for(int j=i;j<5;j++) {
      				sv[j] = sv[j+1];
      			     }
      			n--;
      			break;
      		   }
      	      }
	} 
}
