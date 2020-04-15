package 设计模式.装饰者模式;

//蔬菜类
public class Vegetable extends Food {

   private Food basic_food;

   public Vegetable(Food basic_food) {
       this.basic_food = basic_food;
   }

   public String make() {
       return basic_food.make()+"+蔬菜";
   }

}