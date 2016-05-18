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
public class S_OPMUL_MCS {
LEX_MCS scanner;
  S_OPMUL_MCS() {
    }
  S_OPMUL_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle56() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_div);
if  (att_eval)      action_type_56();
if  (att_eval)      action_gen_56();
  }
  private void regle57() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mod);
if  (att_eval)      action_type_57();
if  (att_eval)      action_gen_57();
  }
  private void regle58() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_et);
if  (att_eval)      action_type_58();
if  (att_eval)      action_gen_58();
  }
  private void regle55() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
if  (att_eval)      action_type_55();
if  (att_eval)      action_gen_55();
  }
private void action_type_56() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> div #type #gen ;"});
}
  }
private void action_type_57() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> mod #type #gen ;"});
}
  }
private void action_type_55() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> mult #type #gen ;"});
}
  }
private void action_gen_57() throws Exception {
try {
// instructions
this.att_code="SUBR IMod;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPMUL -> mod #type #gen ;"});
}
  }
private void action_gen_56() throws Exception {
try {
// instructions
this.att_code="SUBR IDiv;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPMUL -> div #type #gen ;"});
}
  }
private void action_gen_58() throws Exception {
try {
// instructions
this.att_code="SUBR IMul;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPMUL -> et #type #gen ;"});
}
  }
private void action_gen_55() throws Exception {
try {
// instructions
this.att_code="SUBR IMul;\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","OPMUL -> mult #type #gen ;"});
}
  }
private void action_type_58() throws Exception {
try {
// instructions
if ((this.att_htype.compareTo( new TYPE_BASE(1, "entier")))){
this.att_type= new OP( new TYPE_BASE(1, "entier"), this.att_htype);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_types_incompatibles, MCSMessages.types_incompatibles,new Object[]{});

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> et #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 468
        regle55 () ;
      break ;
      case LEX_MCS.token_div : // 469
        regle56 () ;
      break ;
      case LEX_MCS.token_mod : // 470
        regle57 () ;
      break ;
      case LEX_MCS.token_et : // 471
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
