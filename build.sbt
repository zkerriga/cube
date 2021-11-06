val scala3Version = "3.1.0"

lazy val commonsSettings: Seq[Def.Setting[_]] = Seq(
  scalaVersion := scala3Version,
  organization := "ru.zkerriga",
)

lazy val `cube` = (project in file("cube"))
  .settings(
    name := "cube",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Dependencies.libraryDependencies,
    commonsSettings
  )

lazy val `cube-core` = (project in file("cube-core"))
  .settings(
    name := "cube-core",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Dependencies.libraryDependencies,
    commonsSettings
  )

lazy val `cube-root` = (project in file("."))
  .settings(commonsSettings)
  .aggregate(`cube`, `cube-core`)
