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
public class S_OPREL_MCS {
LEX_MCS scanner;
  S_OPREL_MCS() {
    }
  S_OPREL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  boolean att_eval;
  String att_code;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle40() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_inf);
if  (att_eval)      action_type_40();
if  (att_eval)      action_gen_40();
  }
  private void regle41() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_sup);
if  (att_eval)      action_type_41();
if  (att_eval)      action_gen_41();
  }
  private void regle42() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_infeg);
if  (att_eval)      action_type_42();
if  (att_eval)      action_gen_42();
  }
  private void regle43() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_supeg);
if  (att_eval)      action_type_43();
if  (att_eval)      action_gen_43();
  }
  private void regle44() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_eg);
if  (att_eval)      action_type_44();
if  (att_eval)      action_gen_44();
  }
  private void regle45() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_neg);
if  (att_eval)      action_type_45();
if  (att_eval)      action_gen_45();
  }
private void action_type_45() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> neg #type #gen ;"});
}
  }
private void action_type_43() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> supeg #type #gen ;"});
}
  }
private void action_type_44() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> eg #type #gen ;"});
}
  }
private void action_type_41() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> sup #type #gen ;"});
}
  }
private void action_type_42() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> infeg #type #gen ;"});
}
  }
private void action_gen_45() throws Exception {
try {
// instructions
this.att_code="SUBR INeq;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> neg #type #gen ;"});
}
  }
private void action_type_40() throws Exception {
try {
// instructions
if (((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))||(this.att_htype.compareTo( new TYPE_BASE(1, "char"))))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> inf #type #gen ;"});
}
  }
private void action_gen_42() throws Exception {
try {
// instructions
this.att_code="SUBR ILeq;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> infeg #type #gen ;"});
}
  }
private void action_gen_41() throws Exception {
try {
// instructions
this.att_code="SUBR IGtr;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> sup #type #gen ;"});
}
  }
private void action_gen_44() throws Exception {
try {
// instructions
this.att_code="SUBR IEq;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> eg #type #gen ;"});
}
  }
private void action_gen_43() throws Exception {
try {
// instructions
this.att_code="SUBR IGeq;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> supeg #type #gen ;"});
}
  }
private void action_gen_40() throws Exception {
try {
// instructions
this.att_code="SUBR ILss;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPREL -> inf #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 459
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 461
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 460
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 462
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 463
        regle44 () ;
      break ;
      case LEX_MCS.token_neg : // 464
        regle45 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
