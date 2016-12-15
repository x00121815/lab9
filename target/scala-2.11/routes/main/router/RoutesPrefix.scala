
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab-9/conf/routes
// @DATE:Thu Dec 15 17:33:48 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
