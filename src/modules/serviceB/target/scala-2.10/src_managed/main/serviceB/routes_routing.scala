// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/serviceB/conf/serviceB.routes
// @HASH:2f3ead9b094f91d445ba3bd701b0fcebac442747
// @DATE:Fri Dec 19 10:08:01 PST 2014
package serviceB

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


// @LINE:5
private[this] lazy val controllers_serviceB_Application_main0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceB"))))
        

// @LINE:6
private[this] lazy val controllers_serviceB_Application_lottery1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serviceB/lottery"))))
        

// @LINE:8
lazy val common_Routes2 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceB""","""controllers.serviceB.Application.main()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serviceB/lottery""","""controllers.serviceB.Application.lottery()"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_serviceB_Application_main0(params) => {
   call { 
        invokeHandler(controllers.serviceB.Application.main(), HandlerDef(this, "controllers.serviceB.Application", "main", Nil,"GET", """""", Routes.prefix + """serviceB"""))
   }
}
        

// @LINE:6
case controllers_serviceB_Application_lottery1(params) => {
   call { 
        invokeHandler(controllers.serviceB.Application.lottery(), HandlerDef(this, "controllers.serviceB.Application", "lottery", Nil,"GET", """""", Routes.prefix + """serviceB/lottery"""))
   }
}
        

// @LINE:8
case common_Routes2(handler) => handler
        
}

}
     