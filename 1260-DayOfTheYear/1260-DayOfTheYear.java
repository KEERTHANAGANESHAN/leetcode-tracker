// Last updated: 7/9/2026, 9:12:00 AM
class Solution {
    public int dayOfYear(String date) {
      
    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    String[] parts = date.split("-");
    int year = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int day = Integer.parseInt(parts[2]);

    // Leap year check
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        days[1] = 29;
    }

    int result = 0;
    for (int i = 0; i < month - 1; i++) {
        result += days[i];
    }
    return result + day;
}
}