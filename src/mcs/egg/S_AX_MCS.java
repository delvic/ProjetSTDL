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
public class S_AX_MCS {
LEX_MCS scanner;
  S_AX_MCS() {
    }
  S_AX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle38() throws Exception {

    //declaration
    S_OPREL_MCS x_2 = new S_OPREL_MCS(scanner,att_eval) ;
    S_R_MCS x_3 = new S_R_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_38(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_type_38(x_2, x_3);
if  (att_eval)      action_gen_38(x_2, x_3);
  }
  private void regle39() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_39();
if  (att_eval)      action_gen_39();
  }
private void action_gen_39() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AX -> #type #gen ;"});
}
  }
private void action_gen_38(S_OPREL_MCS x_2, S_R_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AX -> OPREL R #type #gen ;"});
}
  }
private void action_auto_inh_38(S_OPREL_MCS x_2, S_R_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_2.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AX -> OPREL R #type #gen ;"});
}
  }
private void action_type_38(S_OPREL_MCS x_2, S_R_MCS x_3) throws Exception {
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
this.att_type=loc_retour;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_op, MCSMessages.pas_op,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AX -> OPREL R #type #gen ;"});
}
  }
private void action_type_39() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AX -> #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 459
        regle38 () ;
      break ;
      case LEX_MCS.token_sup : // 461
        regle38 () ;
      break ;
      case LEX_MCS.token_infeg : // 460
        regle38 () ;
      break ;
      case LEX_MCS.token_supeg : // 462
        regle38 () ;
      break ;
      case LEX_MCS.token_eg : // 463
        regle38 () ;
      break ;
      case LEX_MCS.token_neg : // 464
        regle38 () ;
      break ;
      case LEX_MCS.token_affect : // 447
        regle39 () ;
      break ;
      case LEX_MCS.token_virg : // 444
        regle39 () ;
      break ;
      case LEX_MCS.token_pv : // 446
        regle39 () ;
      break ;
      case LEX_MCS.token_parf : // 441
        regle39 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
