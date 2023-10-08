/******************************************************************************
 1. Rule 00. Input Validation and Data Sanitization (IDS)
IDS03-J. Do not log unsanitized user input.
Correct the code as shown in theCompliant Solution below:
 ******************************************************************************/

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
  logger.severe("User login failed for: " + sanitizeUser(username));
}


