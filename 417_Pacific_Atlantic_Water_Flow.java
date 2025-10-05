/*
Problem: 417. Pacific Atlantic Water Flow
TC: O(m*n)
SC: O(m*n)

Concept:
Implemented DFS

*/

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;

        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];

        // Directions: up, down, left, right
        int[][] directions={{1,0}, {-1,0}, {0,1}, {0,-1}};

        // DFS from Pacific (top row + left column)
        for (int i=0;i<m;i++){
            dfs(heights, pacific, i, 0, directions);       // left border
            dfs(heights, atlantic, i, n - 1, directions);  // right border
        }
        for (int j=0;j<n;j++){
            dfs(heights, pacific, 0, j, directions);       // top border
            dfs(heights, atlantic, m-1, j, directions);  // bottom border
        }

        // Collect cells reachable by both oceans
        List<List<Integer>> result=new ArrayList<>();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
    private void dfs(int[][] heights, boolean[][] visited, int r, int c, int[][] dirs){
        int m = heights.length;
        int n = heights[0].length;
        visited[r][c] = true;

        for (int[] d : dirs){
            int nr= r+d[0];
            int nc= c+d[1];
            if (nr<0 || nc<0 || nr>=m || nc>=n) continue;
            if (visited[nr][nc]) continue;
            if (heights[nr][nc] < heights[r][c]) continue;  // can only move uphill or same level
            dfs(heights, visited, nr, nc, dirs);
        }
    }
}
