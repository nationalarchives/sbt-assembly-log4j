addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
resolvers += Resolver.jcenterRepo
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.17")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")
libraryDependencies += "org.scala-sbt" % "scripted-plugin_2.12" % sbtVersion.value

