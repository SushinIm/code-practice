num = int(input())
flag = 0
while num > 0:
  num -= flag
  flag += 1
num = flag + num - 1
if flag % 2 == 0:
  print(str(flag - num) + '/' + str(num))
else:
  print(str(num) + '/' + str(flag - num))