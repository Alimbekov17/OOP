public class Triangle {
    int a, b, c;
    public double area(){
        int s = (a + b + c)/2;
        return Math.sqrt(s * (s - a)*(s - b)*(s - c));
    }
}

