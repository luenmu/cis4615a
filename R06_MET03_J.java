/******************************************************************************
5. Rule 06. Methods (MET)
MET03-J. Methods that perform a security check must be declared private or final
Given the non-compliant code below:
 ******************************************************************************/

public void readSensitiveFile() {
  try {
    SecurityManager sm = System.getSecurityManager();
    if (sm != null) {  // Check for permission to read file
      sm.checkRead("/temp/tempFile");
    }
    // Access the file
  } catch (SecurityException se) {
    // Log exception
  }
}
