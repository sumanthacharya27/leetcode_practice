bool isPalindrome(int x) {
     int original = x;
    int reverse = 0;
    int digit;

    // negative numbers and numbers ending with 0 (except 0)
    if (x < 0)
        return false;

    if (x != 0 && x % 10 == 0)
        return false;

    while (x > reverse) {
        digit = x % 10;
        reverse = reverse * 10 + digit;
        x = x / 10;
    }

    if (x == reverse)
        return true;

    if (x == reverse / 10)
        return true;

    return false;
}
