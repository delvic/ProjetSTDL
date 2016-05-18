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
public class S_ES_MCS {
LEX_MCS scanner;
  S_ES_MCS() {
    }
  S_ES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  LTYPES att_ltypes;
  private void regle74() throws Exception {

    //declaration
    //appel
  }
  private void regle75() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_4 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_ltypes_75(x_2, x_4);
    x_4.analyser() ;
  }
private void action_auto_inh_75(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_4.att_ltypes=this.att_ltypes;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> E #ltypes ESX ;"});
}
  }
private void action_ltypes_75(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
this.att_ltypes.inserer(x_2.att_type);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ltypes","ES -> E #ltypes ESX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 4483
        regle74 () ;
      break ;
      case LEX_MCS.token_entier : // 4515
        regle75 () ;
      break ;
      case LEX_MCS.token_caractere : // 4516
        regle75 () ;
      break ;
      case LEX_MCS.token_plus : // 4507
        regle75 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle75 () ;
      break ;
      case LEX_MCS.token_non : // 4514
        regle75 () ;
      break ;
      case LEX_MCS.token_null : // 4500
        regle75 () ;
      break ;
      case LEX_MCS.token_paro : // 4482
        regle75 () ;
      break ;
      case LEX_MCS.token_mult : // 4510
        regle75 () ;
      break ;
      case LEX_MCS.token_ident : // 4518
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
