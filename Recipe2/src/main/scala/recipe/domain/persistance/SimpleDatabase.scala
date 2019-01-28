package recipe.domain.persistance

import recipe.domain.entities._
import recipe.domain.{Food, Recipe}

object SimpleDatabase {

  def allFoods =List(Apple, Orange, Cream, Sugar)

  def foodNamed(name:String): Option[Food] =
    allFoods.find(_.name == name)


  def allRecipes: List[Recipe] = List(FruitSalad)
}
