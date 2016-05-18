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
public class S_F_MCS {
LEX_MCS scanner;
  S_F_MCS() {
    }
  S_F_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle61() throws Exception {

    //declaration
    S_OPUN_MCS x_2 = new S_OPUN_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_61(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_type_61(x_2, x_3);
if  (att_eval)      action_gen_61(x_2, x_3);
  }
  private void regle60() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_caractere);
if  (att_eval)      action_type_60(x_2);
if  (att_eval)      action_gen_60(x_2);
  }
  private void regle65() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null);
if  (att_eval)      action_type_65();
if  (att_eval)      action_gen_65();
  }
  private void regle67() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_F_MCS x_5 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_67(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_type_67(x_3, x_5);
if  (att_eval)      action_gen_67(x_3, x_5);
  }
  private void regle66() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_66(x_3, x_6);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htype_66(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_66(x_3, x_6);
if  (att_eval)      action_gen_66(x_3, x_6);
  }
  private void regle69() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_2, x_4);
    x_2.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_69(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_69(x_2, x_4);
if  (att_eval)      action_gen_69(x_2, x_4);
  }
  private void regle68() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_68(x_3);
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
if  (att_eval)      action_type_68(x_3);
if  (att_eval)      action_gen_68(x_3);
  }
  private void regle59() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_entier);
if  (att_eval)      action_type_59(x_2);
if  (att_eval)      action_gen_59(x_2);
  }
private void action_type_67(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
if (x_3.att_type.compareTo(x_5.att_type)){
this.att_type=x_3.att_type;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_type_68(S_F_MCS x_3) throws Exception {
try {
// instructions
if (x_3.att_type instanceof POINTEUR ){
this.att_type=((POINTEUR)x_3.att_type).getTypePointe();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_pointeur, MCSMessages.pas_pointeur,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> mult F1 #type #gen ;"});
}
  }
private void action_htype_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_not_found, MCSMessages.ident_not_found,new Object[]{""+x_2.att_txt});

}
else {
if (loc_i instanceof INFOVAR ){
loc_iv=((INFOVAR)loc_i);
x_4.att_htype=loc_iv.getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_var_name, MCSMessages.not_var_name,new Object[]{""+x_2.att_txt});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> ident #htype FX #type #gen ;"});
}
  }
private void action_type_65() throws Exception {
try {
// instructions
this.att_type= new POINTEUR();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> null #type #gen ;"});
}
  }
private void action_type_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_6.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro E parf #htype FX #type #gen ;"});
}
  }
private void action_type_61(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
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
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> OPUN F1 #type #gen ;"});
}
  }
private void action_gen_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro E parf #htype FX #type #gen ;"});
}
  }
private void action_gen_65() throws Exception {
try {
// instructions
this.att_code="SUBR MVoid ; \n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> null #type #gen ;"});
}
  }
private void action_gen_60(T_MCS x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> caractere #type #gen ;"});
}
  }
private void action_type_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> ident #htype FX #type #gen ;"});
}
  }
private void action_type_59(T_MCS x_2) throws Exception {
try {
// instructions
this.att_type= new TYPE_BASE(1, "entier");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> entier #type #gen ;"});
}
  }
private void action_gen_61(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> OPUN F1 #type #gen ;"});
}
  }
private void action_auto_inh_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro E parf #htype FX #type #gen ;"});
}
  }
private void action_gen_68(S_F_MCS x_3) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> mult F1 #type #gen ;"});
}
  }
private void action_auto_inh_67(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_gen_67(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_gen_59(T_MCS x_2) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> entier #type #gen ;"});
}
  }
private void action_auto_inh_68(S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> mult F1 #type #gen ;"});
}
  }
private void action_auto_inh_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> ident #htype FX #type #gen ;"});
}
  }
private void action_gen_69(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> ident #htype FX #type #gen ;"});
}
  }
private void action_type_60(T_MCS x_2) throws Exception {
try {
// instructions
this.att_type= new TYPE_BASE(1, "char");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> caractere #type #gen ;"});
}
  }
private void action_htype_66(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_6.att_htype=x_3.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> paro E parf #htype FX #type #gen ;"});
}
  }
private void action_auto_inh_61(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> OPUN F1 #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 4515
        regle59 () ;
      break ;
      case LEX_MCS.token_caractere : // 4516
        regle60 () ;
      break ;
      case LEX_MCS.token_plus : // 4507
        regle61 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle61 () ;
      break ;
      case LEX_MCS.token_non : // 4514
        regle61 () ;
      break ;
      case LEX_MCS.token_null : // 4500
        regle65 () ;
      break ;
      case LEX_MCS.token_paro : // 4482
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_entier : // 4515
            regle66 () ;
          break ;
          case LEX_MCS.token_caractere : // 4516
            regle66 () ;
          break ;
          case LEX_MCS.token_plus : // 4507
            regle66 () ;
          break ;
          case LEX_MCS.token_moins : // 4508
            regle66 () ;
          break ;
          case LEX_MCS.token_non : // 4514
            regle66 () ;
          break ;
          case LEX_MCS.token_null : // 4500
            regle66 () ;
          break ;
          case LEX_MCS.token_paro : // 4482
            regle66 () ;
          break ;
          case LEX_MCS.token_mult : // 4510
            regle66 () ;
          break ;
          case LEX_MCS.token_ident : // 4518
            regle66 () ;
          break ;
          case LEX_MCS.token_void : // 4492
            regle67 () ;
          break ;
          case LEX_MCS.token_int : // 4494
            regle67 () ;
          break ;
          case LEX_MCS.token_char : // 4495
            regle67 () ;
          break ;
          case LEX_MCS.token_identc : // 4519
            regle67 () ;
          break ;
          case LEX_MCS.token_struct : // 4496
            regle67 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_paro);
        }
      break ;
      case LEX_MCS.token_mult : // 4510
        regle68 () ;
      break ;
      case LEX_MCS.token_ident : // 4518
        regle69 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
