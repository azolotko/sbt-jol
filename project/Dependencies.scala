import sbt._
import Keys._

object Version {
  val jol = "0.17"
  val scriptedPlugin = "1.9.3"
}

object Dependencies {
  val jol            = "org.openjdk.jol" % "jol-core" % Version.jol
  val jolCli         = "org.openjdk.jol" % "jol-cli"  % Version.jol
  val scriptedPlugin = "org.scala-sbt" %% "scripted-plugin" % Version.scriptedPlugin
}

