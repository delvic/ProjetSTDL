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
public class S_FONCTION_MCS {
LEX_MCS scanner;
  S_FONCTION_MCS() {
    }
  S_FONCTION_MCS(LEX_MCS scanner, boolean eval) {
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
  LCHAMPS glob_7_lc;
  private void regle7() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_5 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_9 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_5, x_9);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_dep_7(x_5, x_9);
if  (att_eval)      action_lchamps_7(x_5, x_9);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_type_7(x_5, x_9);
if  (att_eval)      action_hemp_7(x_5, x_9);
    x_9.analyser() ;
  }
private void action_hemp_7(S_PARFS_MCS x_5, S_BLOC_MCS x_9) throws Exception {
try {
// locales
Register loc_reg;
// instructions
loc_reg= new Register("LB", 0);
x_9.att_hemp= new Emplacement(3, loc_reg);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hemp","FONCTION -> paro #dep #lchamps PARFS parf #type #hemp BLOC ;"});
}
  }
private void action_auto_inh_7(S_PARFS_MCS x_5, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_9.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
x_9.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FONCTION -> paro #dep #lchamps PARFS parf #type #hemp BLOC ;"});
}
  }
private void action_dep_7(S_PARFS_MCS x_5, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
x_5.att_hdep=0;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","FONCTION -> paro #dep #lchamps PARFS parf #type #hemp BLOC ;"});
}
  }
private void action_lchamps_7(S_PARFS_MCS x_5, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
glob_7_lc= new LCHAMPS();
x_5.att_lchamps=glob_7_lc;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#lchamps","FONCTION -> paro #dep #lchamps PARFS parf #type #hemp BLOC ;"});
}
  }
private void action_type_7(S_PARFS_MCS x_5, S_BLOC_MCS x_9) throws Exception {
try {
// locales
DTYPE loc_type;
// instructions
loc_type= new FONCTION(this.att_htype, glob_7_lc);
this.att_type=loc_type;
x_9.att_htype=loc_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FONCTION -> paro #dep #lchamps PARFS parf #type #hemp BLOC ;"});
}
  }
  public void analyser () throws Exception {
    regle7 () ;
  }
  }
