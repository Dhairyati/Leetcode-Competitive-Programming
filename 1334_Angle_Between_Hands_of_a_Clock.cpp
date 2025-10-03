/*
Date solved: 27-06-2025
Problem: 1344. Angle Between Hands of a Clock
Solution Language: C++
Time Complexity: O(1)
Space Complexity: O(1)
*/



class Solution {
public:
    double angleClock(int hour, int minutes) {

//Took float values for accurate calculation
        float hr=hour;
        float mm=minutes;
        if(hr>=12){
           hr=hr-12;
        }

//degree of hour from 12
//1hour=30 degree
//30 degree for minutes= 0.5degree

        hr=hr*30;
        hr=hr+(mm*0.5);

//degree of minute from 12
//1 minute= 6 degree

        mm= mm*6;
        float diff=abs(hr-mm);
        float ans=0;
        if(diff>180){
            ans =360-diff;   
        }
        else{
            ans=diff;
        }
        return ans;
    }
};
