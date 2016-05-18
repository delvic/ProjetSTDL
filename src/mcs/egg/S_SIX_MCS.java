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
public class S_SIX_MCS {
LEX_MCS scanner;
  S_SIX_MCS() {
    }
  S_SIX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle31() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_4 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_4);
    x_2.analyser(LEX_MCS.token_sinon);
if  (att_eval)      action_tds_31(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_31(x_4);
  }
  private void regle32() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_32();
  }
private void action_auto_inh_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hemp=this.att_hemp;
x_4.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","SIX -> sinon #tds BLOC #gen ;"});
}
  }
private void action_tds_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","SIX -> sinon #tds BLOC #gen ;"});
}
  }
private void action_gen_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+this.att_machine.genFree(x_4.att_emp.getDep()-this.att_hemp.getDep());
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> sinon #tds BLOC #gen ;"});
}
  }
private void action_gen_32() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_sinon : // 4491
        regle31 () ;
      break ;
      case LEX_MCS.token_void : // 4492
        regle32 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle32 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle32 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle32 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle32 () ;
      break ;
      case LEX_MCS.token_entier : // 4515
        regle32 () ;
      break ;
      case LEX_MCS.token_caractere : // 4516
        regle32 () ;
      break ;
      case LEX_MCS.token_plus : // 4507
        regle32 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle32 () ;
      break ;
      case LEX_MCS.token_non : // 4514
        regle32 () ;
      break ;
      case LEX_MCS.token_null : // 4500
        regle32 () ;
      break ;
      case LEX_MCS.token_paro : // 4482
        regle32 () ;
      break ;
      case LEX_MCS.token_mult : // 4510
        regle32 () ;
      break ;
      case LEX_MCS.token_ident : // 4518
        regle32 () ;
      break ;
      case LEX_MCS.token_aco : // 4484
        regle32 () ;
      break ;
      case LEX_MCS.token_si : // 4490
        regle32 () ;
      break ;
      case LEX_MCS.token_retour : // 4498
        regle32 () ;
      break ;
      case LEX_MCS.token_asm : // 4493
        regle32 () ;
      break ;
      case LEX_MCS.token_acf : // 4485
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
