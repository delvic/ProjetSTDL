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
public class S_T_MCS {
LEX_MCS scanner;
  S_T_MCS() {
    }
  S_T_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle52() throws Exception {

    //declaration
    S_F_MCS x_2 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_4 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_52(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_htype_52(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_52(x_2, x_4);
if  (att_eval)      action_gen_52(x_2, x_4);
  }
private void action_auto_inh_52(S_F_MCS x_2, S_TX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","T -> F #htype TX #type #gen ;"});
}
  }
private void action_type_52(S_F_MCS x_2, S_TX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","T -> F #htype TX #type #gen ;"});
}
  }
private void action_gen_52(S_F_MCS x_2, S_TX_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","T -> F #htype TX #type #gen ;"});
}
  }
private void action_htype_52(S_F_MCS x_2, S_TX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","T -> F #htype TX #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle52 () ;
  }
  }
