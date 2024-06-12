package strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofPhoneNumber17 {
    public static void main(String[] args) {
        System.out.println(new LetterCombinationsofPhoneNumber17().letterCombinations("23"));
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.equals(""))
            return res;
        for(char c:digits.toCharArray()){
            if(c=='2')
                res=addToRes("abc", res);
            if(c=='3')
                res=addToRes("def", res);
            if(c=='4')
                res=addToRes("ghi", res);
            if(c=='5')
                res=addToRes("jkl", res);
            if(c=='6')
                res=addToRes("mno", res);
            if(c=='7')
                res=addToRes("pqrs", res);
            if(c=='8')
                res=addToRes("tuv", res);
            if(c=='9')
                res=addToRes("wxyz", res);
        }
        return res;
    }

    private List<String> addToRes(String str, List<String> res) {
        List<String> resNew = new ArrayList<>();
        if(res.isEmpty()){
            for(char c:str.toCharArray())
                resNew.add(String.valueOf(c));
        }else{
           int size = res.size();
           for(int i=0;i<size;++i){
                String cur = res.get(i);
                for(char c:str.toCharArray())
                    resNew.add(i,cur+String.valueOf(c));
            }
        }
        return resNew;
    }
}
