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
public class S_OPADD_MCS {
LEX_MCS scanner;
  S_OPADD_MCS() {
    }
  S_OPADD_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle49() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_plus);
if  (att_eval)      action_type_49();
if  (att_eval)      action_gen_49();
  }
  private void regle50() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_moins);
if  (att_eval)      action_type_50();
if  (att_eval)      action_gen_50();
  }
  private void regle51() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_ou);
if  (att_eval)      action_type_51();
if  (att_eval)      action_gen_51();
  }
private void action_gen_49() throws Exception {
try {
// instructions
this.att_code="SUBR IAdd;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPADD -> plus #type #gen ;"});
}
  }
private void action_type_50() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPADD -> moins #type #gen ;"});
}
  }
private void action_type_51() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPADD -> ou #type #gen ;"});
}
  }
private void action_type_49() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPADD -> plus #type #gen ;"});
}
  }
private void action_gen_51() throws Exception {
try {
// instructions
this.att_code="SUBR IAdd;\nLOADL 1;\nSUBR IGeq;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPADD -> ou #type #gen ;"});
}
  }
private void action_gen_50() throws Exception {
try {
// instructions
this.att_code="SUBR ISub;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPADD -> moins #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_plus : // 465
        regle49 () ;
      break ;
      case LEX_MCS.token_moins : // 466
        regle50 () ;
      break ;
      case LEX_MCS.token_ou : // 467
        regle51 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
