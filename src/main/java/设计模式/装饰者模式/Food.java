package 设计模式.装饰者模式;

public class Food {

   private String food_name;

   public Food() {
   }

   public Food(String food_name) {
       this.food_name = food_name;
   }

   public String make() {
       return food_name;
   };
}