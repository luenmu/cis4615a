/******************************************************************************
 1. Rule 00. Input Validation and Data Sanitization (IDS)
IDS03-J. Correct the code as shown in theCompliant Solution below:
 ******************************************************************************/

i f ( l o g i n S u c c e s s f u l ) {
	l o g g e r . s e v e r e (” User l o g i n s u c c e e d e d f o r : ” + s a n i t i z e U s e r ( username ) ) ;
	} e l s e {
	l o g g e r . s e v e r e (” User l o g i n f a i l e d f o r : ” + s a n i t i z e U s e r ( username ) ) ;
	}
	p u bli c S t ri n g s a n i t i z e U s e r ( S t ri n g username ) {
	r e t u r n Pa t te rn . matches ( ” [A−Za−z0−9 ]+” , username ) )
	? username : ” u na u t ho ri z e d u s e r ” ;
}


