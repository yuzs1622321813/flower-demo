package 设计模式.装饰者模式;

public class Test {
   public static void main(String[] args) {
       Bread v = new Bread(new Vegetable(new Cream(new Food("大葱"))));
       Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
       System.out.println(food.make());
       System.out.println(v.make());
   }
}