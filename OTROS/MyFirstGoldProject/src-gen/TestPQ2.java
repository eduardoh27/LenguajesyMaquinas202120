// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/TestPQ2.gold"
import gold.structures.automaton.*;
import gold.structures.set.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class TestPQ2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=7;
      Object A=$fix($opIntvlY('1','7'));
      $line=8;
      Object B=$fix($opUnionY(A,GCollections.asSet('+','-')));
      $line=11;
      Object D=$fix($opCartsY(new Object[]{$opPwsetY(GCollections.emptySet()),A}));
      $line=14;
      Object Q=$fix($opUnionY($opUnionY($opCartsY(new Object[]{$opPwsetY(A),B}),GCollections.asSet("err")),GCollections.asSet(GCollections.asList(GCollections.emptySet(),"INIT"))));
      $line=15;
      Object \u03A3=$fix($opUnionY(A,GCollections.asSet('+','-')));
      $line=17;
      Object q_0=$fix(GCollections.asList(GCollections.emptySet(),"INIT"));
      $line=18;
      Object F=$fix($opUnionY(D,GCollections.asSet(q_0)));
      $line=19;
      Object M=$fix($invokeConstructor(GDeterministicAutomaton.class,new Object[]{Q,\u03A3,q_0,F,new GMethod(TestPQ2.class,"d")}));
      $line=22;
      System.out.println($message(new Object[]{$opAdditY("The  empty string is ",(($bool(((gold.structures.automaton.GDeterministicAutomaton)M).acceptsString($cast(java.lang.String.class,""))))?("accepted!"):("rejected.")))}));
      $line=24;
      if ($bool((!$opEqualY($invokeField("length",args),0)&&$opEqualY(((java.lang.String[])args)[$int(0)],"GUI")))) {
        $line=25;
        GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,M));
      }
      else {
        $line=27;
        Utilities.test($cast(gold.structures.automaton.IAutomaton.class,M));
      }
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TestPQ2.class,"main",$line);
    }
  }
  public static Object d(Object q, Object x) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=33;
      $result=q;
      if (true) break $try;
      $line=34;
      $rethrow(new RuntimeException("The function \"d(q:Object,x:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TestPQ2.class,"d",$line);
    }
    return $result;
  }
  public static Object d(java.lang.Iterable $v1, Object x) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object S=$v2.next();
      Object q=$v2.next();
      $line=38;
      Object A=$fix($opIntvlY('1','7'));
      $line=39;
      Object signs=$fix(GCollections.asSet('+','-'));
      $line=41;
      if (($opEqualY(q,"INIT")&&!$opMembrY(x,signs))) {
        $line=41;
        $result=GCollections.asList($opUnionY(S,GCollections.asSet(x)),x);
        if (true) break $try;
      }
      else {
        $line=42;
        if (($opMembrY(q,A)&&$opEqualY(x,'-'))) {
          $line=42;
          $result=GCollections.asList(S,'-');
          if (true) break $try;
        }
        else {
          $line=43;
          if (($opMembrY(q,A)&&$opEqualY(x,'+'))) {
            $line=43;
            $result=GCollections.asList(S,'+');
            if (true) break $try;
          }
          else {
            $line=44;
            if (($opEqualY(q,'-')&&$opMembrY(x,A))) {
              $line=44;
              $result=GCollections.asList($opDiffeY(S,GCollections.asSet(x)),x);
              if (true) break $try;
            }
            else {
              $line=45;
              if (($opEqualY(q,'+')&&$opMembrY(x,A))) {
                $line=45;
                $result=GCollections.asList($opUnionY(S,GCollections.asSet(x)),x);
                if (true) break $try;
              }
              else {
                $line=46;
                $result="err";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=48;
      $rethrow(new RuntimeException("The function \"d(\u27E8S,q\u27E9:java.lang.Iterable,x:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TestPQ2.class,"d",$line);
    }
    return $result;
  }
}
