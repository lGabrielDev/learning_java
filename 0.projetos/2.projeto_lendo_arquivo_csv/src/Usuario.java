
public class Usuario {
    //attributes
    String name;
    int age;
    double value;

    //constructor
    public Usuario(String name, int age, double value){
        this.name = name;
        this.age = age;
        this.value = value;
    }

    //getters and setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //method tooString();
    @Override
    public String toString() {
        return "Usuario [age=" + age + ", name=" + name + ", value=" + value + "]";
    }
}
