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
public class S_STYPE_MCS {
LEX_MCS scanner;
  S_STYPE_MCS() {
    }
  S_STYPE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LEX_MCS att_scanner;
  DTYPE att_type;
  LCHAMPS glob_20_lc;
  private void regle19() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_type_19(x_2);
  }
  private void regle18() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_char);
if  (att_eval)      action_type_18();
  }
  private void regle17() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_int);
if  (att_eval)      action_type_17();
  }
  private void regle16() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_void);
if  (att_eval)      action_type_16();
  }
  private void regle20() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_CHAMPS_MCS x_6 = new S_CHAMPS_MCS(scanner,att_eval) ;
    T_MCS x_7 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_20(x_6);
    x_2.analyser(LEX_MCS.token_struct);
    x_3.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_hdep_20(x_6);
if  (att_eval)      action_lchamps_20(x_6);
    x_6.analyser() ;
    x_7.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_type_20(x_6);
  }
private void action_auto_inh_20(S_CHAMPS_MCS x_6) throws Exception {
try {
// instructions
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","STYPE -> struct aco #hdep #lchamps CHAMPS acf #type ;"});
}
  }
private void action_lchamps_20(S_CHAMPS_MCS x_6) throws Exception {
try {
// instructions
glob_20_lc= new LCHAMPS();
x_6.att_lchamps=glob_20_lc;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#lchamps","STYPE -> struct aco #hdep #lchamps CHAMPS acf #type ;"});
}
  }
private void action_type_20(S_CHAMPS_MCS x_6) throws Exception {
try {
// instructions
this.att_type= new STRUCT(glob_20_lc);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> struct aco #hdep #lchamps CHAMPS acf #type ;"});
}
  }
private void action_hdep_20(S_CHAMPS_MCS x_6) throws Exception {
try {
// instructions
x_6.att_hdep=0;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hdep","STYPE -> struct aco #hdep #lchamps CHAMPS acf #type ;"});
}
  }
private void action_type_18() throws Exception {
try {
// instructions
this.att_type= new TYPE_BASE(1, "char");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> char #type ;"});
}
  }
private void action_type_19(T_MCS x_2) throws Exception {
try {
// locales
INFO loc_i;
INFOTYPE loc_it;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_ident_not_found, MCSMessages.ident_not_found,new Object[]{""+x_2.att_txt});

}
else {
if (loc_i instanceof INFOTYPE ){
loc_it=((INFOTYPE)loc_i);
this.att_type=loc_it.getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_type_name, MCSMessages.not_type_name,new Object[]{""+x_2.att_txt});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> identc #type ;"});
}
  }
private void action_type_16() throws Exception {
try {
// instructions
this.att_type= new TYPE_BASE(0, "void");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> void #type ;"});
}
  }
private void action_type_17() throws Exception {
try {
// instructions
this.att_type= new TYPE_BASE(1, "entier");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> int #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 4492
        regle16 () ;
      break ;
      case LEX_MCS.token_int : // 4494
        regle17 () ;
      break ;
      case LEX_MCS.token_char : // 4495
        regle18 () ;
      break ;
      case LEX_MCS.token_identc : // 4519
        regle19 () ;
      break ;
      case LEX_MCS.token_struct : // 4496
        regle20 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
