
a=0
flag=False
while a<=5:
    n = int(input("Enter the number: "))
    if(n>=0):
        if(n>1):
         for i in range(2,n):
          if(n%i)==0:
             flag=True
        if (flag == True):
          print("This is a Prime number")
        else:
         print("This is not a Prime number")
    else:
      print("You Entered Negative Number.Plz,Enter Positive number")
      exit()
