public class B1A1 {

    public static double[] outsideTemp = {10, 25, 30};
    public static double tMin = 15, tMax = 20, current = 18;

    public static void cool() {
        current -= 5;
        System.out.print(" -> cooling down");
    }

    public static void heat() {
        current += 5;
        System.out.print(" -> heating up");
    }

    public static void passive() {
        System.out.print(" -> staying passive");
    }

    public static void main(String[] args) {
        for(int i = 0; i < outsideTemp.length; i++) {
            current = (current+outsideTemp[i])/2;
            System.out.print("mixed temperature: "+current);
            if(current > tMax)
                cool();
            else if(current < tMin)
                heat();
            else
                passive();
            System.out.println(" -> current temperature: "+current);
        }
    }
}
