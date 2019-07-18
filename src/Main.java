import com.sheldon.hello.Person;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Sheldon");
        p1.setAge(18);

        System.out.println("姓名：" + p1.getName());
        System.out.println("年龄：" + p1.getAge());
    }
}
