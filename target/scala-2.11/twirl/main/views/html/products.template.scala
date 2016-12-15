
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">
          """),_display_(/*13.12*/if(flash.containsKey("success"))/*13.44*/ {_display_(Seq[Any](format.raw/*13.46*/("""
              """),format.raw/*14.15*/("""<div class="alert alert-success">
                  """),_display_(/*15.20*/flash/*15.25*/.get("Success")),format.raw/*15.40*/("""
              """),format.raw/*16.15*/("""</div>
          """)))}),format.raw/*17.12*/("""
        """),format.raw/*18.9*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
              <th>Category</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
					"""),_display_(/*33.7*/for(p <- products) yield /*33.25*/ {_display_(Seq[Any](format.raw/*33.27*/("""
					"""),format.raw/*34.6*/("""<tr>
              <td>"""),_display_(/*35.20*/p/*35.21*/.getId),format.raw/*35.27*/("""</td>
              <td>"""),_display_(/*36.20*/p/*36.21*/.getName),format.raw/*36.29*/("""</td>
              <td>"""),_display_(/*37.20*/p/*37.21*/.getDescription),format.raw/*37.36*/("""</td>
              <td>"""),_display_(/*38.20*/p/*38.21*/.getCategory),format.raw/*38.33*/("""</td>
              <td>"""),_display_(/*39.20*/p/*39.21*/.getStock),format.raw/*39.30*/("""</td>
              <td>&euro; """),_display_(/*40.27*/("%.2f".format(p.getPrice))),format.raw/*40.54*/("""</td>
               <td>
                    <a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.deleteProduct(p.getId)),format.raw/*42.75*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
               </td>
                    </tr>
					""")))}),format.raw/*48.7*/(""" """),format.raw/*48.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
            <a href=""""),_display_(/*52.23*/routes/*52.29*/.HomeController.addProduct()),format.raw/*52.57*/("""">
                <button class="btn btn-primary">Add a Product</button>
            </a>
        </p>
      </div>
  </div>
  <script>
      function confirmDel()"""),format.raw/*59.28*/("""{"""),format.raw/*59.29*/("""
          """),format.raw/*60.11*/("""return confirm('Are you sure?');
      """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/("""
  """),format.raw/*62.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:33:49 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab-9/app/views/products.scala.html
                  HASH: 2ab45897ed829c966b64f592450519b5f0bb3ce8
                  MATRIX: 765->1|892->33|920->35|980->68|1008->69|1054->88|1082->89|1110->90|1157->112|1181->128|1220->130|1249->133|1492->349|1533->381|1573->383|1616->398|1696->451|1710->456|1746->471|1789->486|1838->504|1874->513|2362->975|2396->993|2436->995|2469->1001|2520->1025|2530->1026|2557->1032|2609->1057|2619->1058|2648->1066|2700->1091|2710->1092|2746->1107|2798->1132|2808->1133|2841->1145|2893->1170|2903->1171|2933->1180|2992->1212|3040->1239|3123->1295|3138->1301|3197->1339|3461->1573|3489->1574|3611->1669|3626->1675|3675->1703|3867->1867|3896->1868|3935->1879|4001->1918|4029->1919|4059->1922
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|73->42|73->42|73->42|79->48|79->48|83->52|83->52|83->52|90->59|90->59|91->60|92->61|92->61|93->62
                  -- GENERATED --
              */
          