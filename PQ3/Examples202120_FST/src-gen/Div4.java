// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Div4.gold"
import gold.structures.automaton.*;
import gold.structures.map.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Div4 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=7;
      Object m=$fix(Div4.createTransducer());
      $line=9;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,m));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Div4.class,"main",$line);
    }
  }
  public static ITransducer createTransducer() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=23;
      Object Q=$fix(GCollections.asSet(0,1,2,3,"f"));
      $line=25;
      Object \u03A3=$fix($opUnionY($opIntvlY('0','9'),GCollections.asSet('$')));
      $line=26;
      Object Out=$fix($opUnionY($opIntvlY('0','9'),GCollections.asSet('R')));
      $line=28;
      Object q_0=$fix(0);
      $line=29;
      Object F=$fix(GCollections.asSet("f"));
      $line=30;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,Out,q_0,F,new GMethod(Div4.class,"\u03B4"),new GMethod(Div4.class,"g"),new GMethod(Div4.class,"h")});
      if (true) break $try;
      $line=31;
      $rethrow(new RuntimeException("The function \"createTransducer()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Div4.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=34;
      Object d=$fix($opSubtrY(s,'0'));
      $line=35;
      if (($opEqualY(q,"f")||$opEqualY(s,'$'))) {
        $line=35;
        $result="f";
        if (true) break $try;
      }
      else {
        $line=36;
        $result=$opModulY($opAdditY($opMultpY(10,q),d),4);
        if (true) break $try;
      }
      $line=38;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Div4.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=42;
      Object d=$fix($opSubtrY(s,'0'));
      $line=43;
      if ($opEqualY(q,"f")) {
        $line=43;
        $result="";
        if (true) break $try;
      }
      else {
        $line=44;
        if ($opEqualY(s,'$')) {
          $line=44;
          $result=$opAdditY("R",q);
          if (true) break $try;
        }
        else {
          $line=45;
          $result=$opQuotnY($opAdditY($opMultpY(10,q),d),4);
          if (true) break $try;
        }
      }
      $line=47;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Div4.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=52;
      $result="";
      if (true) break $try;
      $line=54;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Div4.class,"g",$line);
    }
    return $result;
  }
}
