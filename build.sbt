import BuildSettings.basicSettings

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

lazy val root = Project("jetprobe-samples", file("."))
  .settings(basicSettings: _*)
  .settings(libraryDependencies ++= Seq(
    "com.jetprobe" %% "jetprobe-core" % "0.2.0-SNAPSHOT",
    "com.jetprobe" %% "jetprobe-rabbitmq" % "0.2.0-SNAPSHOT",
    "com.jetprobe" %% "jetprobe-mongo" % "0.2.0-SNAPSHOT",
    "com.jetprobe" %% "jetprobe-consul" % "0.2.0-SNAPSHOT"
))


scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
