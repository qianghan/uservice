// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/conf/routes
// @HASH:834998ae6613a96abb91639360c2518f0d6d777e
// @DATE:Fri Dec 19 10:31:29 PST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("",common.Routes),("",serviceA.Routes),("",serviceB.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:4
lazy val common_Routes0 = Include(common.Routes)
        

// @LINE:6
lazy val serviceA_Routes1 = Include(serviceA.Routes)
        

// @LINE:8
lazy val serviceB_Routes2 = Include(serviceB.Routes)
        
def documentation = List(common.Routes.documentation,serviceA.Routes.documentation,serviceB.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:4
case common_Routes0(handler) => handler
        

// @LINE:6
case serviceA_Routes1(handler) => handler
        

// @LINE:8
case serviceB_Routes2(handler) => handler
        
}

}
     