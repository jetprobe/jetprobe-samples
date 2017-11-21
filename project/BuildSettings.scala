import sbt.Keys.{version, _}
import sbt._

/**
  * @author Shad.
  */
object BuildSettings {

  lazy val basicSettings = Seq(
    organization := "com.jetprobe",
    version := "0.2.0-SNAPSHOT",
    scalaVersion := "2.12.2"
  )

}
