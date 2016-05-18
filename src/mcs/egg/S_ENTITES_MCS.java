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
public class S_ENTITES_MCS {
LEX_MCS scanner;
  S_ENTITES_MCS() {
    }
  S_ENTITES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  Emplacement att_hemp;
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  Emplacement att_emp;
  private void regle2() throws Exception {

    //declaration
    S_ENTITE_MCS x_2 = new S_ENTITE_MCS(scanner,att_eval) ;
    S_ENTITES_MCS x_4 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_hemp_2(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_emp_2(x_2, x_4);
  }
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_emp_1();
  }
private void action_emp_1() throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","ENTITES -> #emp ;"});
}
  }
private void action_auto_inh_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_hemp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITES -> ENTITE #hemp ENTITES1 #emp ;"});
}
  }
private void action_hemp_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hemp=x_2.att_emp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hemp","ENTITES -> ENTITE #hemp ENTITES1 #emp ;"});
}
  }
private void action_emp_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
this.att_emp=x_4.att_emp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","ENTITES -> ENTITE #hemp ENTITES1 #emp ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.EOF :
        regle1 () ;
      break ;
      case LEX_MCS.token_typedef : // 455
        regle2 () ;
      break ;
      case LEX_MCS.token_void : // 450
        regle2 () ;
      break ;
      case LEX_MCS.token_int : // 452
        regle2 () ;
      break ;
      case LEX_MCS.token_char : // 453
        regle2 () ;
      break ;
      case LEX_MCS.token_identc : // 477
        regle2 () ;
      break ;
      case LEX_MCS.token_struct : // 454
        regle2 () ;
      break ;
      case LEX_MCS.token_asm : // 451
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
