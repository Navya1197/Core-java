class TheatreTester
{
public static void main(String nav[])
{
System.out.println("main method is started");
Theatre screen = new Theatre();
Screen sn = new Screen("nav","mysore",7654);
screen.fetch(sn);
screen.getDisplay();
System.out.println("main method is ended");



}
}
