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
public class S_ENTITE_MCS {
LEX_MCS scanner;
  S_ENTITE_MCS() {
    }
  S_ENTITE_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle78() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_78(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_78(x_4);
if  (att_eval)      action_emp_78(x_4);
  }
  private void regle3() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_3, x_4);
    x_2.analyser(LEX_MCS.token_typedef);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_majtds_3(x_3, x_4);
  }
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_5 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_4(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_tds_4(x_2, x_3, x_5);
  }
private void action_htype_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","ENTITE -> TYPE ident #htype DECL #tds ;"});
}
  }
private void action_majtds_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// locales
TDS loc_tds;
INFO loc_i;
INFOTYPE loc_it;
// instructions
loc_tds=this.att_tds;
loc_i=loc_tds.chercherGlobalement(x_4.att_txt);
if (loc_i==null){
loc_it= new INFOTYPE(x_3.att_type);
loc_tds.inserer(x_4.att_txt, loc_it);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_non_disponible, MCSMessages.ident_non_disponible,new Object[]{""+x_4.att_txt});

}
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#majtds","ENTITE -> typedef TYPE identc pv #majtds ;"});
}
  }
private void action_tds_78(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_gen_78(ASM x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_emp_78(ASM x_4) throws Exception {
try {
// instructions
this.att_emp=this.att_hemp;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#emp","ENTITE -> asm #tds ASM #gen #emp ;"});
}
  }
private void action_auto_inh_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> TYPE ident #htype DECL #tds ;"});
}
  }
private void action_auto_inh_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> typedef TYPE identc pv #majtds ;"});
}
  }
private void action_tds_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_iv;
Emplacement loc_e;
int loc_dep;
Register loc_reg;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_3.att_txt);
if (loc_i==null){
loc_e=this.att_hemp;
loc_iv= new INFOVAR(x_5.att_type, loc_e);
    this.att_tds.inserer(x_3.att_txt, loc_iv);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_non_disponible, MCSMessages.ident_non_disponible,new Object[]{""+x_3.att_txt});

}
loc_dep=x_2.att_type.getTaille()+this.att_hemp.getDep();
loc_reg=this.att_hemp.getReg();
this.att_emp= new Emplacement(loc_dep, loc_reg);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> TYPE ident #htype DECL #tds ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 4497
        regle3 () ;
      break ;
      case LEX_MCS.token_void : // 4492
        regle4 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle4 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle4 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle4 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle4 () ;
      break ;
      case LEX_MCS.token_asm : // 4493
        regle78 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
