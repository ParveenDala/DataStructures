package hash.hashmap;

import java.util.Objects;

/******
 * Parveen Dala
 * HashMap, Data Structure
 */
public class Client {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.display();
        map.remove(0);
        map.remove("Ok");
        map.display();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 500);
        map.put(15, 1500);
        map.put(25, 2500);
        map.put(30, 3000);
        map.put(35, 3500);
        map.put(45, 4500);
        map.put(55, 5500);
        map.put(65, 6500);
        map.put(15, 7000);
        map.put("Hello", 2312);
        map.put("Hello", 121);
        map.put(new String("Hello"), 111);
        map.put(new String("Hello"), 222);
        map.put("Ok", 542);
        map.put("Ok", "Name");
        //map.put(0, "Name11");
        map.put(null, "Name55");
        map.put(null, "Name65");
        map.put(0, "Name22");
        map.put(0.5, "Name0.5");
        map.put(new Test(1, "Parveen"), "Parveen1");
        map.put(new Test(1, "Parveen"), "Parveen2");

        map.display();

        System.out.println(map.get(new Test(1, "Parveen")));
        System.out.println(map.get(new Test(1, "Parveen2")));
        System.out.println(map.get(null));
        System.out.println(map.get(0));
        System.out.println(map.get(5));
        System.out.println(map.get(45));
        System.out.println(map.get(48));
        map.display();
        map.remove(0);
        map.remove("Ok");
        map.display();

    }
}

class Test {
    private int id;
    private String name;

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id == test.id &&
                Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
