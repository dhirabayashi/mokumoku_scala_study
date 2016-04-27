package com.scala.study.chapter9

import java.io.File

/**
 * Created by Daiki on 2015/11/11.
 */
object FileMatcher {
  private def filesHere = new File("c:\\Users\\Daiki\\Desktop").listFiles()

  def fileEnding(query:String) = {
    //for(file <- filesHere if file.getName.endsWith(query))
    //  yield file

    //filesMatching(query, (fileName:String, query:String) => fileName.endsWith(query))
    //filesMatching(_.endsWith(query))
    filesMatching(filename => filename.endsWith(query))
  }

  def filesContains(query:String) = {
    //for(file <- filesHere if file.getName.contains(query))
    //  yield file

    filesMatching(_.contains(query))
  }

  def filesRegex(query:String) = {
    //for(file <- filesHere if file.getName.matches(query))
    //  yield file

    filesMatching(_.matches(query))
  }

  def filesMatching(matcher:(String) => Boolean) = {
    for(file <- filesHere if matcher(file.getName))
      yield file
  }
}
