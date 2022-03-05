// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/PQ4sinForLoop.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class PQ4sinForLoop {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,PQ4sinForLoop.createAutomaton()));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,PQ4sinForLoop.class,"main",$line);
    }
  }
  public static IPushdownAutomaton createAutomaton() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=11;
      Object I2=$fix(GCollections.asSet("I","x","\u00F7","2","2=","2.2","2.3","2.4","residuo1","F"));
      $line=12;
      Object I3=$fix(GCollections.asSet("3","3=","3x0","3x1","3x2","3x1d","3x2d","residuo2"));
      $line=13;
      Object I5=$fix(GCollections.asSet("5","5=","5x0","5x1","5x2","5x3","5x4","5x1d","5x2d","5x3d","5x4d","residuo3","residuo4"));
      $line=14;
      Object Q=$fix($opUnionY($opUnionY(I2,I3),I5));
      $line=16;
      Object \u03A3=$fix(GCollections.asSet('2','5','3','\u00D7','x','q','r','=','+','\u00F7'));
      $line=17;
      Object \u0393=$fix(GCollections.asSet('x','$','r'));
      $line=19;
      Object q_0=$fix("I");
      $line=20;
      Object F=$fix(GCollections.asSet("F"));
      $line=22;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=24;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("I","x",$cast(java.lang.String.class,"")),new Object[]{"$"});
      $line=25;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("x","x",$cast(java.lang.String.class,"x")),new Object[]{"x"});
      $line=26;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("x","\u00F7",$cast(java.lang.String.class,'\u00F7')),new Object[]{});
      $line=30;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("\u00F7","2",$cast(java.lang.String.class,'2')),new Object[]{});
      $line=31;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("2","2.1",$cast(java.lang.String.class,'=')),new Object[]{});
      $line=32;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.1","2.1",$cast(java.lang.String.class,'q')),new Object[]{"xx"});
      $line=35;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.1","2.2",$cast(java.lang.String.class,'\u00D7')),new Object[]{"$"});
      $line=36;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.2","F",$cast(java.lang.String.class,'2')),new Object[]{"$"});
      $line=39;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.1","2.3",$cast(java.lang.String.class,'\u00D7')),new Object[]{"x"});
      $line=40;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.3","2.4",$cast(java.lang.String.class,'2')),new Object[]{"$"});
      $line=41;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("2.4","residuo1",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=42;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo1","F",$cast(java.lang.String.class,'r')),new Object[]{"$"});
      $line=47;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("\u00F7","3",$cast(java.lang.String.class,'3')),new Object[]{});
      $line=48;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("3","3=",$cast(java.lang.String.class,'=')),new Object[]{});
      $line=49;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("3=","3=",$cast(java.lang.String.class,'q')),new Object[]{"xxx"});
      $line=52;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("3=","3x0",$cast(java.lang.String.class,'\u00D7')),new Object[]{"$"});
      $line=53;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("3x0","F",$cast(java.lang.String.class,'3')),new Object[]{"$"});
      $line=56;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("3=","3x1",$cast(java.lang.String.class,'\u00D7')),new Object[]{"x"});
      $line=57;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("3x1","3x1d",$cast(java.lang.String.class,'3')),new Object[]{"$"});
      $line=58;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("3x1d","residuo1",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=59;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo1","F",$cast(java.lang.String.class,'r')),new Object[]{"$"});
      $line=62;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("3=","3x2",$cast(java.lang.String.class,'\u00D7')),new Object[]{"xx"});
      $line=63;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("3x2","3x2d",$cast(java.lang.String.class,'3')),new Object[]{"$"});
      $line=64;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("3x2d","residuo2",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=65;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo2","residuo2",$cast(java.lang.String.class,'r')),new Object[]{"r"});
      $line=66;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo2","F",$cast(java.lang.String.class,'r')),new Object[]{"$r"});
      $line=71;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("\u00F7","5",$cast(java.lang.String.class,'5')),new Object[]{});
      $line=72;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("5","5=",$cast(java.lang.String.class,'=')),new Object[]{});
      $line=73;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5=",$cast(java.lang.String.class,'q')),new Object[]{"xxxxx"});
      $line=76;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5x0",$cast(java.lang.String.class,'\u00D7')),new Object[]{"$"});
      $line=77;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x0","F",$cast(java.lang.String.class,'5')),new Object[]{"$"});
      $line=80;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5x1",$cast(java.lang.String.class,'\u00D7')),new Object[]{"x"});
      $line=81;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x1","5x1d",$cast(java.lang.String.class,'5')),new Object[]{"$"});
      $line=82;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x1d","residuo1",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=83;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo1","F",$cast(java.lang.String.class,'r')),new Object[]{"$"});
      $line=86;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5x2",$cast(java.lang.String.class,'\u00D7')),new Object[]{"xx"});
      $line=87;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x2","5x2d",$cast(java.lang.String.class,'5')),new Object[]{"$"});
      $line=88;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x2d","residuo2",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=89;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo2","residuo2",$cast(java.lang.String.class,'r')),new Object[]{"r"});
      $line=90;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo2","F",$cast(java.lang.String.class,'r')),new Object[]{"$r"});
      $line=93;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5x3",$cast(java.lang.String.class,'\u00D7')),new Object[]{"xxx"});
      $line=94;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x3","5x3d",$cast(java.lang.String.class,'5')),new Object[]{"$"});
      $line=95;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x3d","residuo3",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=96;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo3","residuo3",$cast(java.lang.String.class,'r')),new Object[]{"r"});
      $line=97;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo3","F",$cast(java.lang.String.class,'r')),new Object[]{"$rr"});
      $line=100;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("5=","5x4",$cast(java.lang.String.class,'\u00D7')),new Object[]{"xxxx"});
      $line=101;
      $invokeMethod("skip",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x4","5x4d",$cast(java.lang.String.class,'5')),new Object[]{"$"});
      $line=102;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta("5x4d","residuo4",$cast(java.lang.String.class,'+')),new Object[]{});
      $line=103;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo4","residuo4",$cast(java.lang.String.class,'r')),new Object[]{"r"});
      $line=104;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta("residuo4","F",$cast(java.lang.String.class,'r')),new Object[]{"$rrr"});
      $line=108;
      $result=M;
      if (true) break $try;
      $line=109;
      $rethrow(new RuntimeException("The function \"createAutomaton()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,PQ4sinForLoop.class,"createAutomaton",$line);
    }
    return $cast(IPushdownAutomaton.class,$result);
  }
}
