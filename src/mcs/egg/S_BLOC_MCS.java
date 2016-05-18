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
public class S_BLOC_MCS {
LEX_MCS scanner;
  S_BLOC_MCS() {
    }
  S_BLOC_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Emplacement att_hemp;
  TDS att_tds;
  DTYPE att_htype;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  Emplacement att_emp;
  private void regle24() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_INSTS_MCS x_3 = new S_INSTS_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_24(x_3);
    x_2.analyser(LEX_MCS.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_emp_24(x_3);
if  (att_eval)      action_gen_24(x_3);
  }
private void action_emp_24(S_INSTS_MCS x_3) throws Exception {
try {
// instructions
this.att_emp=x_3.att_emp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","BLOC -> aco INSTS acf #emp #gen ;"});
}
  }
private void action_gen_24(S_INSTS_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","BLOC -> aco INSTS acf #emp #gen ;"});
}
  }
private void action_auto_inh_24(S_INSTS_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_3.att_hemp=this.att_hemp;
x_3.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","BLOC -> aco INSTS acf #emp #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle24 () ;
  }
  }
