/*
Date solved: 19-09-2025
Problem: 3484. Design Spreadsheet
Solution Language: C++
Time Complexity: 
Space Complexity: 
*/
class Spreadsheet {
private:
    unordered_map<string, int> cellValues;

public:
    Spreadsheet(int rows) {
        // No initialization needed for the hash map
    }

    // Set the value of a specific cell
    void setCell(string cell, int value) {
        cellValues[cell] = value;
    }
    void resetCell(string cell) {
        cellValues.erase(cell);
    }
    int getValue(string formula) {
        int result = 0;
      
        stringstream formulaStream(formula.substr(1));
        string token;
      
        // Parse the formula by splitting on '+' delimiter
        while (getline(formulaStream, token, '+')) {
            // Check if token is a numeric value
            if (isdigit(token[0])) {
                result += stoi(token);
            } else {
                result += cellValues.count(token) ? cellValues[token] : 0;
            }
        }
      
        return result;
    }
};

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet* obj = new Spreadsheet(rows);
 * obj->setCell(cell,value);
 * obj->resetCell(cell);
 * int param_3 = obj->getValue(formula);
 */
