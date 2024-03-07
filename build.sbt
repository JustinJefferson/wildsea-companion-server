name := """wildsea-companion"""
organization := "org.jjeff"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  jdbc,
  guice,
  "org.postgresql" % "postgresql" % "42.2.12",
  "org.apache.commons" % "commons-lang3" % "3.11",
)