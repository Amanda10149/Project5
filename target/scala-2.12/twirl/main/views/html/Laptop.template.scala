
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
				  """),_display_(/*104.8*/for(p <-products) yield /*104.25*/ {_display_(Seq[Any](format.raw/*104.27*/("""
					"""),_display_(/*105.7*/if(p.getId == 1)/*105.23*/ {_display_(Seq[Any](format.raw/*105.25*/("""
				  """),format.raw/*106.7*/("""<h4>"""),_display_(/*106.12*/p/*106.13*/.getName),format.raw/*106.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*108.11*/p/*108.12*/.getDescription),format.raw/*108.27*/("""</li><br>
					<li>"""),_display_(/*109.11*/p/*109.12*/.getStock),format.raw/*109.21*/("""</li><br>
					<li>"""),_display_(/*110.11*/p/*110.12*/.getPrice),format.raw/*110.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*112.17*/routes/*112.23*/.HomeController.deleteProduct(p.getId)),format.raw/*112.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*117.9*/("""
				  """),format.raw/*118.7*/("""</ul>
					""")))}),format.raw/*119.7*/("""
				"""),format.raw/*120.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-danger">
				  <div class="panel-heading">Alienware</div>
				  <div class="panel-body"><img src="/assets/images/Alienware.png" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*126.8*/for(p <-products) yield /*126.25*/ {_display_(Seq[Any](format.raw/*126.27*/("""
					"""),_display_(/*127.7*/if(p.getId == 7)/*127.23*/ {_display_(Seq[Any](format.raw/*127.25*/("""
				  """),format.raw/*128.7*/("""<h4>"""),_display_(/*128.12*/p/*128.13*/.getName),format.raw/*128.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*130.11*/p/*130.12*/.getDescription),format.raw/*130.27*/("""</li><br>
					<li>"""),_display_(/*131.11*/p/*131.12*/.getStock),format.raw/*131.21*/("""</li><br>
					<li>"""),_display_(/*132.11*/p/*132.12*/.getPrice),format.raw/*132.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*134.17*/routes/*134.23*/.HomeController.deleteProduct(p.getId)),format.raw/*134.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*139.9*/("""
				  """),format.raw/*140.7*/("""</ul>
					""")))}),format.raw/*141.7*/("""
				"""),format.raw/*142.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-success">
				  <div class="panel-heading">Inspirion</div>
				  <div class="panel-body"><img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg" style="height: 13em;"></div>
				  """),_display_(/*148.8*/for(p <-products) yield /*148.25*/ {_display_(Seq[Any](format.raw/*148.27*/("""
					"""),_display_(/*149.7*/if(p.getId == 4)/*149.23*/ {_display_(Seq[Any](format.raw/*149.25*/("""
				  """),format.raw/*150.7*/("""<h4>"""),_display_(/*150.12*/p/*150.13*/.getName),format.raw/*150.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*152.11*/p/*152.12*/.getDescription),format.raw/*152.27*/("""</li><br>
					<li>"""),_display_(/*153.11*/p/*153.12*/.getStock),format.raw/*153.21*/("""</li><br>
					<li>"""),_display_(/*154.11*/p/*154.12*/.getPrice),format.raw/*154.21*/("""</li><br>
					<td>
						<a href=""""),_display_(/*156.17*/routes/*156.23*/.HomeController.deleteProduct(p.getId)),format.raw/*156.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*161.9*/("""
				  """),format.raw/*162.7*/("""</ul>
					""")))}),format.raw/*163.7*/("""
				"""),format.raw/*164.5*/("""</div>
			  </div>
			</div>
			</div>
			<p>
				<a href=""""),_display_(/*169.15*/routes/*169.21*/.HomeController.addProduct()),format.raw/*169.49*/("""">
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
                  DATE: Mon Apr 23 12:48:19 IST 2018
                  SOURCE: /home/wdd/webapps/FinishedProject/app/views/Laptop.scala.html
                  HASH: fd62a59f5431b6b3f93414059b031c28cbc632e9
                  MATRIX: 981->1|1133->58|1163->62|1306->178|1321->184|1387->229|4880->3695|4914->3712|4955->3714|4989->3721|5015->3737|5056->3739|5091->3746|5124->3751|5135->3752|5165->3760|5221->3788|5232->3789|5269->3804|5317->3824|5328->3825|5359->3834|5407->3854|5418->3855|5449->3864|5513->3900|5529->3906|5589->3944|5743->4067|5778->4074|5821->4086|5854->4091|6155->4365|6189->4382|6230->4384|6264->4391|6290->4407|6331->4409|6366->4416|6399->4421|6410->4422|6440->4430|6496->4458|6507->4459|6544->4474|6592->4494|6603->4495|6634->4504|6682->4524|6693->4525|6724->4534|6788->4570|6804->4576|6864->4614|7018->4737|7053->4744|7096->4756|7129->4761|7430->5035|7464->5052|7505->5054|7539->5061|7565->5077|7606->5079|7641->5086|7674->5091|7685->5092|7715->5100|7771->5128|7782->5129|7819->5144|7867->5164|7878->5165|7909->5174|7957->5194|7968->5195|7999->5204|8063->5240|8079->5246|8139->5284|8293->5407|8328->5414|8371->5426|8404->5431|8492->5491|8508->5497|8558->5525
                  LINES: 28->1|33->1|37->5|43->11|43->11|43->11|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|144->112|144->112|144->112|149->117|150->118|151->119|152->120|158->126|158->126|158->126|159->127|159->127|159->127|160->128|160->128|160->128|160->128|162->130|162->130|162->130|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|171->139|172->140|173->141|174->142|180->148|180->148|180->148|181->149|181->149|181->149|182->150|182->150|182->150|182->150|184->152|184->152|184->152|185->153|185->153|185->153|186->154|186->154|186->154|188->156|188->156|188->156|193->161|194->162|195->163|196->164|201->169|201->169|201->169
                  -- GENERATED --
              */
          