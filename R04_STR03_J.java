/******************************************************************************
 2. Rule 02. Expressions (EXP)
 XP00-J. Do not ignore values returned by methods. 
 Correct the code as shown in theCompliant Solution below:
 ******************************************************************************/


BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
