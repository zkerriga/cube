import sbt._

object Jars {

  object cats {
    val effectVersion = "3.2.8"
    val coreVersion = "2.6.1"

    val effect = "org.typelevel" %% "cats-effect" % effectVersion
    val core = "org.typelevel" %% "cats-core" % coreVersion
  }

  object tapir {
    val version = "0.19.0-M14"

    val core = "com.softwaremill.sttp.tapir" %% "tapir-core" % version
  }

  object scalatest {
    val version = "3.2.10"

    val scalactic = "org.scalactic" %% "scalactic" % version
    val scalatest = "org.scalatest" %% "scalatest" % version % Test
  }

  object logback {
    val version = "3.9.4"

    val classic = "ch.qos.logback" % "logback-classic" % "1.2.6"
    val logging = "com.typesafe.scala-logging" %% "scala-logging" % version
  }

}
