"""
Computes largest product of list A that excludes 1 number.
This implementation depends on the following lemma:
The optimal solution will ignore:
    The smallest positive number if there are an even number of negatives
    The largest negative number if there are an odd number of negatives

"""


def largestProduct(A: list):
    num_negatives = countNegatives(A)
    product = 1
    m = None
    # If even number of negatives
    if num_negatives % 2 == 0:
        # If list consists of only negatives, remove min element
        if num_negatives == len(A):
            m = min(A)
            for i in range(len(A)):
                if A[i] != m:
                    product *= m
        else:
            m = A[0]
            for i in range(len(A)):
                # If 0, remove that element
                if A[i] == 0:
                    m = A[i]
                if m is None and A[i] > 0:
                    m = A[i]
                # If smallest positive, update product and minimum m
                elif 0 < A[i] < m:
                    product *= m
                    m = A[i]
                # Else update product
                else:
                    product *= A[i]
    # If odd nuber of negatives
    else:
        for i in range(len(A)):
            if A[i] == 0:
                m = A[i]
            elif m is None and A[i] < 0:
                m = A[i]
            elif m is not None and m < A[i] < 0:
                product *= m
                m = A[i]
            else:
                product *= A[i]
    return product


def countNegatives(A: list):
    count = 0
    for i in range(len(A)):
        if A[i] < 0:
            count += 1
    return count


t1 = [1, 5, -10, 2, -4, 9]
t2 = [5, -1, -4, -8, -2, -4, 10, 2, 6, 9]
t3 = [5, -1, 2, 9, -2, 1, 10, 2, 6, 9]
t4 = [-12, -3, -4, -10]
t5 = [3, 10, 13, 2]

print("Test List1: {}", t1)
print("Test List2: {}", t2)
print("Test List3: {}", t3)
print("Test List4: {}", t4)
print("Test List5: {}", t5)

print("Test Solution 1: ", largestProduct(t1))
print("Test Solution 2: ", largestProduct(t2))
print("Test Solution 3: ", largestProduct(t3))
print("Test Solution 4: ", largestProduct(t4))
print("Test Solution 5: ", largestProduct(t5))
