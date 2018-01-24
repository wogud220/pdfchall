# pdfchall
1A. I used dynamic programming to store boolean value for every number that are less than equal to the target number. 
DP relation:
	dp[i] = i can be formed from adding the buckets
	dp[0] = True, not adding any number
	dp[i] = dp[i-j] for j in numbers in the input list
  
  
1B. I used a very simple method of changing integers to alphabets. I matched up each digits from 0 - 9 to a - j, and translated the digits to alphabet. This simple approach was very easy to read and will bring out unique alphabet patterns. 
I have attached the screenshots from the java GUI. 
