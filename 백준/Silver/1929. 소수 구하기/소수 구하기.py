m, n = map(int, input().split())
for item in range(m, n+1):
  flag = True
  num = int(item**0.5) + 1
  if item == 1 : continue
  for i in range(2, num):
    if item % i == 0:
      flag = False
      break
  if flag:
    print(item)