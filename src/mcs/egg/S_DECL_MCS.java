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
public class S_DECL_MCS {
LEX_MCS scanner;
  S_DECL_MCS() {
    }
  S_DECL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  DTYPE att_htype;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle6() throws Exception {

    //declaration
    S_FONCTION_MCS x_3 = new S_FONCTION_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_6(x_3);
if  (att_eval)      action_tds_6(x_3);
    x_3.analyser() ;
if  (att_eval)      action_type_6(x_3);
  }
  private void regle5() throws Exception {

    //declaration
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_type_5();
    x_3.analyser(LEX_MCS.token_pv);
  }
private void action_auto_inh_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DECL -> #tds FONCTION #type ;"});
}
  }
private void action_tds_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
x_3.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","DECL -> #tds FONCTION #type ;"});
}
  }
private void action_type_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
this.att_type=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","DECL -> #tds FONCTION #type ;"});
}
  }
private void action_type_5() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","DECL -> #type pv ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_pv : // 446
        regle5 () ;
      break ;
      case LEX_MCS.token_paro : // 440
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
