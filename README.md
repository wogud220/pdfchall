# pdfchall
1A. I used dynamic programming to store boolean value for every number that are less than equal to the target number. 
DP relation:
	dp[i] = i can be formed from adding the buckets
	dp[0] = True, not adding any number
	dp[i] = dp[i-j] for j in numbers in the input list
  
  
1B. For this problem, I decided to use mnemonics of visualization and connection. Image Mnemonic is constructed in the form of a picture which promotes recall of information easier and faster. Connection mnemonic is connecting the information needed to remember to something already known. When the GUI file runs, there is a place for users to input the number that they need to store. After the user inputs a number, the system divides the string by substrings, and ask related question with the substrings. Then the user will have to answer the question and each answer will be recorded and saved. This method practices visualization and connection because as the user thinks about the answer to the question, the user must think about his or her personal life and try to relate the number to their life, and will be able to make connections and make visualization at the concurrent time.




