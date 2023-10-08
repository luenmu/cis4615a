/******************************************************************************
4. Rule 04. Characters and Strings (STR)
STR04-J. Use compatible character encodings when communicating string data between JVMs.
Given the non-compliant code below:
 ******************************************************************************/


FileInputStream fis = null;
try {
  fis = new FileInputStream("SomeFile");
  DataInputStream dis = new DataInputStream(fis);
  byte[] data = new byte[1024];
  dis.readFully(data);
  String result = new String(data, "UTF-16LE");
} catch (IOException x) {
  // Handle error
} finally {
  if (fis != null) {
    try {
      fis.close();
    } catch (IOException x) {
      // Forward to handler
    }
  }
}
