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
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
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
  LTYPES glob_73_lt;
  private void regle70() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_70();
  }
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_3, x_5);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_72(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_72(x_3, x_5);
  }
  private void regle71() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_71(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_71(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_71(x_3, x_5);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_ES_MCS x_4 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_FX_MCS x_7 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_4, x_7);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_ltypes_73(x_4, x_7);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htype_73(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_type_73(x_4, x_7);
  }
private void action_auto_inh_73(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> paro #ltypes ES parf #htype FX1 #type ;"});
}
  }
private void action_ltypes_73(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
glob_73_lt= new LTYPES();
x_4.att_ltypes=glob_73_lt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ltypes","FX -> paro #ltypes ES parf #htype FX1 #type ;"});
}
  }
private void action_htype_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
LCHAMPS loc_lchamps;
CHAMP loc_champ;
STRUCT loc_struct;
// instructions
if (this.att_htype instanceof STRUCT ){
loc_struct=((STRUCT)this.att_htype);
loc_lchamps=loc_struct.getChamps();
loc_champ=loc_lchamps.chercher(x_3.att_txt);
if (loc_champ==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_inexistant, MCSMessages.champ_inexistant,new Object[]{""+x_3.att_txt});

}
else {
x_5.att_htype=loc_champ.getType();
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_struct, MCSMessages.pas_struct,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_type_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident #htype FX1 #type ;"});
}
  }
private void action_type_73(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_code="";
this.att_type=x_7.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> paro #ltypes ES parf #htype FX1 #type ;"});
}
  }
private void action_type_70() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> #type ;"});
}
  }
private void action_htype_73(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
if (this.att_htype instanceof FONCTION ){
if (glob_73_lt==((FONCTION)this.att_htype).getTypes()){
x_7.att_htype=((FONCTION)this.att_htype).getRetour();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_mauvais_parametres, MCSMessages.mauvais_parametres,new Object[]{});

}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> paro #ltypes ES parf #htype FX1 #type ;"});
}
  }
private void action_type_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_htype_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_typePoint;
LCHAMPS loc_lchamps;
CHAMP loc_champ;
// instructions
if (this.att_htype instanceof POINTEUR ){
loc_typePoint=((POINTEUR)this.att_htype).getTypePointe();
if (loc_typePoint instanceof STRUCT ){
loc_lchamps=((STRUCT)loc_typePoint).getChamps();
loc_champ=loc_lchamps.chercher(x_3.att_txt);
if (loc_champ==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_inexistant, MCSMessages.champ_inexistant,new Object[]{""+x_3.att_txt});

}
else {
x_5.att_htype=loc_champ.getType();
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_struct, MCSMessages.pas_struct,new Object[]{});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_pointeur, MCSMessages.pas_pointeur,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> arrow ident #htype FX1 #type ;"});
}
  }
private void action_auto_inh_71(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #htype FX1 #type ;"});
}
  }
private void action_auto_inh_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident #htype FX1 #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 4510
        regle70 () ;
      break ;
      case LEX_MCS.token_div : // 4511
        regle70 () ;
      break ;
      case LEX_MCS.token_mod : // 4512
        regle70 () ;
      break ;
      case LEX_MCS.token_et : // 4513
        regle70 () ;
      break ;
      case LEX_MCS.token_plus : // 4507
        regle70 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle70 () ;
      break ;
      case LEX_MCS.token_ou : // 4509
        regle70 () ;
      break ;
      case LEX_MCS.token_inf : // 4501
        regle70 () ;
      break ;
      case LEX_MCS.token_sup : // 4503
        regle70 () ;
      break ;
      case LEX_MCS.token_infeg : // 4502
        regle70 () ;
      break ;
      case LEX_MCS.token_supeg : // 4504
        regle70 () ;
      break ;
      case LEX_MCS.token_eg : // 4505
        regle70 () ;
      break ;
      case LEX_MCS.token_neg : // 4506
        regle70 () ;
      break ;
      case LEX_MCS.token_affect : // 4489
        regle70 () ;
      break ;
      case LEX_MCS.token_virg : // 4486
        regle70 () ;
      break ;
      case LEX_MCS.token_pv : // 4488
        regle70 () ;
      break ;
      case LEX_MCS.token_parf : // 4483
        regle70 () ;
      break ;
      case LEX_MCS.token_pt : // 4487
        regle71 () ;
      break ;
      case LEX_MCS.token_arrow : // 4499
        regle72 () ;
      break ;
      case LEX_MCS.token_paro : // 4482
        regle73 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
