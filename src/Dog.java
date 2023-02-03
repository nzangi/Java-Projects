public class Dog {

    //instance variable
    String breed ,size;
    int age;
    String color;

    public String getInfo(){
        return ("Breed is : " + breed+ " size is : " + size+ " Age is: "+age+" color is : " +color);
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.breed ="Maltese";
        dog.size ="Small";
        dog.age = 2;
        dog.color = "Black";
        System.out.println(dog.getInfo());

    }
}
