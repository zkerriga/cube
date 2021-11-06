import sbt._

object Dependencies {

  import Jars._

  private val coreDependencies: Vector[ModuleID] = Vector(
    tapir.core,
    logback.classic,
    logback.`scala-logging`
  )

  private val testDependencies: Vector[ModuleID] = Vector(
    scalatest.scalatest,
    scalatest.scalactic
  )

  val libraryDependencies: Vector[ModuleID] =
    coreDependencies ++ testDependencies

}
