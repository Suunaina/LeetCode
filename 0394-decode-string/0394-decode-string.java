class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int currNum = 0;
        StringBuilder currString = new StringBuilder("");

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                currNum = currNum*10 + (ch - '0');//ch='0' is to convert char number to int number and this whole line is to read more that single digit numbers
            }

            else if(ch == '['){
                numStack.push(currNum);
                stringStack.push(currString);
                currNum = 0;
                currString = new StringBuilder("");;
            }

            else if(Character.isLetter(ch)){
                currString.append(ch);
            }

            else if(ch == ']'){

                int count = numStack.pop();
                StringBuilder prevString = stringStack.pop();
                StringBuilder repeatedString = new StringBuilder("");

                for(int i=0 ; i<count ; i++){
                    repeatedString.append(currString); 
                }

                prevString.append(repeatedString);
                currString = prevString;
            }
        }
        return currString.toString();       
    }
}