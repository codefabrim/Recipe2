package recipe.app.view

import org.scalatest.{FlatSpec, Matchers}
import recipe.domain.Recipe
import recipe.domain.persistence.SimpleDatabase

class SimpleBrowserTest extends FlatSpec with Matchers {

  "A  SimpleBrowser " should "display recipe with ingredient Food asked" in {

    val apple = SimpleDatabase.foodNamed("Apple").get
    val resultRecipes: List[Recipe] = SimpleBrowser.recipesUsing(apple)

    assert(resultRecipes.length > 0)


  }


  "A recipe with Orange  " should "be display recipe with ingredient Orange asked" in {

    val apple = SimpleDatabase.foodNamed("Orange").get
    val resultRecipes: List[Recipe] = SimpleBrowser.recipesUsing(apple)

    assert(resultRecipes.length > 3)


  }





}


/**

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}


class SimpleBrowserTest extends FunSuite {

  test("testRecipesUsing") {


  }

}
  **/