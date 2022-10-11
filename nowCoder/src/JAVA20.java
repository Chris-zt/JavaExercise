import java.util.Scanner;

public class JAVA20 {

    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class Person {

    private int age;

    //write your code here......
    public void setAge(int x) {
        age = x;
    }

    public int getAge() {
        if(age < 0)
            return 0;
        else if(age > 200)
            return 200;
        else
            return age;
    }

}