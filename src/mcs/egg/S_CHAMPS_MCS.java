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
public class S_CHAMPS_MCS {
LEX_MCS scanner;
  S_CHAMPS_MCS() {
    }
  S_CHAMPS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  int att_hdep;
  LEX_MCS att_scanner;
  LCHAMPS att_lchamps;
  private void regle22() throws Exception {

    //declaration
    S_CHAMP_MCS x_2 = new S_CHAMP_MCS(scanner,att_eval) ;
    S_CHAMPS_MCS x_5 = new S_CHAMPS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_dep_22(x_2, x_5);
if  (att_eval)      action_lchamps_22(x_2, x_5);
    x_5.analyser() ;
  }
  private void regle21() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_lchamps=this.att_lchamps;
x_2.att_hdep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","CHAMPS -> CHAMP #dep #lchamps CHAMPS1 ;"});
}
  }
private void action_lchamps_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
if (this.att_lchamps.chercher(x_2.att_champ.getNom())==null){
this.att_lchamps.inserer(x_2.att_champ);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_non_disponible, MCSMessages.ident_non_disponible,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#lchamps","CHAMPS -> CHAMP #dep #lchamps CHAMPS1 ;"});
}
  }
private void action_dep_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
x_5.att_hdep=this.att_hdep+x_2.att_type.getTaille();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","CHAMPS -> CHAMP #dep #lchamps CHAMPS1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 4485
        regle21 () ;
      break ;
      case LEX_MCS.token_void : // 4492
        regle22 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle22 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle22 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle22 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
