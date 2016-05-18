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
public class S_INSTS_MCS {
LEX_MCS scanner;
  S_INSTS_MCS() {
    }
  S_INSTS_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle26() throws Exception {

    //declaration
    S_INST_MCS x_2 = new S_INST_MCS(scanner,att_eval) ;
    S_INSTS_MCS x_4 = new S_INSTS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_26(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_hemp_26(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_emp_26(x_2, x_4);
if  (att_eval)      action_gen_26(x_2, x_4);
  }
  private void regle25() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_emp_25();
if  (att_eval)      action_gen_25();
  }
private void action_hemp_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hemp=x_2.att_emp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hemp","INSTS -> INST #hemp INSTS1 #emp #gen ;"});
}
  }
private void action_emp_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
this.att_emp=x_4.att_emp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INSTS -> INST #hemp INSTS1 #emp #gen ;"});
}
  }
private void action_gen_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> INST #hemp INSTS1 #emp #gen ;"});
}
  }
private void action_emp_25() throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INSTS -> #emp #gen ;"});
}
  }
private void action_gen_25() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> #emp #gen ;"});
}
  }
private void action_auto_inh_26(S_INST_MCS x_2, S_INSTS_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_hemp=this.att_hemp;
x_2.att_htype=this.att_htype;
x_4.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INSTS -> INST #hemp INSTS1 #emp #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 443
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 450
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 452
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 453
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 477
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 454
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 473
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 474
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 465
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 466
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 472
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 458
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 440
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 468
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 476
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 442
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 448
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 456
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 451
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
