package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_OPUN_MCS {
LEX_MCS scanner;
  S_OPUN_MCS() {
    }
  S_OPUN_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle64() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_non);
if  (att_eval)      action_type_64();
if  (att_eval)      action_gen_64();
  }
  private void regle62() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_plus);
if  (att_eval)      action_type_62();
if  (att_eval)      action_gen_62();
  }
  private void regle63() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_moins);
if  (att_eval)      action_type_63();
if  (att_eval)      action_gen_63();
  }
private void action_type_63() throws Exception {
try {
// instructions
this.att_type= new OP( new TYPE_BASE(1, "entier"),  new TYPE_BASE(1, "entier"));
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> moins #type #gen ;"});
}
  }
private void action_type_64() throws Exception {
try {
// instructions
this.att_type= new OP( new TYPE_BASE(1, "entier"),  new TYPE_BASE(1, "entier"));
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> non #type #gen ;"});
}
  }
private void action_type_62() throws Exception {
try {
// instructions
this.att_type= new OP( new TYPE_BASE(1, "entier"),  new TYPE_BASE(1, "entier"));
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> plus #type #gen ;"});
}
  }
private void action_gen_64() throws Exception {
try {
// instructions
this.att_code="LOADL 1;\n SUBR ISub;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPUN -> non #type #gen ;"});
}
  }
private void action_gen_63() throws Exception {
try {
// instructions
this.att_code="SUBR INeg;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPUN -> moins #type #gen ;"});
}
  }
private void action_gen_62() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPUN -> plus #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_plus : // 4507
        regle62 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle63 () ;
      break ;
      case LEX_MCS.token_non : // 4514
        regle64 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
