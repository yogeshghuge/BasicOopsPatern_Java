class StudentDemoNew 
{
	String name;
    	int studentId;
    	StudentDemoNew(String name, int studentId)
 	{
        	this.name = name;
        	this.studentId = studentId;
   	 }
	void display()
	 {
        System.out.println("Name: " + name + "\nStudent ID: " + studentId);
    }
}
