package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int middle = cathetusLength/2;
        for (int i=1; i<cathetusLength; i++){
            for (int j=1; j<cathetusLength; j++){
                if ((j==middle && i==1)|| j+i-1==middle || j==middle+i-1 || i==middle)
                    System.out.print("8 ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(8);
    }
}
