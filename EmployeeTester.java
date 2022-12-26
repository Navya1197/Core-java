class EmployeeTester
{
public static void main(String args[])
{
Employee emply = new Employee("kavya",124,"wipro","software developer",9731714685l,'O',"navya@gmail.com");
System.out.println(emply.name+"  "+emply.id+" " +emply.companyName+" " +emply.designation+" " +emply.number+" " +emply.bloodGroup+" " +emply.email);

Employee member = new Employee("ranju",125,"wipro","software testing",97389769l,'A',"nav@gmail.com");
System.out.println(member.name+"  "+member.id+" " +member.companyName+" " +member.designation+" " +member.number+" " +member.bloodGroup+" " +member.email);

Employee staff = new Employee("sheela",126,"wipro","software engineer",97567889l,'B',"sheela@gmail.com");
System.out.println(staff.name+"  "+staff.id+" " +staff.companyName+" " +staff.designation+" " +staff.number+" " +staff.bloodGroup+" " +staff.email);

Employee agent = new Employee("sindhu",127,"wipro","software developer",9778653l,'O',"sindhu@gmail.com");
System.out.println( agent.name+"  "+ agent.id+" " + agent.companyName+" " + agent.designation+" " + agent.number+" " + agent.bloodGroup+" " + agent.email);


}
}