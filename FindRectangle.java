public class FindRectangle{

        public static void main(String[] args){
        Rectangle rect1 = new Rectangle(10, 2);
        Rectangle rect2 = new Rectangle(7, 4);

        System.out.println("Length:" + rect1.length);
        System.out.println("Breadth:"+ rect1.breadth);
        System.out.println("Area:"+ rect1.getArea());
        System.out.println("Perimeter:"+rect1.getPerimeter());
    
        
        System.out.println("Length:" + rect2.length);
        System.out.println("Breadth:"+ rect2.breadth);
        System.out.println("Area:"+ rect2.getArea());
        System.out.println("Perimeter:"+rect2.getPerimeter());

        if(rect1.getArea() == rect2.getArea()){
                 System.out.println("Area of both rectangles is same");

            }
         else{
                 System.out.println("Area of both rectangles is different");
            }
        

       }

}