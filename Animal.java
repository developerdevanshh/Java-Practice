public class Animal{
    String name;
    int age;

    public void makeSound(){
        System.out.println("Some Sound");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // They are for encapsulation
}