/******************************************************************************
 1. Rule 00. Input Validation and Data Sanitization (IDS)
IDS04-J. Safely extract files from ZipInputStream
Given the non-compliant code below:
 ******************************************************************************/

public final void unzip(String filename) throws java.io.IOException{
  FileInputStream fis = new FileInputStream(filename);
  ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
  ZipEntry entry;
  try {
    while ((entry = zis.getNextEntry()) != null) {
      System.out.println("Extracting: " + entry);
      int count;
      byte data[] = new byte[BUFFER];
      // Write the files to the disk
      FileOutputStream fos = new FileOutputStream(entry.getName());
      BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER);
      while ((count = zis.read(data, 0, BUFFER)) != -1) {
        dest.write(data, 0, count);
      }
      dest.flush();
      dest.close();
      zis.closeEntry();
    }
  } finally {
    zis.close();
  }
}
