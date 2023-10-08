/******************************************************************************
 2. Rule 02. Expressions (EXP)
 XP00-J. Do not ignore values returned by methods. 
 Correct the code as shown in theCompliant Solution below:
 ******************************************************************************/


public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}
