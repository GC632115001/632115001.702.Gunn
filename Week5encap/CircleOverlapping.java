public class CircleOverlapping { 
  //632115001 Gunn Chochuwong
  //i got some help with google and took time understanding it thankyou 
    public static class checking {
        public static double circle(double x1, double y1, double x2, double y2, double r1, double r2) {
            double distance = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            double radiusSum = (r1 + r2) * (r1 + r2);
            if (distance == radiusSum)
                return 1.0;
            else if (distance > radiusSum)
                return -1.0;
            else
                return 0.0;
        }
        public static void interOrNot(double check ){
            if (check == 1.0)
                System.out.println("intersected");
            else if (check < 0.0)
                System.out.println("not intersected");
            else
                System.out.println("intersected");
        }
        public static double getArea(double r){
            if(r<0){
            return 0;
            }else{
            double circleArea = Math.PI * Math.pow(r, 2);
            return circleArea;
            }
        }
        public static double getCircumference(double r){
            if(r<0){
                return 0;
            }else{
            double circleCircumference = 2 * Math.PI * r;
            return circleCircumference;
            }
        }
        public static void main(String[] args) {
            //1
            double x1 = 0.0, y1 = 0.0, r1 = 2.0;
            //2
            double x2 = 1.0, y2 = 2.0, r2 = 3.0;
            //3
            double x3 = 3.0, y3 = 5.0, r3 = 1.0;
            //4
            double x4 = -1.0, y4 = -10.0, r4 = -1;
            
            System.out.println("the circumference of test case 1 is "+ getCircumference(r1));
            System.out.println("the area of test case 1 is "+ getArea(r1));

            System.out.println("the circumference of test case 2 is "+ getCircumference(r2));
            System.out.println("the area of test case 2 is "+ getArea(r2));

            System.out.println("the circumference of test case 3 is "+ getCircumference(r3));
            System.out.println("the area of test case 3 is "+ getArea(r3));

            System.out.println("the circumference of test case 4 is "+ getCircumference(r4));
            System.out.println("the area of test case 4 is "+ getArea(r4));
            
            //cheking 1 and 2
            double check1and2 = circle(x1, y1, x2, y2, r1, r2);
            System.out.print("the circle 1 and circle 2 are ");
            interOrNot(check1and2);
            double check1and3 = circle(x1, y1, x3, y3, r1, r3);
            System.out.print("the circle 1 and circle 3 are ");
            interOrNot(check1and3);

        }
    }
}