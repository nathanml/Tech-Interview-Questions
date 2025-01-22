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

print("Test List1: {}", t1)
print("Test List2: {}", t2)
print("Test List3: {}", t3)

print("Test Solution 1: ", largestProduct(t1))
print("Test Solution 2: ", largestProduct(t2))
print("Test Solution 3: ", largestProduct(t3))
