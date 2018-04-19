
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

object tv extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*8.100*/("""">
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
		
		
	</head>

	<body>

			<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
    <div class="carousel-inner">
    <div class="item active">
      <img src="/assets/images/sale.jpg" alt="Sale">
    </div>
	

    <div class="item">
      <img src="/assets/images/tv.jpg" alt="TV">
    </div>

    <div class="item">
      <img src="/assets/images/iphone.png" alt="iPhone">
    </div>
	
	<div class="item">
      <img src="/assets/images/laptop.jpg" alt="Macbook">
    </div>
	
	
  </div>

<!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="/"><span class="glyphicon glyphicon-home"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
					<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
          <li class="dropdown"><a href="/about">About Us</a></li>
          <li class="dropdown"><a href="/FAQ">FAQ</a></li>
          <li class="dropdown"><a href="/login">Login</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
			
			<main>
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Samsung 24 inch HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img1.jpg" alt="24' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*104.10*/for(p <-products) yield /*104.27*/ {_display_(Seq[Any](format.raw/*104.29*/("""
          """),_display_(/*105.12*/if(p.getId == 9)/*105.28*/ {_display_(Seq[Any](format.raw/*105.30*/("""
        """),format.raw/*106.9*/("""<h4>"""),_display_(/*106.14*/p/*106.15*/.getName),format.raw/*106.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*108.16*/p/*108.17*/.getDescription),format.raw/*108.32*/("""</li><br>
          <li>"""),_display_(/*109.16*/p/*109.17*/.getStock),format.raw/*109.26*/("""</li><br>
          <li>"""),_display_(/*110.16*/p/*110.17*/.getPrice),format.raw/*110.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*112.23*/routes/*112.29*/.HomeController.deleteProduct(p.getId)),format.raw/*112.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*117.14*/("""
        """),format.raw/*118.9*/("""</ul>
          """)))}),format.raw/*119.12*/("""
      """),format.raw/*120.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung 40 Inch Full HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*126.10*/for(p <-products) yield /*126.27*/ {_display_(Seq[Any](format.raw/*126.29*/("""
          """),_display_(/*127.12*/if(p.getId == 10)/*127.29*/ {_display_(Seq[Any](format.raw/*127.31*/("""
        """),format.raw/*128.9*/("""<h4>"""),_display_(/*128.14*/p/*128.15*/.getName),format.raw/*128.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*130.16*/p/*130.17*/.getDescription),format.raw/*130.32*/("""</li><br>
          <li>"""),_display_(/*131.16*/p/*131.17*/.getStock),format.raw/*131.26*/("""</li><br>
          <li>"""),_display_(/*132.16*/p/*132.17*/.getPrice),format.raw/*132.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*134.23*/routes/*134.29*/.HomeController.deleteProduct(p.getId)),format.raw/*134.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*139.14*/("""
        """),format.raw/*140.9*/("""</ul>
          """)))}),format.raw/*141.12*/("""
      """),format.raw/*142.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Samsung 49 Inch Full HD Smart TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung TV" class="productImg" style="height: 13em;"></div>
        """),_display_(/*148.10*/for(p <-products) yield /*148.27*/ {_display_(Seq[Any](format.raw/*148.29*/("""
          """),_display_(/*149.12*/if(p.getId == 6)/*149.28*/ {_display_(Seq[Any](format.raw/*149.30*/("""
        """),format.raw/*150.9*/("""<h4>"""),_display_(/*150.14*/p/*150.15*/.getName),format.raw/*150.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*152.16*/p/*152.17*/.getDescription),format.raw/*152.32*/("""</li><br>
          <li>"""),_display_(/*153.16*/p/*153.17*/.getStock),format.raw/*153.26*/("""</li><br>
          <li>"""),_display_(/*154.16*/p/*154.17*/.getPrice),format.raw/*154.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*156.23*/routes/*156.29*/.HomeController.deleteProduct(p.getId)),format.raw/*156.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*161.14*/("""
        """),format.raw/*162.9*/("""</ul>
          """)))}),format.raw/*163.12*/("""
      """),format.raw/*164.7*/("""</div>
    </div>
  </div>
</div>

			</main>
				
			<footer>
				Copyright &copy; 2018
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(products:List[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,user)

  def f:((List[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,user) => apply(products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 13:28:21 IST 2018
                  SOURCE: /home/wdd/Downloads/Project3-my_new_branch/app/views/tv.scala.html
                  HASH: bd66eae0768d9b43397ffeffc2d8e306e6b88d72
                  MATRIX: 977->1|1129->58|1157->60|1295->172|1309->178|1375->223|5110->3930|5144->3947|5185->3949|5225->3961|5251->3977|5292->3979|5329->3988|5362->3993|5373->3994|5403->4002|5466->4037|5477->4038|5514->4053|5567->4078|5578->4079|5609->4088|5662->4113|5673->4114|5704->4123|5779->4170|5795->4176|5855->4214|6028->4355|6065->4364|6114->4381|6149->4388|6484->4695|6518->4712|6559->4714|6599->4726|6626->4743|6667->4745|6704->4754|6737->4759|6748->4760|6778->4768|6841->4803|6852->4804|6889->4819|6942->4844|6953->4845|6984->4854|7037->4879|7048->4880|7079->4889|7154->4936|7170->4942|7230->4980|7403->5121|7440->5130|7489->5147|7524->5154|7867->5469|7901->5486|7942->5488|7982->5500|8008->5516|8049->5518|8086->5527|8119->5532|8130->5533|8160->5541|8223->5576|8234->5577|8271->5592|8324->5617|8335->5618|8366->5627|8419->5652|8430->5653|8461->5662|8536->5709|8552->5715|8612->5753|8785->5894|8822->5903|8871->5920|8906->5927
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|144->112|144->112|144->112|149->117|150->118|151->119|152->120|158->126|158->126|158->126|159->127|159->127|159->127|160->128|160->128|160->128|160->128|162->130|162->130|162->130|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|171->139|172->140|173->141|174->142|180->148|180->148|180->148|181->149|181->149|181->149|182->150|182->150|182->150|182->150|184->152|184->152|184->152|185->153|185->153|185->153|186->154|186->154|186->154|188->156|188->156|188->156|193->161|194->162|195->163|196->164
                  -- GENERATED --
              */
          