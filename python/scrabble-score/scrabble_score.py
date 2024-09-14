def score(word):
    res = 0
    for i in word.lower():
        if i in 'aeioulnrst':
            res += 1
        elif i in 'dg':
            res += 2
        elif i in 'bcmp':
            res += 3
        elif i in 'fhvwy':
            res += 4
        elif i == 'k':
            res += 5
        elif i in 'jx':
            res += 8
        elif i in 'qz':
            res += 10
    return res