
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Computer Hub - """),_display_(/*11.24*/title),format.raw/*11.29*/("""</title>

<!-- Bootstrap Core CSS -->

</head>

<body>

    <nav class="navbar navbar-inverse">
	
        <div class="container-fluid">
        
        <div class="navbar-header">
        
        <a class="navbar-brand" href="#">Online Shop</a>
        
        </div>
        
        <ul class="nav navbar-nav">
        <li """),_display_(/*30.14*/if(title=="Products")/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""class="active"""")))}),format.raw/*30.51*/(""">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.HomeController.index()),format.raw/*31.52*/("""">Products</a>
        </li>
        
        <li class="active"><a href="#">About</a></li>
        
        <li><a href="#">Services</a></li>
        
        <li><a href="#">Contact</a></li>
        <li """),_display_(/*39.14*/if(title=="Login")/*39.32*/{_display_(Seq[Any](format.raw/*39.33*/("""class="active"""")))}),format.raw/*39.48*/(""">
            """),_display_(/*40.14*/if(user != null)/*40.30*/ {_display_(Seq[Any](format.raw/*40.32*/("""
                """),format.raw/*41.17*/("""<a href=""""),_display_(/*41.27*/routes/*41.33*/.LoginController.logout()),format.raw/*41.58*/("""">Logout """),_display_(/*41.68*/user/*41.72*/.getName()),format.raw/*41.82*/("""</a>
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
                """),format.raw/*43.17*/("""<a href=""""),_display_(/*43.27*/routes/*43.33*/.LoginController.login()),format.raw/*43.57*/("""">Login</a>
            """)))}),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""</li>
        
        </ul>
        
        </div>
        
        </nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*59.2*/content),format.raw/*59.9*/("""

"""),format.raw/*61.1*/("""</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 13:28:21 IST 2018
                  SOURCE: /home/wdd/Downloads/Project3-my_new_branch/app/views/main.scala.html
                  HASH: 1d8e2372c1011dab46a48a271bb46381bcb651f3
                  MATRIX: 970->1|1120->56|1148->58|1265->148|1291->153|1647->482|1677->503|1716->504|1762->519|1813->543|1828->549|1872->572|2105->778|2132->796|2171->797|2217->812|2259->827|2284->843|2324->845|2369->862|2406->872|2421->878|2467->903|2504->913|2517->917|2548->927|2585->946|2598->951|2637->952|2682->969|2719->979|2734->985|2779->1009|2835->1034|2871->1043|3033->1179|3060->1186|3089->1188
                  LINES: 28->1|33->1|35->3|43->11|43->11|62->30|62->30|62->30|62->30|63->31|63->31|63->31|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|77->45|91->59|91->59|93->61
                  -- GENERATED --
              */
          