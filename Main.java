/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
public class Main
{
    static List<String> subStrings(String str){
        List<String> subStringsAL = new ArrayList<>();
        
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                subStringsAL.add(str.substring(i,j));
            }
        }
        return subStringsAL;
    }
    static List<String> subSeqsAL = new ArrayList<>();
    static void subSeqs(String str, String strSoFar){
        if(str.length() == 0){
            subSeqsAL.add(strSoFar);
            return;
        }
        subSeqs(str.substring(1), strSoFar);
        subSeqs(str.substring(1), strSoFar+str.charAt(0));
    }
    
    static void printAL(List<String> al)
    {
        for(String n : al){
            System.out.println(n);
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("subStrings: ");
		printAL(subStrings("abc"));
		subSeqs("abc", "");
		System.out.println("subSeqs: ");
		printAL(subSeqsAL);
	}
}
