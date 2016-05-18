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
    S_BLOC_MCS x_5 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_5);
    x_2.analyser(LEX_MCS.token_sinon);
if  (att_eval)      action_hemp_31(x_5);
if  (att_eval)      action_tds_31(x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_31(x_5);
  }
  private void regle32() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_32();
  }
private void action_auto_inh_31(S_BLOC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","SIX -> sinon #hemp #tds BLOC #gen ;"});
}
  }
private void action_tds_31(S_BLOC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","SIX -> sinon #hemp #tds BLOC #gen ;"});
}
  }
private void action_hemp_31(S_BLOC_MCS x_5) throws Exception {
try {
// locales
Register loc_reg;
Register loc_regi;
// instructions
loc_regi=this.att_hemp.getReg();
loc_reg= new Register("LB", loc_regi.getNum()+1);
x_5.att_hemp= new Emplacement(0, loc_reg);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hemp","SIX -> sinon #hemp #tds BLOC #gen ;"});
}
  }
private void action_gen_31(S_BLOC_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> sinon #hemp #tds BLOC #gen ;"});
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
      case LEX_MCS.token_sinon : // 449
        regle31 () ;
      break ;
      case LEX_MCS.token_void : // 450
        regle32 () ;
      break ;
      case LEX_MCS.token_int : // 452
        regle32 () ;
      break ;
      case LEX_MCS.token_char : // 453
        regle32 () ;
      break ;
      case LEX_MCS.token_identc : // 477
        regle32 () ;
      break ;
      case LEX_MCS.token_struct : // 454
        regle32 () ;
      break ;
      case LEX_MCS.token_entier : // 473
        regle32 () ;
      break ;
      case LEX_MCS.token_caractere : // 474
        regle32 () ;
      break ;
      case LEX_MCS.token_plus : // 465
        regle32 () ;
      break ;
      case LEX_MCS.token_moins : // 466
        regle32 () ;
      break ;
      case LEX_MCS.token_non : // 472
        regle32 () ;
      break ;
      case LEX_MCS.token_null : // 458
        regle32 () ;
      break ;
      case LEX_MCS.token_paro : // 440
        regle32 () ;
      break ;
      case LEX_MCS.token_mult : // 468
        regle32 () ;
      break ;
      case LEX_MCS.token_ident : // 476
        regle32 () ;
      break ;
      case LEX_MCS.token_aco : // 442
        regle32 () ;
      break ;
      case LEX_MCS.token_si : // 448
        regle32 () ;
      break ;
      case LEX_MCS.token_retour : // 456
        regle32 () ;
      break ;
      case LEX_MCS.token_asm : // 451
        regle32 () ;
      break ;
      case LEX_MCS.token_acf : // 443
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
