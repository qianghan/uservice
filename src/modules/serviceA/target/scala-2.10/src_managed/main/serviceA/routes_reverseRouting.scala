// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/serviceA/conf/serviceA.routes
// @HASH:9c664f261802bdaa036043342cbdf04a9b5fc355
// @DATE:Fri Dec 19 10:08:01 PST 2014

import serviceA.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:8
// @LINE:7
// @LINE:2
package controllers.serviceA {

// @LINE:8
// @LINE:7
// @LINE:2
class ReverseApplication {
    

// @LINE:8
def greet(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceA/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:2
def home(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceA")
}
                                                
    
}
                          
}
                  

// @LINE:11
package controllers {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:8
// @LINE:7
// @LINE:2
package controllers.serviceA.javascript {

// @LINE:8
// @LINE:7
// @LINE:2
class ReverseApplication {
    

// @LINE:8
def greet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.serviceA.Application.greet",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceA/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:2
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.serviceA.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.serviceA.Application.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceA"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:11
package controllers.javascript {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:8
// @LINE:7
// @LINE:2
package controllers.serviceA.ref {


// @LINE:8
// @LINE:7
// @LINE:2
class ReverseApplication {
    

// @LINE:8
def greet(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.serviceA.Application.greet(name), HandlerDef(this, "controllers.serviceA.Application", "greet", Seq(classOf[String]), "GET", """""", _prefix + """serviceA/$name<[^/]+>""")
)
                      

// @LINE:2
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.serviceA.Application.home(), HandlerDef(this, "controllers.serviceA.Application", "home", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:7
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.serviceA.Application.main(), HandlerDef(this, "controllers.serviceA.Application", "main", Seq(), "GET", """""", _prefix + """serviceA""")
)
                      
    
}
                          
}
        

// @LINE:11
package controllers.ref {


// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
        
    