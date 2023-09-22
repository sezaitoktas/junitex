package Day3;

public class StringModify {
    //kelimenin ilk ik harfi cierisnde A arsa silinsin(kelime icindeki hafrflerin hepsi vuyuk olacak
    //AABC-->BC, ABC-->BC, A -->""
    public String deleteIfIsInFirstPosition(String str){
        if (str.length()<=2){
            return str.replace("A","");
        }
        String firstTwoChars= str.substring(0,2);
        String afterFirstTwoChars=str.substring(2);
        return firstTwoChars.replaceAll("A","")+afterFirstTwoChars;
    }
}
