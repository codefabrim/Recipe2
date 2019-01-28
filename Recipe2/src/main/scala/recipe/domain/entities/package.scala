package recipe.domain


package object entities {


  object Apple extends Food("Apple")

  object Orange extends Food("Orange")

  object Cream extends Food("Cream")

  object Sugar extends Food("Sugar")

  object Lemon extends Food("Lemon")


  object FruitSalad extends Recipe("Fruit Salad",
    List(Apple, Orange, Cream, Sugar),
    "Stir it all together")


}
