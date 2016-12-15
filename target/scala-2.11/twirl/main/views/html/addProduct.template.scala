
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(addProductForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.40*/("""


"""),_display_(/*6.2*/main("Add Product")/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""

  """),format.raw/*8.3*/("""<h4>Add a new product</h4>
  """),_display_(/*9.4*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.105*/{_display_(Seq[Any](format.raw/*9.106*/("""
    """),_display_(/*10.6*/inputText(addProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.84*/("""
    """),_display_(/*11.6*/inputText(addProductForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*11.98*/("""
    """),_display_(/*12.6*/inputText(addProductForm("category"), '_label -> "Category", 'class -> "form-control")),format.raw/*12.92*/("""
    """),_display_(/*13.6*/inputText(addProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*13.86*/("""
    """),_display_(/*14.6*/inputText(addProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*14.86*/("""

    """),format.raw/*16.5*/("""<div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary" />
      <a href=""""),_display_(/*18.17*/routes/*18.23*/.HomeController.index()),format.raw/*18.46*/(""""
      <button class="btn btn-warning">Cancel</button>
      </a>
    </div>
  """)))}),format.raw/*22.4*/("""


""")))}))
      }
    }
  }

  def render(addProductForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => apply(addProductForm)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:33:49 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab-9/app/views/addProduct.scala.html
                  HASH: ba45517beb7d72d947000cdb5b661fc2d4313890
                  MATRIX: 818->19|951->57|980->61|1007->80|1046->82|1076->86|1131->116|1241->217|1280->218|1312->224|1411->302|1443->308|1556->400|1588->406|1695->492|1727->498|1828->578|1860->584|1961->664|1994->670|2133->782|2148->788|2192->811|2303->892
                  LINES: 30->3|35->3|38->6|38->6|38->6|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|50->18|50->18|50->18|54->22
                  -- GENERATED --
              */
          