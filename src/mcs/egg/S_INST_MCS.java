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
public class S_INST_MCS {
LEX_MCS scanner;
  S_INST_MCS() {
    }
  S_INST_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle30() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_7 = new S_BLOC_MCS(scanner,att_eval) ;
    S_SIX_MCS x_8 = new S_SIX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_4, x_7, x_8);
    x_2.analyser(LEX_MCS.token_si);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_tds_30(x_4, x_7, x_8);
    x_7.analyser() ;
    x_8.analyser() ;
if  (att_eval)      action_emp_30(x_4, x_7, x_8);
if  (att_eval)      action_gen_30(x_4, x_7, x_8);
  }
  private void regle33() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_33(x_3);
    x_2.analyser(LEX_MCS.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_emp_33(x_3);
if  (att_eval)      action_gen_33(x_3);
  }
  private void regle27() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_AFFX_MCS x_5 = new S_AFFX_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_27(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_27(x_2, x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_tds_27(x_2, x_3, x_5);
  }
  private void regle79() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_79(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_79(x_4);
if  (att_eval)      action_emp_79(x_4);
  }
  private void regle29() throws Exception {

    //declaration
    S_BLOC_MCS x_3 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_29(x_3);
if  (att_eval)      action_tds_29(x_3);
    x_3.analyser() ;
if  (att_eval)      action_emp_29(x_3);
if  (att_eval)      action_gen_29(x_3);
  }
  private void regle28() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_emp_28(x_2);
if  (att_eval)      action_gen_28(x_2);
  }
private void action_htype_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","INST -> TYPE ident #htype AFFX pv #tds ;"});
}
  }
private void action_tds_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
Emplacement loc_e;
// instructions
loc_i=this.att_tds.chercherLocalement(x_3.att_txt);
if (loc_i==null){
loc_e=this.att_hemp;
loc_iv= new INFOVAR(x_2.att_type, loc_e);
this.att_tds.inserer(x_3.att_txt, loc_iv);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_non_disponible, MCSMessages.ident_non_disponible,new Object[]{""+x_3.att_txt});

}
this.att_emp= new Emplacement(loc_e.getDep()+x_2.att_type.getTaille(), loc_e.getReg());
this.att_code=this.att_machine.genDecl(x_3.att_txt, loc_iv, x_5.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> TYPE ident #htype AFFX pv #tds ;"});
}
  }
private void action_auto_inh_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> TYPE ident #htype AFFX pv #tds ;"});
}
  }
private void action_gen_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIf(x_4.att_code, x_7.att_code, x_8.att_code)+this.att_machine.genFree(x_7.att_emp.getDep()-this.att_hemp.getDep());
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> si paro E parf #tds BLOC SIX #emp #gen ;"});
}
  }
private void action_auto_inh_28(S_E_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> E pv #emp #gen ;"});
}
  }
private void action_tds_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
x_3.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> #tds BLOC #emp #gen ;"});
}
  }
private void action_gen_33(S_E_MCS x_3) throws Exception {
try {
// locales
LTYPES loc_lt;
// instructions
if (this.att_htype instanceof FONCTION ){
loc_lt=((FONCTION)this.att_htype).getTypes();
this.att_code="RETURN ( "+loc_lt.getTaille()+") "+((FONCTION)this.att_htype).getTaille()+";\n";
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_pas_fonction, MCSMessages.pas_fonction,new Object[]{});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> retour E pv #emp #gen ;"});
}
  }
private void action_auto_inh_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_hemp=this.att_hemp;
x_3.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> #tds BLOC #emp #gen ;"});
}
  }
private void action_emp_28(S_E_MCS x_2) throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INST -> E pv #emp #gen ;"});
}
  }
private void action_gen_28(S_E_MCS x_2) throws Exception {
try {
// instructions
this.att_code=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> E pv #emp #gen ;"});
}
  }
private void action_tds_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
x_7.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> si paro E parf #tds BLOC SIX #emp #gen ;"});
}
  }
private void action_auto_inh_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
x_7.att_hemp=this.att_hemp;
x_8.att_hemp=this.att_hemp;
x_7.att_htype=this.att_htype;
x_8.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> si paro E parf #tds BLOC SIX #emp #gen ;"});
}
  }
private void action_emp_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INST -> #tds BLOC #emp #gen ;"});
}
  }
private void action_gen_29(S_BLOC_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+this.att_machine.genFree(x_3.att_emp.getDep()-this.att_hemp.getDep());
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> #tds BLOC #emp #gen ;"});
}
  }
private void action_auto_inh_33(S_E_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> retour E pv #emp #gen ;"});
}
  }
private void action_gen_79(ASM x_4) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_emp_79(ASM x_4) throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INST -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_tds_79(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_emp_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INST -> si paro E parf #tds BLOC SIX #emp #gen ;"});
}
  }
private void action_emp_33(S_E_MCS x_3) throws Exception {
try {
// instructions
this.att_emp= new Emplacement();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","INST -> retour E pv #emp #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 4492
        regle27 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle27 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle27 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle27 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle27 () ;
      break ;
      case LEX_MCS.token_entier : // 4515
        regle28 () ;
      break ;
      case LEX_MCS.token_caractere : // 4516
        regle28 () ;
      break ;
      case LEX_MCS.token_plus : // 4507
        regle28 () ;
      break ;
      case LEX_MCS.token_moins : // 4508
        regle28 () ;
      break ;
      case LEX_MCS.token_non : // 4514
        regle28 () ;
      break ;
      case LEX_MCS.token_null : // 4500
        regle28 () ;
      break ;
      case LEX_MCS.token_paro : // 4482
        regle28 () ;
      break ;
      case LEX_MCS.token_mult : // 4510
        regle28 () ;
      break ;
      case LEX_MCS.token_ident : // 4518
        regle28 () ;
      break ;
      case LEX_MCS.token_aco : // 4484
        regle29 () ;
      break ;
      case LEX_MCS.token_si : // 4490
        regle30 () ;
      break ;
      case LEX_MCS.token_retour : // 4498
        regle33 () ;
      break ;
      case LEX_MCS.token_asm : // 4493
        regle79 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
