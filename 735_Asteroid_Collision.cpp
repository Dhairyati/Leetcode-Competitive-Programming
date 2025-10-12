/*
735. Asteroid Collision
*/

class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> stack;
        for (int x : asteroids){
            if (x > 0){
                stack.push_back(x);
            } else {
                while (stack.size() && stack.back()>0 && stack.back()<-x){
                    stack.pop_back();
                }
                if (stack.size() && stack.back()==-x){
                    stack.pop_back();
                } else if (stack.empty() || stack.back()<0){
                    stack.push_back(x);
                }
            }
        }
        return stack;
    }
};
