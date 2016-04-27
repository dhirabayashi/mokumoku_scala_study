package com.scala.study.chapter15

/**
 * Created by Daiki on 2016/02/24.
 */
object BTree {
  sealed abstract class Tree
  case class Branch(value: Int, left: Tree, right: Tree) extends Tree
  case object Empty extends Tree

  def max(tree: Tree): Int = tree match {
    case Branch(v, Empty, Empty) => v
    case Branch(v1, Branch(v2, Empty, Empty), Empty) => if (v1 > v2) v1 else v2
    case Branch(v1, Empty, Branch(v2, Empty, Empty)) => if (v1 > v2) v1 else v2
    case Branch(v, lBranch, rBranch) => {
      val lm = max(lBranch)
      val rm = max(rBranch)
      val lrm = if (lm > rm) lm else rm
      if(v > lrm) v else lrm
    }
    case _ => 0
  }


  def min(tree: Tree): Int = 0
  def depth(tree: Tree): Int = 0
}
