package recipe.app.view

import recipe.domain.Food
import recipe.domain.persistance.SimpleDatabase

object SimpleBrowser {

  def recipesUsing(food:Food)=
    SimpleDatabase.allRecipes.filter(recipe =>recipe.ingredients.contains(food) )

}
