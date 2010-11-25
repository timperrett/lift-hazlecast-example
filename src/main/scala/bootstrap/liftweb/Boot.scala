package bootstrap.liftweb

import net.liftweb.http.{LiftRules, NotFoundAsTemplate, ParsePath}
import net.liftweb.sitemap.{SiteMap, Menu, Loc}
import com.hazelcast.core.Hazelcast

class Boot {
  def boot {
    // where to search snippet
    LiftRules.addToPackages("eu.getintheloop")
    
    // initilize hazelcast
    LiftRules.early.append(r => Hazelcast.getCluster)
    
    // build sitemap
    val entries = List(Menu("Home") / "index") ::: Nil
    
    LiftRules.setSiteMap(SiteMap(entries:_*))
  }
}