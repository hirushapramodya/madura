class A{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class test11 {
    public static void main(String[] args) {
        A obj = new A();
        obj.setName("hirusha");
        System.out.println(obj.getName());
        obj.setAge(13);
        System.out.println(obj.getAge());
    }

  
}