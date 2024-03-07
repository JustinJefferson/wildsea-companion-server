// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.2")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.16.2")

addSbtPlugin("com.typesafe.play" % "sbt-play-ebean" % "7.0.0")
