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
public class S_PARFS_MCS {
LEX_MCS scanner;
  S_PARFS_MCS() {
    }
  S_PARFS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  LCHAMPS att_lchamps;
  private void regle8() throws Exception {

    //declaration
    //appel
  }
  private void regle9() throws Exception {

    //declaration
    S_PARF_MCS x_2 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_5 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_dep_9(x_2, x_5);
if  (att_eval)      action_lchamps_9(x_2, x_5);
    x_5.analyser() ;
  }
private void action_auto_inh_9(S_PARF_MCS x_2, S_PARFSX_MCS x_5) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_lchamps=this.att_lchamps;
x_2.att_hdep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFS -> PARF #dep #lchamps PARFSX ;"});
}
  }
private void action_dep_9(S_PARF_MCS x_2, S_PARFSX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_hdep=x_2.att_type.getTaille();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","PARFS -> PARF #dep #lchamps PARFSX ;"});
}
  }
private void action_lchamps_9(S_PARF_MCS x_2, S_PARFSX_MCS x_5) throws Exception {
try {
// instructions
this.att_lchamps.inserer(x_2.att_champ);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#lchamps","PARFS -> PARF #dep #lchamps PARFSX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 4483
        regle8 () ;
      break ;
      case LEX_MCS.token_void : // 4492
        regle9 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle9 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle9 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle9 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
