def square(number):
    if number not in range(1, 65):
        raise ValueError("square must be between 1 and 64")

    return 1 << number - 1


def total():
    return (1 << 64) - 1
