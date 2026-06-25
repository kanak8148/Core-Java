package nheritancepracticals;

public class TestShape {
	public static void main(String[] args) {
		
	
	
	Circle sc = new Circle();
	
           sc.setRadius(2);
          sc.setColor("red");
          sc.setBorderWidth(3);
          
          System.out.println("test Radius :" + sc.getRadius());
          System.out.println("test colour"+ sc.getColor());
          System.out.println("test borderwidth" + sc.getBorderWidth());
          sc.area();

}
}