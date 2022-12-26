class StudentTester
{
public static void main(String args[])
{
Student college = new Student("kavya",124,"JCE","BE","EC",'1');
System.out.println(college.name+"  "+college.id+" " +college.collegeName+" " +college.course+" " +college.branch+" " +college.year);

Student college1 = new Student("sindhu",125,"JCE","Btech","CE",'2');
System.out.println(college1.name+"  "+college1.id+" " +college1.collegeName+" " +college1.course+" " +college1.branch+" " +college1.year);

Student college2 = new Student("ranju",126,"JCE","MTech","CS",'3');
System.out.println(college2.name+"  "+college2.id+" " +college2.collegeName+" " +college2.course+" " +college2.branch+" " +college2.year);

Student college3 = new Student("sheela",127,"JCE","ME","Mech",'4');
System.out.println(college3.name+"  "+college3.id+" " +college3.collegeName+" " +college3.course+" " +college3.branch+" " +college3.year);
}
}