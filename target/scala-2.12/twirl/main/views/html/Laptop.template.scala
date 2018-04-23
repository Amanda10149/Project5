
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

object Laptop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""



"""),format.raw/*5.1*/("""<html>

<head>

	<meta charset="UTF-8">
	<title>Computer Hub</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*11.48*/routes/*11.54*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*11.99*/("""">
	
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
				  <div class="panel-heading">Dell</div>
				  <div class="panel-body"><img src="/assets/images/dell-xps.jpg" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*105.8*/for(p <-products) yield /*105.25*/ {_display_(Seq[Any](format.raw/*105.27*/("""
					"""),_display_(/*106.7*/if(p.getId == 1)/*106.23*/ {_display_(Seq[Any](format.raw/*106.25*/("""
				  """),format.raw/*107.7*/("""<h4>"""),_display_(/*107.12*/p/*107.13*/.getName),format.raw/*107.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*109.11*/p/*109.12*/.getDescription),format.raw/*109.27*/("""</li><br>
					<li>"""),_display_(/*110.11*/p/*110.12*/.getStock),format.raw/*110.21*/("""</li><br>
					<li>"""),_display_(/*111.11*/p/*111.12*/.getPrice),format.raw/*111.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*113.17*/routes/*113.23*/.HomeController.deleteProduct(p.getId)),format.raw/*113.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*118.9*/("""
				  """),format.raw/*119.7*/("""</ul>
					""")))}),format.raw/*120.7*/("""
				"""),format.raw/*121.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-danger">
				  <div class="panel-heading">Alienware</div>
				  <div class="panel-body"><img src="/assets/images/Alienware.png" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*127.8*/for(p <-products) yield /*127.25*/ {_display_(Seq[Any](format.raw/*127.27*/("""
					"""),_display_(/*128.7*/if(p.getId == 7)/*128.23*/ {_display_(Seq[Any](format.raw/*128.25*/("""
				  """),format.raw/*129.7*/("""<h4>"""),_display_(/*129.12*/p/*129.13*/.getName),format.raw/*129.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*131.11*/p/*131.12*/.getDescription),format.raw/*131.27*/("""</li><br>
					<li>"""),_display_(/*132.11*/p/*132.12*/.getStock),format.raw/*132.21*/("""</li><br>
					<li>"""),_display_(/*133.11*/p/*133.12*/.getPrice),format.raw/*133.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*135.17*/routes/*135.23*/.HomeController.deleteProduct(p.getId)),format.raw/*135.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*140.9*/("""
				  """),format.raw/*141.7*/("""</ul>
					""")))}),format.raw/*142.7*/("""
				"""),format.raw/*143.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-success">
				  <div class="panel-heading">Inspirion</div>
				  <div class="panel-body"><img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg" style="height: 13em;"></div>
				  """),_display_(/*149.8*/for(p <-products) yield /*149.25*/ {_display_(Seq[Any](format.raw/*149.27*/("""
					"""),_display_(/*150.7*/if(p.getId == 4)/*150.23*/ {_display_(Seq[Any](format.raw/*150.25*/("""
				  """),format.raw/*151.7*/("""<h4>"""),_display_(/*151.12*/p/*151.13*/.getName),format.raw/*151.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*153.11*/p/*153.12*/.getDescription),format.raw/*153.27*/("""</li><br>
					<li>"""),_display_(/*154.11*/p/*154.12*/.getStock),format.raw/*154.21*/("""</li><br>
					<li>"""),_display_(/*155.11*/p/*155.12*/.getPrice),format.raw/*155.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*157.17*/routes/*157.23*/.HomeController.deleteProduct(p.getId)),format.raw/*157.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*162.9*/("""
				  """),format.raw/*163.7*/("""</ul>
					""")))}),format.raw/*164.7*/("""
				"""),format.raw/*165.5*/("""</div>
			  </div>
			</div>
			</div>
			<p>
				<a href=""""),_display_(/*170.15*/routes/*170.21*/.HomeController.addProduct()),format.raw/*170.49*/("""">
					<button class="btn btn-primary">Add a product</button>
				</a>
			</p>
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
                  DATE: Mon Apr 23 12:06:08 IST 2018
                  SOURCE: /home/wdd/webapps/FinishedProject/app/views/Laptop.scala.html
                  HASH: 53121eb3c5a1704f142ba0417a7319227a7ae7a1
                  MATRIX: 981->1|1133->58|1163->62|1306->178|1321->184|1387->229|4980->3795|5014->3812|5055->3814|5089->3821|5115->3837|5156->3839|5191->3846|5224->3851|5235->3852|5265->3860|5321->3888|5332->3889|5369->3904|5417->3924|5428->3925|5459->3934|5507->3954|5518->3955|5549->3964|5613->4000|5629->4006|5689->4044|5833->4157|5868->4164|5911->4176|5944->4181|6245->4455|6279->4472|6320->4474|6354->4481|6380->4497|6421->4499|6456->4506|6489->4511|6500->4512|6530->4520|6586->4548|6597->4549|6634->4564|6682->4584|6693->4585|6724->4594|6772->4614|6783->4615|6814->4624|6878->4660|6894->4666|6954->4704|7098->4817|7133->4824|7176->4836|7209->4841|7510->5115|7544->5132|7585->5134|7619->5141|7645->5157|7686->5159|7721->5166|7754->5171|7765->5172|7795->5180|7851->5208|7862->5209|7899->5224|7947->5244|7958->5245|7989->5254|8037->5274|8048->5275|8079->5284|8143->5320|8159->5326|8219->5364|8363->5477|8398->5484|8441->5496|8474->5501|8562->5561|8578->5567|8628->5595
                  LINES: 28->1|33->1|37->5|43->11|43->11|43->11|137->105|137->105|137->105|138->106|138->106|138->106|139->107|139->107|139->107|139->107|141->109|141->109|141->109|142->110|142->110|142->110|143->111|143->111|143->111|145->113|145->113|145->113|150->118|151->119|152->120|153->121|159->127|159->127|159->127|160->128|160->128|160->128|161->129|161->129|161->129|161->129|163->131|163->131|163->131|164->132|164->132|164->132|165->133|165->133|165->133|167->135|167->135|167->135|172->140|173->141|174->142|175->143|181->149|181->149|181->149|182->150|182->150|182->150|183->151|183->151|183->151|183->151|185->153|185->153|185->153|186->154|186->154|186->154|187->155|187->155|187->155|189->157|189->157|189->157|194->162|195->163|196->164|197->165|202->170|202->170|202->170
                  -- GENERATED --
              */
          