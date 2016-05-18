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
public class S_TX_MCS {
LEX_MCS scanner;
  S_TX_MCS() {
    }
  S_TX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  DTYPE att_htype;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle54() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_54();
if  (att_eval)      action_gen_54();
  }
  private void regle53() throws Exception {

    //declaration
    S_OPMUL_MCS x_2 = new S_OPMUL_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_5 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_53(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_htype_53(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_53(x_2, x_3, x_5);
if  (att_eval)      action_gen_53(x_2, x_3, x_5);
  }
private void action_auto_inh_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_2.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","TX -> OPMUL F #htype TX1 #type #gen ;"});
}
  }
private void action_type_54() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> #type #gen ;"});
}
  }
private void action_type_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> OPMUL F #htype TX1 #type #gen ;"});
}
  }
private void action_gen_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_2.att_code+x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","TX -> OPMUL F #htype TX1 #type #gen ;"});
}
  }
private void action_htype_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_droite;
DTYPE loc_retour;
OP loc_op;
// instructions
if (x_2.att_type instanceof OP ){
loc_op=((OP)x_2.att_type);
loc_droite=loc_op.getDroite();
if (x_3.att_type.compareTo(loc_droite)){
loc_retour=loc_op.getRetour();
x_5.att_htype=loc_retour;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_op, MCSMessages.pas_op,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","TX -> OPMUL F #htype TX1 #type #gen ;"});
}
  }
private void action_gen_54() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","TX -> #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 468
        regle53 () ;
      break ;
      case LEX_MCS.token_div : // 469
        regle53 () ;
      break ;
      case LEX_MCS.token_mod : // 470
        regle53 () ;
      break ;
      case LEX_MCS.token_et : // 471
        regle53 () ;
      break ;
      case LEX_MCS.token_plus : // 465
        regle54 () ;
      break ;
      case LEX_MCS.token_moins : // 466
        regle54 () ;
      break ;
      case LEX_MCS.token_ou : // 467
        regle54 () ;
      break ;
      case LEX_MCS.token_inf : // 459
        regle54 () ;
      break ;
      case LEX_MCS.token_sup : // 461
        regle54 () ;
      break ;
      case LEX_MCS.token_infeg : // 460
        regle54 () ;
      break ;
      case LEX_MCS.token_supeg : // 462
        regle54 () ;
      break ;
      case LEX_MCS.token_eg : // 463
        regle54 () ;
      break ;
      case LEX_MCS.token_neg : // 464
        regle54 () ;
      break ;
      case LEX_MCS.token_affect : // 447
        regle54 () ;
      break ;
      case LEX_MCS.token_virg : // 444
        regle54 () ;
      break ;
      case LEX_MCS.token_pv : // 446
        regle54 () ;
      break ;
      case LEX_MCS.token_parf : // 441
        regle54 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
