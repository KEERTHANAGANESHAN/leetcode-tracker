// Last updated: 7/10/2026, 2:18:02 PM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> stack = new Stack<>();
4        String[] parts = path.split("/");
5        for (String part : parts) {
6            if (part.equals("") || part.equals(".")) {
7                continue;
8            }
9            if (part.equals("..")) {
10                if (!stack.isEmpty()) {
11                    stack.pop();
12                }
13            } else {
14                stack.push(part);
15            }
16        }
17        if (stack.isEmpty()) {
18            return "/";
19        }
20        StringBuilder ans = new StringBuilder();
21        for (String dir : stack) {
22            ans.append("/").append(dir);
23        }
24        return ans.toString();
25    }
26}