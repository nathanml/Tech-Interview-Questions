def reverseArray(arr):
    #Returns inputted array reversed
    ret = []
    i = len(arr)-1
    while i >= 0:
        ret.append(arr[i])
        i = i-1
    return ret

# print(reverseArray([1]))
# print(reverseArray([1,2,3,4,5]))
# print(reverseArray([5,4,3,2,1]))
# print(reverseArray([]))
