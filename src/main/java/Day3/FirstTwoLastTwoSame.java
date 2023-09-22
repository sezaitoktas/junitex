package Day3;

public class FirstTwoLastTwoSame {
    //Task ilk iki ve son iki karakteri ayni mi
    public boolean check_If_First_Two_Last_Two_Same(String str){
        if (str.length()<=1) return false;
        if (str.length()<=2) return true;
        String firstTwoChars= str.substring(0,2);
        String lastTwoChars= str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);


    }


}
