// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Funcs0.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Funcs0 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=18;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,Funcs0.create()));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Funcs0.class,"main",$line);
    }
  }
  public static IAutomaton create() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=26;
      Object Q=$fix(GCollections.asSet(0,1));
      $line=27;
      Object \u03A3=$fix(GCollections.asSet('n','f',',','(',')'));
      $line=28;
      Object \u0393=$fix(GCollections.asSet('1'));
      $line=29;
      Object q_0=$fix(0);
      $line=30;
      Object F=$fix(GCollections.asSet(1));
      $line=33;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=35;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,0,$cast(java.lang.String.class,"f(")),new Object[]{"1"});
      $line=36;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,1,$cast(java.lang.String.class,"n")),new Object[]{});
      $line=37;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,1,$cast(java.lang.String.class,"f()")),new Object[]{"1"});
      $line=38;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,0,$cast(java.lang.String.class,",")),new Object[]{"1"});
      $line=39;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,1,$cast(java.lang.String.class,")")),new Object[]{"1"});
      $line=42;
      $result=M;
      if (true) break $try;
      $line=43;
      $rethrow(new RuntimeException("The function \"create()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Funcs0.class,"create",$line);
    }
    return $cast(IAutomaton.class,$result);
  }
  public static Object testAutomaton(IAutomaton C) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=49;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=50;
      String string=null;
      string=$defaultValue(String.class);
      $line=53;
      System.out.println($message(new Object[]{"Testing"}));
      $line=55;
      while (true) {
        if (!($bool(true))) break;
        $line=56;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=57;
        System.out.println($message(new Object[]{"Enter a string:"}));
        $line=58;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
        $line=59;
        if ($opEqualY(string,"STOP")) {
          $line=59;
          break;
        }
        $line=60;
        Object result=$fix(((gold.structures.automaton.IAutomaton)C).acceptsString($cast(java.lang.String.class,string)));
        $line=61;
        System.out.println($message(new Object[]{$opAdditY("The string was ",(($bool(result))?("accepted"):("REJECTED")))}));
      }
      $line=63;
      System.out.println($message(new Object[]{"End test"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Funcs0.class,"testAutomaton",$line);
    }
    return $result;
  }
}
