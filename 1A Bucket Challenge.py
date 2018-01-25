def possible(input,target):   
	"""
	dp definition:
		dp[i] means whether number i can be formed from adding the buckets (takes boolean value).
		dp[0] = True, base case 0 is always True since we just do not need to add any numbers.
		dp[i] = dp[i-j] for j in numbers in the input list. If dp[i-j] is True, then we can simply add j to from
		dp[i].
	"""
  #First sort the given input 
  sort = sorted(input)
  #Filter out all the numbers greater than target because unnecessary
  sort = filter(lambda x: x<= target, sort)
  #Create a cacheing list for boolean values
  dp = [False for i in range(target+1)]
  #Base case of when target == 0
  dp[0] = True
  #Base case of where given input already contains target
  for i in sort:
      dp[i] = True
  #iterate from 0 to target number
  for i in range(target+1):
    if not p[i]:
      #Check if given number can be formed from previous combinations + one of the number from sorted list
        for j in sort:
          #Since the list is sorted, we can break from inner for-loop when j > i and skip to next outer for-loop.
            if j > i:
                break
              #If i-j can be formed i can be formed by adding j 
            if dp[i-j] == True:
                dp[i] = True
                break
  return dp[-1]  
  






