
package student;


class Student {
   private String name;
   private String id;
   private String group;
   private String email;  
   public String getName(){
       return name;
   }
   public void setName(String n){
       name = n;
   }
   public String getId(){
       return id;
   }
   public void setId(String sid){
       id = sid;
   }
   public String getEmail(){
       return email;
   }
   public void setEmail(String em){
       email = em;
   }
   public String getGroup(){
       return group;
   }
   public void setGroup(String gr){
       group = gr;
   }
   
    Student(String n, String sid, String em){
       name = n;
       id = sid;
       email = em;
       group = "INT22041";
   }

    Student() {
        name = "student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    Student(Student s){
         name = s.getName();
         id = s.getId();
         email = s.getEmail();
         group = s.getGroup();
     }
   public String getInfo(){
   return  "ho ten: " + getName() + "\nMSSV: "+ getId() + "\nemail: "+ getEmail() + "\ngroup: " + getGroup() +"\n" ;
   
   }
}

