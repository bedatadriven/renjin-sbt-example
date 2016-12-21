import org.scalatest._

import org.renjin.script.RenjinScriptEngineFactory;
import org.renjin.sexp.DoubleVector;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import collection.mutable.Stack
import org.scalatest._


class SetSuite extends FunSuite with Matchers {


  test("1+1 is still two") {
    val factory = new RenjinScriptEngineFactory
    val engine = factory.getScriptEngine();
    val result = engine.eval("1+1")
    assert(engine.eval("1+1") == DoubleVector.valueOf(2))
  }
 
  test("xz library is loaded") {
    val factory = new RenjinScriptEngineFactory
    val engine = factory.getScriptEngine();
    val result = engine.eval("readRDS('res:xztest.RData')")

    assert(result == DoubleVector.valueOf(42))
  } 

}
