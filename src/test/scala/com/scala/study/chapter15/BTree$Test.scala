package com.scala.study.chapter15

import com.scala.study.chapter15.BTree.{Branch, Empty}
import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/02/24.
 */
class BTree$Test extends FunSuite {
  test("testMax") {
    val a = Branch(1, Empty, Empty)
    assert(BTree.max(a) === 1)

    val b = Branch(1, Branch(2, Empty, Empty), Empty)
    val c = Branch(2, Branch(1, Empty, Empty), Empty)
    assert(BTree.max(b) === 2)
    assert(BTree.max(c) === 2)

    val d = Branch(1, Empty, Branch(2, Empty, Empty))
    val e = Branch(2, Empty, Branch(1, Empty, Empty))
    assert(BTree.max(d) === 2)
    assert(BTree.max(e) === 2)

    val f = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    assert(BTree.max(f) === 3)

    val g = Branch(6, Branch(5, Empty, Empty), Branch(4, Empty, Empty))
    assert(BTree.max(g) === 6)

    val h = Branch(7, Branch(9, Empty, Empty), Branch(8, Empty, Empty))
    assert(BTree.max(h) === 9)

    val i = Empty
    assert(BTree.max(i) === 0)
  }

  test("testMin") {

  }
}
