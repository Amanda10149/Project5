
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

object Phones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>Computer Hub</title>
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
        <div class="panel-heading">iPhone X</div>
        <div class="panel-body"><img src="/assets/images/iphoneX.jpg" alt="iPhoneX img" class="iPhoneX" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*104.10*/for(p <-products) yield /*104.27*/ {_display_(Seq[Any](format.raw/*104.29*/("""
          """),_display_(/*105.12*/if(p.getId == 2)/*105.28*/ {_display_(Seq[Any](format.raw/*105.30*/("""
          """),format.raw/*106.11*/("""<h4>"""),_display_(/*106.16*/p/*106.17*/.getName),format.raw/*106.25*/(""" """),format.raw/*106.26*/("""</h4>
          <ul>	
            <li>"""),_display_(/*108.18*/p/*108.19*/.getDescription),format.raw/*108.34*/("""</li><br>
            <li>"""),_display_(/*109.18*/p/*109.19*/.getStock),format.raw/*109.28*/("""</li><br>
            <li>"""),_display_(/*110.18*/p/*110.19*/.getPrice),format.raw/*110.28*/("""</li><br>
            <td>
              <a href=""""),_display_(/*112.25*/routes/*112.31*/.HomeController.deleteProduct(p.getId)),format.raw/*112.69*/("""" class="button-xs btn-danger">
                <span class="glyphicon-trash"></span>
              </a>
            </td>
              """)))}),format.raw/*116.16*/("""   
          """),format.raw/*117.11*/("""</ul>
      """)))}),format.raw/*118.8*/("""   
      """),format.raw/*119.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">iPhone 7</div>
        <div class="panel-body"><img src="/assets/images/iphone7.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*125.10*/for(p <-products) yield /*125.27*/ {_display_(Seq[Any](format.raw/*125.29*/("""
          """),_display_(/*126.12*/if(p.getId == 8)/*126.28*/ {_display_(Seq[Any](format.raw/*126.30*/("""
        """),format.raw/*127.9*/("""<h4>"""),_display_(/*127.14*/p/*127.15*/.getName),format.raw/*127.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*129.16*/p/*129.17*/.getDescription),format.raw/*129.32*/("""  """),format.raw/*129.34*/("""</li><br>
          <li>"""),_display_(/*130.16*/p/*130.17*/.getStock),format.raw/*130.26*/("""</li><br>
          <li>"""),_display_(/*131.16*/p/*131.17*/.getPrice),format.raw/*131.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*133.23*/routes/*133.29*/.HomeController.deleteProduct(p.getId)),format.raw/*133.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*138.14*/("""
        """),format.raw/*139.9*/("""</ul>
      """)))}),format.raw/*140.8*/("""
      """),format.raw/*141.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">iPhone 6</div>
        <div class="panel-body"><img src="/assets/images/iphone6.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*147.10*/for(p <-products) yield /*147.27*/ {_display_(Seq[Any](format.raw/*147.29*/("""
          """),_display_(/*148.12*/if(p.getId == 5)/*148.28*/ {_display_(Seq[Any](format.raw/*148.30*/("""
        """),format.raw/*149.9*/("""<h4>"""),_display_(/*149.14*/p/*149.15*/.getName),format.raw/*149.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*151.16*/p/*151.17*/.getDescription),format.raw/*151.32*/("""</li><br>
        
          <li>"""),_display_(/*153.16*/p/*153.17*/.getStock),format.raw/*153.26*/("""</li><br>
          <li>"""),_display_(/*154.16*/p/*154.17*/.getPrice),format.raw/*154.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*156.23*/routes/*156.29*/.HomeController.deleteProduct(p.getId)),format.raw/*156.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*161.14*/("""
        """),format.raw/*162.9*/("""</ul>
      """)))}),format.raw/*163.8*/("""
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
                  DATE: Mon Apr 23 12:06:08 IST 2018
                  SOURCE: /home/wdd/webapps/FinishedProject/app/views/Phones.scala.html
                  HASH: b8714fbcbe60da3e7fc7da48039263857b06a4d1
                  MATRIX: 981->1|1133->58|1161->60|1308->181|1322->187|1388->232|5131->3947|5165->3964|5206->3966|5246->3978|5272->3994|5313->3996|5353->4007|5386->4012|5397->4013|5427->4021|5457->4022|5524->4061|5535->4062|5572->4077|5627->4104|5638->4105|5669->4114|5724->4141|5735->4142|5766->4151|5845->4202|5861->4208|5921->4246|6091->4384|6134->4398|6178->4411|6216->4421|6555->4732|6589->4749|6630->4751|6670->4763|6696->4779|6737->4781|6774->4790|6807->4795|6818->4796|6848->4804|6911->4839|6922->4840|6959->4855|6990->4857|7043->4882|7054->4883|7085->4892|7138->4917|7149->4918|7180->4927|7255->4974|7271->4980|7331->5018|7504->5159|7541->5168|7585->5181|7620->5188|7960->5500|7994->5517|8035->5519|8075->5531|8101->5547|8142->5549|8179->5558|8212->5563|8223->5564|8253->5572|8316->5607|8327->5608|8364->5623|8426->5657|8437->5658|8468->5667|8521->5692|8532->5693|8563->5702|8638->5749|8654->5755|8714->5793|8887->5934|8924->5943|8968->5956|9003->5963
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|138->106|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|144->112|144->112|144->112|148->116|149->117|150->118|151->119|157->125|157->125|157->125|158->126|158->126|158->126|159->127|159->127|159->127|159->127|161->129|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|165->133|165->133|165->133|170->138|171->139|172->140|173->141|179->147|179->147|179->147|180->148|180->148|180->148|181->149|181->149|181->149|181->149|183->151|183->151|183->151|185->153|185->153|185->153|186->154|186->154|186->154|188->156|188->156|188->156|193->161|194->162|195->163|196->164
                  -- GENERATED --
              */
          