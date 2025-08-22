/*
Date solved: 23-08-2025
Problem: 3195. Find the Minimum Area to Cover All Ones I
Solution Language: C++
Time Complexity: O(m*n)
Space Complexity: O(1)
*/

class Solution {
public:
    int minimumArea(vector<vector<int>>& grid) {
        int m = grid.size(), n = grid[0].size();
        int minR = m, minC = n, maxR = -1, maxC = -1;

        for (int r = 0; r < m; ++r) {
            for (int c = 0; c < n; ++c) {
                if (grid[r][c] == 1) {
                    if (r < minR) minR = r;
                    if (c < minC) minC = c;
                    if (r > maxR) maxR = r;
                    if (c > maxC) maxC = c;
                }
            }
        }

        if (maxR == -1) return 0;  // no ones in the grid
        return (maxR - minR + 1) * (maxC - minC + 1);
    }
};
