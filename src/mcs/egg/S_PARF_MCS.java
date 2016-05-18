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
public class S_PARF_MCS {
LEX_MCS scanner;
  S_PARF_MCS() {
    }
  S_PARF_MCS(LEX_MCS scanner, boolean eval) {
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
  DTYPE att_type;
  CHAMP att_champ;
  private void regle12() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_12(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_tds_12(x_2, x_3);
if  (att_eval)      action_champ_12(x_2, x_3);
  }
private void action_tds_12(S_TYPE_MCS x_2, T_MCS x_3) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
Emplacement loc_e;
// instructions
loc_i=this.att_tds.chercherLocalement(x_3.att_txt);
if (loc_i==null){
loc_e= new Emplacement();
loc_iv= new INFOVAR(x_2.att_type, loc_e);
    this.att_tds.inserer(x_3.att_txt, loc_iv);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_non_disponible, MCSMessages.ident_non_disponible,new Object[]{""+x_3.att_txt});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARF -> TYPE ident #tds #champ ;"});
}
  }
private void action_auto_inh_12(S_TYPE_MCS x_2, T_MCS x_3) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARF -> TYPE ident #tds #champ ;"});
}
  }
private void action_champ_12(S_TYPE_MCS x_2, T_MCS x_3) throws Exception {
try {
// instructions
this.att_champ= new CHAMP(this.att_hdep, x_3.att_txt, x_2.att_type);
this.att_type=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#champ","PARF -> TYPE ident #tds #champ ;"});
}
  }
  public void analyser () throws Exception {
    regle12 () ;
  }
  }
