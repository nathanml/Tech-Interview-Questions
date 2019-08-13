# Finds maximum and minimum element in unsorted array
import math

def maxElement(arr):
    Max = float("-inf")
    for i in range(len(arr)):
        if arr[i] > Max:
            Max = arr[i]
    return Max

def minElement(arr):
    Min = float("inf")
    for i in range(len(arr)):
        if arr[i] < Min:
            Min = arr[i]
    return Min

##a1 = [1,2,3,4,5]
##print("Expected 5, Actual: ", maxElement(a1))
##print("Expected 1, Actual: ", minElement(a1))
##a2 = [5,4,3,2,1]
##print("Expected 5, Actual: ", maxElement(a2))
##print("Expected 1, Actual: ", minElement(a2))
##a3 = [3,1,2,5,4]
##print("Expected 5, Actual: ", maxElement(a3))
##print("Expected 1, Actual: ", minElement(a3))
##a4 = [1,-1,2,-4]
##print("Expected 2, Actual: ", maxElement(a4))
##print("Expected -4, Actual: ", minElement(a4))
