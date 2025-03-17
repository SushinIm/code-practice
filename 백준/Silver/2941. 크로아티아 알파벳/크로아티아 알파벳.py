croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
string = input()
count = 0
for i in croatia:
  if string.find(i) > -1:
    string = string.replace(i, "f")
print(len(string))