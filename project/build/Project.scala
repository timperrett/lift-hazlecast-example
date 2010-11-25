import sbt._

class LiftHazzleCastSampleProject(info: ProjectInfo) extends DefaultWebProject(info) {
  // deployment
  override def managedStyle = ManagedStyle.Maven
  override def jettyWebappPath = webappPath 
  override def scanDirectories = Nil 
  
  // dependencies
  val webkit = "net.liftweb" %% "lift-webkit" % "2.2-SNAPSHOT" % "compile->default"
  val hazzelcast = "com.hazelcast" % "hazelcast" % "1.9" % "compile->default"
  val hazzelcastweb = "com.hazelcast" % "hazelcast-wm" % "1.9" % "compile->default"
  
  // environment
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.21" % "test"
  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"
  
  val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
  val scalatoolsSnapshot = "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
}
