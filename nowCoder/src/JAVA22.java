import java.util.Scanner;

public class JAVA22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            sub.calculate();
        }
    }

}

class Base {

    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calculate() {
        System.out.println(getX() * getY());
    }

}

class Sub extends Base {
    public Sub(int x, int y){  //父类的构造方法
        super(x, y);
    }
    //write your code here......
    @Override
    public void calculate() {
        if(getY() != 0)
            System.out.println(getX() / getY());
        else
            System.out.println("Error");
    }

}