// @SOURCE:/Users/i057224/Documents/Codes/multiproject/src/modules/common/conf/common.routes
// @HASH:230b8572c500b775d1c7f6895b66174173c3e33f
// @DATE:Fri Dec 19 10:08:01 PST 2014

import common.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:3
package controllers.common {

// @LINE:3
class ReverseApplication {
    

// @LINE:3
def status(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "status")
}
                                                
    
}
                          
}
                  


// @LINE:3
package controllers.common.javascript {

// @LINE:3
class ReverseApplication {
    

// @LINE:3
def status : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.common.Application.status",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "status"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:3
package controllers.common.ref {


// @LINE:3
class ReverseApplication {
    

// @LINE:3
def status(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.common.Application.status(), HandlerDef(this, "controllers.common.Application", "status", Seq(), "GET", """ These are common routes that you may want all services to respond to.""", _prefix + """status""")
)
                      
    
}
                          
}
        
    