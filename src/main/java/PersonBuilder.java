public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        if (name == null && name.isEmpty()) {
            throw new IllegalArgumentException("Вы не ввели имя");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null && surname.isEmpty()) {
            throw new IllegalArgumentException("Вы не ввели фамилию");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректно введен возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Вы не ввели имя или фамилию");
        }
        if (age < 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age, address);
        }
        return person;
    }
}
