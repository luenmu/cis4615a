/******************************************************************************
 2. Rule 02. Expressions (EXP)
 XP00-J. Do not ignore values returned by methods. 
 Correct the code as shown in theCompliant Solution below:
 ******************************************************************************/
public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}