def reverseArray(arr):
    # Returns inputted array reversed
    ret = []
    i = len(arr) - 1
    while i >= 0:
        ret.append(arr[i])
        i = i - 1
    return ret


def reverseArrayInPlace(arr):
    if len(arr) == 0 or len(arr) == 1:
        return arr
    else:
        left = 0
        right = len(arr) - 1
        while left <=  right:
            tmp = arr[left]
            arr[left] = arr[right]
            arr[right] = tmp
            right -= 1
            left += 1
        return arr


# print(reverseArray([1]))
# print(reverseArray([1, 2, 3, 4, 5]))
# print(reverseArray([5, 4, 3, 2, 1]))
# print(reverseArray([]))

print(reverseArrayInPlace([1]))
print(reverseArrayInPlace([1, 2, 3, 4, 5]))
print(reverseArrayInPlace([5, 4, 3, 2, 1]))
print(reverseArrayInPlace([]))
