/******************************************************************************
 1. Rule 00. Input Validation and Data Sanitization (IDS)
IDS03-J. Do not log unsanitized user input Given the non-compliant code below:
 ******************************************************************************/

i f ( l o g i n S u c c e s s f u l ) {
l o g g e r . s e v e r e (” User l o g i n s u c c e e d e d f o r : ” + username ) ;
} e l s e {
l o g g e r . s e v e r e (” User l o g i n f a i l e d f o r : ” + username ) ;
}



