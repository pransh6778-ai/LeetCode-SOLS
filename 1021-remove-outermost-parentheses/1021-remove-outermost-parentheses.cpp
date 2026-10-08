class Solution {
public:
    string removeOuterParentheses(string s) {
        string str="";
        int c1=0;
        for(int i=0; i<s.length(); i++){
            char c=s[i];
            if(c=='('){
                c1++;
                if(c1>1){
                    str+=c;
                }
            }else{
                c1--;
                if(c1>0){
                    str+=c;
                }
            }
        }
        return str;

    }
};