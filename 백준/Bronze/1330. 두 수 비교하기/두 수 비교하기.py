nums = list(map(int, input().split()))
result = nums[0] - nums[1]
if(result > 0):
  print(">")
elif(result == 0):
  print("==")
else:
  print("<")