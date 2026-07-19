class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");    

        Stack<String> stack = new Stack<>();

        StringBuilder answer = new StringBuilder("");

        for(String element : parts){
            if(element.equals(".") || element.equals("")){
                continue;
            }
            else if(element.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();   
                }
            }
            else{
                stack.push(element);
            }
        }

        for(String folder : stack){
            answer.append("/");
            answer.append(folder);                 
        }

        if(answer.toString().equals("")){
            return "/";
        }
        return answer.toString();
    }
}