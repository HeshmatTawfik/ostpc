
public class QuadraticEquation {
    public static double CoefficientQuadraticEquation(double x,double y,double z){
        double Discriminant=2*x-4*y*z;


        if(Discriminant > 0) {

            double root1 = (-y + Math.sqrt(Discriminant)) / (2 * x);
            double root2 = (-y - Math.sqrt(Discriminant)) / (2 * x);
       return root1;
        }
        else if(Discriminant == 0) {
            double root3  = -y / (2 * x);
        return root3;
        }
        else {
            double realPart = -y / (2 * x);
            double imaginaryPart = Math.sqrt(-Discriminant) / (2 * x);
            double root4=realPart+imaginaryPart;
        return root4;}
    }
    public static void main(String[]args){
        System.out.println(CoefficientQuadraticEquation(2,3,1));

    }
}