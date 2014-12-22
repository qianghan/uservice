// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/common/conf/common.routes
// @HASH:230b8572c500b775d1c7f6895b66174173c3e33f
// @DATE:Fri Dec 19 10:08:01 PST 2014
package common

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:3
private[this] lazy val controllers_common_Application_status0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("status"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """status""","""controllers.common.Application.status()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:3
case controllers_common_Application_status0(params) => {
   call { 
        invokeHandler(controllers.common.Application.status(), HandlerDef(this, "controllers.common.Application", "status", Nil,"GET", """ These are common routes that you may want all services to respond to.""", Routes.prefix + """status"""))
   }
}
        
}

}
     