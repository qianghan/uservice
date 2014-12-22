// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/serviceA/conf/serviceA.routes
// @HASH:9c664f261802bdaa036043342cbdf04a9b5fc355
// @DATE:Fri Dec 19 10:08:01 PST 2014
package serviceA

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("",common.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:2
private[this] lazy val controllers_serviceA_Application_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_serviceA_Application_main1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceA"))))
        

// @LINE:8
private[this] lazy val controllers_serviceA_Application_greet2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceA/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
lazy val common_Routes4 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.serviceA.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceA""","""controllers.serviceA.Application.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceA/$name<[^/]+>""","""controllers.serviceA.Application.greet(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:2
case controllers_serviceA_Application_home0(params) => {
   call { 
        invokeHandler(controllers.serviceA.Application.home(), HandlerDef(this, "controllers.serviceA.Application", "home", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_serviceA_Application_main1(params) => {
   call { 
        invokeHandler(controllers.serviceA.Application.main(), HandlerDef(this, "controllers.serviceA.Application", "main", Nil,"GET", """""", Routes.prefix + """serviceA"""))
   }
}
        

// @LINE:8
case controllers_serviceA_Application_greet2(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.serviceA.Application.greet(name), HandlerDef(this, "controllers.serviceA.Application", "greet", Seq(classOf[String]),"GET", """""", Routes.prefix + """serviceA/$name<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:13
case common_Routes4(handler) => handler
        
}

}
     