grammar TenaliCommand;

/*
* Parser rules
*/


parse
 : sql_stmt_list EOF
 ;


sql_stmt_list
 : ( sql_stmt Q_SEMI* )+
 ;


sql_stmt
  : op=(Q_SET
  |  Q_ADD_JAR
  |  Q_USE
  |  Q_WITH
  |  Q_CREATE_FUNCTION
  |  Q_INSERT
  |  Q_SELECT
  |  Q_DROP_TABLE
  |  Q_DROP_VIEW
  |  Q_ALTER_TABLE
  |  Q_CREATE_TABLE
  |  Q_CREATE_EXTERNAL_TABLE
  |  Q_CREATE_VIEW)
  ;



/*
* Lexer rules
*/

Q_SET
 :  S E T  SPACES+  TEXT+
 ;

Q_ADD_JAR
 :  A D D  SPACES+  J A R  SPACES+  TEXT+
 ;

Q_USE
 :  U S E  SPACES+  TEXT+
 ;

Q_CREATE_FUNCTION
 :  C R E A T E  SPACES+  T E M P O R A R Y  SPACES+  TEXT+
 ;

Q_INSERT
 :  I N S E R T  SPACES+  TEXT+
 ;

Q_SELECT
 :  S E L E C T  SPACES+  TEXT+
 ;


Q_DROP_TABLE
 : D R O P  SPACES+  T A B L E  SPACES+  TEXT+
 ;

Q_DROP_VIEW
 : D R O P  SPACES+  V I E W  SPACES+  TEXT+
 ;

Q_ALTER_TABLE
 :  A L T E R  SPACES+  T A B L E  SPACES+  TEXT+
 ;

Q_CREATE_TABLE
 :  C R E A T E  SPACES+  T A B L E  SPACES+  TEXT+
 ;

 Q_CREATE_EXTERNAL_TABLE
 :  C R E A T E  SPACES+  E X T E R N A L  SPACES+  T A B L E  SPACES+  TEXT+
 ;

Q_CREATE_VIEW
 :  C R E A T E  SPACES+  V I E W  SPACES+  TEXT+
 ;

Q_WITH
 :  W I T H  SPACES+  TEXT+
 ;


TEXT
 :  ~[;]
 ;


Q_SEMI
 : [;]+  SPACES*
 ;


SIMPLE_COMMENT
  : '--' ~[\r\n]* '\r'? '\n'? -> channel(HIDDEN)
  ;

BRACKETED_EMPTY_COMMENT
 : '/**/' -> channel(HIDDEN)
 ;

BRACKETED_COMMENT
 : '/*' ~[+] .*? '*/' -> channel(HIDDEN)
 ;

WS
 : [ ;\r\n\t]+ -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n]
 ;



fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];