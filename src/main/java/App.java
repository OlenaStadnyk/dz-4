public class App {
    public static void main(String[] argv) {
        Person person1 = new Person("Rachel Green", 27, 12345);
        Person person2 = new Person("Monica Geller", 28, 54321);

        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println();

        System.out.println("Person 2 Information:");
        person2.displayInfo();
    }

    static class Person {
        private String name;
        private int age;
        private int id;

        public Person(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getId() {
            return id;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("ID: " + id);
        }
    }
}

