package Tasks.Nov.ex_05112024;

public class dogInfo {
    public static void main(String[] args) {
        //5 Objects
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Dog d5 = new Dog();

        d1.name = "Leo";
        d1.breed = "Hybrid";
        d1.color = "Black and White";
        d1.age = 2;
        d1.dogInfo();
        System.out.println();

        d2.name = "Shizu";
        d2.breed = "Shih Tzu";
        d2.color = "White";
        d2.age = 3;
        d2.dogInfo();
        System.out.println();

        d3.name = "Koko";
        d3.breed = "Labrador";
        d3.color = "Light Brown";
        d3.age = 3;
        d3.dogInfo();
        System.out.println();

        d4.name = "Tiger";
        d4.breed = "German Shephard";
        d4.color = "Black and Brown";
        d4.age = 4;
        d4.dogInfo();
        System.out.println();

        d5.name = "Smug";
        d5.breed = "Golden Retriever";
        d5.color = "Golden Brown";
        d5.age = 5;
        d5.dogInfo();
        System.out.println();

    }
}
//attribute
class Dog {
     String name;
     String breed;
     String color;
     int age;

     public void dogInfo(){
         System.out.println("Name: " + this.name);
         System.out.println("Breed: " + this.breed);
         System.out.println("Color: " + this.color);
         System.out.println("Age: " + this.age);
     }
 }