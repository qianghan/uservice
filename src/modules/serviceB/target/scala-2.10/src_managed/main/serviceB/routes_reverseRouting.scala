// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/serviceB/conf/serviceB.routes
// @HASH:2f3ead9b094f91d445ba3bd701b0fcebac442747
// @DATE:Fri Dec 19 10:08:01 PST 2014

import serviceB.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:6
// @LINE:5
package controllers.serviceB {

// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def lottery(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceB/lottery")
}
                                                

// @LINE:5
def main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "serviceB")
}
                                                
    
}
                          
}
                  


// @LINE:6
// @LINE:5
package controllers.serviceB.javascript {

// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def lottery : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.serviceB.Application.lottery",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceB/lottery"})
      }
   """
)
                        

// @LINE:5
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.serviceB.Application.main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceB"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:6
// @LINE:5
package controllers.serviceB.ref {


// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def lottery(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.serviceB.Application.lottery(), HandlerDef(this, "controllers.serviceB.Application", "lottery", Seq(), "GET", """""", _prefix + """serviceB/lottery""")
)
                      

// @LINE:5
def main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.serviceB.Application.main(), HandlerDef(this, "controllers.serviceB.Application", "main", Seq(), "GET", """""", _prefix + """serviceB""")
)
                      
    
}
                          
}
        
    