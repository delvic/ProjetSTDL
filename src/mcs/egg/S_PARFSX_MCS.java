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
public class S_PARFSX_MCS {
LEX_MCS scanner;
  S_PARFSX_MCS() {
    }
  S_PARFSX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle10() throws Exception {

    //declaration
    //appel
  }
  private void regle11() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARF_MCS x_3 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_6 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_11(x_3, x_6);
    x_2.analyser(LEX_MCS.token_virg);
    x_3.analyser() ;
if  (att_eval)      action_dep_11(x_3, x_6);
if  (att_eval)      action_lchamps_11(x_3, x_6);
    x_6.analyser() ;
  }
private void action_auto_inh_11(S_PARF_MCS x_3, S_PARFSX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
x_6.att_lchamps=this.att_lchamps;
x_3.att_hdep=this.att_hdep;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFSX -> virg PARF #dep #lchamps PARFSX1 ;"});
}
  }
private void action_lchamps_11(S_PARF_MCS x_3, S_PARFSX_MCS x_6) throws Exception {
try {
// instructions
this.att_lchamps.inserer(x_3.att_champ);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#lchamps","PARFSX -> virg PARF #dep #lchamps PARFSX1 ;"});
}
  }
private void action_dep_11(S_PARF_MCS x_3, S_PARFSX_MCS x_6) throws Exception {
try {
// instructions
x_6.att_hdep=this.att_hdep+x_3.att_type.getTaille();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","PARFSX -> virg PARF #dep #lchamps PARFSX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 4483
        regle10 () ;
      break ;
      case LEX_MCS.token_virg : // 4486
        regle11 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
