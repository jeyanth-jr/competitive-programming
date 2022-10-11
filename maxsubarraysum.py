#creating all sub arrays of an array.
n=int(input()) #enter total no of elements in the list
s=str(input().split(' ')) # enter elements of list seperated by space
l=[] #empty list which later adds upto original list
for i in s:
    if i.isalnum():
        l.append(int(i))

# Using BruteForce technique , we generate all possible subarrays         
k=0
sll=[]
while k<=n:
    for i in range(n+1):
        sl=l[k:i]
        if sl!=[]:
            print(sl)
            sll.append(sl)
    k+=1
print(sll) #list that contains all sub-lists
suml=[]
for i in sll:
    suml.append(sum(i)) #calculating sum of all sublists and adding the sums to another list
print(suml) #the list containing all sublist of the list
print(max(suml))  #max sum of one single subarray  