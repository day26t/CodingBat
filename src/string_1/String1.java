package string_1;

public class String1 {
    public static void main(String[] args) {

    }
    public String withoutX2(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result;
    }

    public String withoutX(String str) {
        String s = "";
        if (str.length() == 1){
            return s;
        }
        if (str.startsWith("x") && str.endsWith("x")){
            s = str.substring(1, str.length()-1);
        } else if (str.startsWith("x")){
            s = str.substring(1);
        } else if (str.endsWith("x")){
            s = str.substring(0,str.length()-1);
        } else {
            s = str;
        }
        return s;
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()){
            return "";
        }
        String start = str.substring(1,word.length());
        if (start.equals(word.substring(1))){
            return str.substring(0,word.length());
        }
        return "";
    }

    public String deFront(String str) {
        String str1 = "";
        if (str.length() < 2){
            str1 = str;
        }
        if (str.charAt(0) == 'a'){
            str1 += 'a';
        }
        if (str.charAt(1) == 'b'){
            str1 += 'b';
        }
        if (str.length() > 2){
            str1 += str.substring(2);
        }
        return str1;
    }

    public String without2(String str) {
        String s = "";
        String s1 = "";
        if (str.length() > 2){
            s = str.substring(0,2);
            if (str.endsWith(s)){
                s1 = str.substring(2);
            } else {
                s1 = str;
            }
        } else if (str.length() == 1){
            return str;
        }
        return s1;
    }

    public String extraFront(String str) {
        if (str.length() >= 2){
            String str1 = str.substring(0,2);
            return str1 +str1 +str1;
        } else if (str.length()==1){
            return str + str + str;
        } else {
            return "";
        }
    }

    public String minCat(String a, String b) {
        int a1 = a.length();
        int b1 = b.length();
        String result = "";
        if (a1 > b1){
            result = a.substring(a1 - b1) + b;
        } else {
            result = a + b.substring(b1-a1);
        }
        return result;

    }

    public boolean frontAgain(String str) {
        boolean ed = false;
        if (str.length()== 1 || str.isEmpty()){
            ed = false;
        }
        else if (str.endsWith(str.substring(0,2))){
            ed = true;
        } else {
            ed = false;
        }
        return ed;
    }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")){
            return "blue";
        } else{
            return "";
        }
    }

    public String lastTwo(String str) {
        String s = "";
        if(str.length() <= 1){
            return str;
        }
        char last = str.charAt(str.length()-1);
        char bfLast = str.charAt(str.length()-2);

        if (str.length() > 1){
            s = str.substring(0,str.length()-2) + last + bfLast;
        }
        return s;
    }

    public String conCat(String a, String b) {
        String newS = "";
        if(b.length() > 0 && a.endsWith(b.substring(0,1))){
            newS = a + b.substring(1, b.length());
        }  else {
            newS = a + b;
        }
        return newS;

    }

    public String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length()== 0){
            b="@";
        }
        String result = a.substring(0,1) + b.substring(b.length()-1);
        return result;
    }

    public String atFirst(String str) {
        String newS = "";
        if (str.length() == 1){
            newS = str.substring(0,1) + "@";
        } else if (str.length() >= 2) {
            newS = str.substring(0,2);
        } else if (str == ""){
            newS = "@" + "@";
        }
        return newS;

    }

    public boolean hasBad(String str) {
        if (str.length()< 3 ){
            return false;
        }
        if (str.length() >= 3 && str.substring(0,3).equals("bad")){
            return true;
        }

        if (str.length() >= 4 && str.substring(1,4).equals("bad")){
            return true;
        } else{
            return false;
        }
    }

    public String middleThree(String str) {
        int middle = str.length()/2;
        return str.substring(middle - 1, middle + 2
        );
    }

    public String twoChar(String str, int index) {
        String st = "";
        if(index < 0 || index >= str.length()-1){
            st = str.substring(0,2);
        } else {
            st = str.substring(index, index+2);
        }
        return st;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public boolean endsLy(String str) {
        boolean ly = true;
        if (str.endsWith("ly")){
            return ly ;
        } else {
            return !ly;
        }
    }

    public String middleTwo(String str) {
        int first = (str.length()/2) ;
        return str.substring(first - 1, first + 1);
    }

    public String withouEnd2(String str) {
        if (str.length() > 2){
            int middle = str.length() - 1;
            return str.substring(1,middle);
        } else {
            return "";
        }
    }

    public String theEnd(String str, boolean front) {
        if (front == true){
            String str1 = str.substring(0,1);
            return str1;
        }else {
            String str1 = str.substring(str.length()-1);
            return str1;
        }
    }

    public String right2(String str) {
        String end = str.substring(str.length()-2);
        String start = str.substring(0,str.length()-2);
        return end + start;
    }

    public String left2(String str) {
        if (str.length()>2){
            String firstletter = str.substring(0,2);
            String other = str.substring(2);
            return other + firstletter;
        } else{
            return str;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        } else if (a.length() < b.length()){
            return a + b + a;
        } else {
            return a+b;
        }
    }

    public String withoutEnd(String str) {
        int middle = (str.length() - 1);
        return str.substring(1,middle);
    }

    public String firstHalf(String str) {
        int half = str.length()/2;
        return str.substring(0,half);
    }

    public String firstTwo(String str) {
        if (str.length()> 2){
            return str.substring(0,2);
        } else {
            return str.substring(0);
        }
    }

    public String extraEnd(String str) {
        String lasttwo = str.substring(str.length() - 2);
        return lasttwo + lasttwo + lasttwo;
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String helloName(String name) {
        return "Hello " + name +"!";
    }

}
