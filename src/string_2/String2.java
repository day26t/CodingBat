package string_2;

public class String2 {
    public static void main(String[] args) {

    }
    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int w = word.length();

        for (int i = 0; i <= str.length() - w; i++) {
            if (str.substring(i, i + w).equals(word)) {

                // символ перед словом
                if (i > 0) {
                    sb.append(str.charAt(i - 1));
                }

                // символ после слова
                if (i + w < str.length()) {
                    sb.append(str.charAt(i + w));
                }
            }
        }

        return sb.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length();) {
            if (str.startsWith(word, i)) {
                sb.append(word);
                i += word.length();
            } else {
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }

    public String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'){
                continue;
            }
            if(i>0 && str.charAt(i-1) == '*'){
                continue;
            }
            if(i < str.length()-1 && str.charAt(i+1) == '*'){
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            // Проверяем шаблон: z?p
            if (i + 2 < str.length() &&
                    str.charAt(i) == 'z' &&
                    str.charAt(i + 2) == 'p') {

                sb.append("zp"); // убираем средний символ
                i += 2;          // прыгаем сразу за 'p'
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public String oneTwo(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length()-2; i+=3) {
            char a = str.charAt(i+2);
            char b = str.charAt(i+1);
            char c = str.charAt(i);
            str1.append(b).append(a).append(c);
        }
        return str1.toString();
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i) == '*'){
                if (str.charAt(i-1) != str.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public String getSandwich(String str) {
        String bread = "bread";
        int first = str.indexOf(bread);
        int last = str.lastIndexOf(bread);

        if (first == -1 || first == last) {
            return ""; // нет двух хлебов
        }

        return str.substring(first + 5, last);
    }

    public boolean xyzMiddle(String str) {
        if(str.length()<3){
            return false;
        }
        for (int i = 0; i <= str.length()-3; i++) {
            if(str.substring(i, i+3).equalsIgnoreCase("xyz")){
                int left = i;
                int right = str.length() - (i+3);
                if(Math.abs(left - right) <= 1){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean prefixAgain(String str, int n) {
        String str1 = str.substring(0,n);
        return str.substring(n).contains(str1);
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        if(count > 1) {
            for (int i = 0; i < count-1; i++) {
                sb.append(sep).append(word);
            }
        } if (count == 0){
            return "";
        }
        return sb.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(0,n-i));
        }
        return sb.toString();
    }

    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(str.length()-n));
        }
        return sb.toString();
    }

    public String mixString(String a, String b) {
        int max = a.length() + b.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            if(i < a.length()){
                sb.append(a.charAt(i));
            }
            if (i < b.length()){
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }

    public boolean xyBalance(String str) {
        boolean b = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                b =  false;
            } else if(str.charAt(i) == 'y'){
                b = true;
            }
        }
        return b;
    }

    public boolean bobThere(String str) {
        boolean b=false;
        char ch = 'b';
        if(str.length() >= 3) {
            //                    0123 = 4
            for (int i = 0; i < str.length()-2; i++) { //bob 012
                if (str.charAt(i) == ch && str.charAt(i + 2) == ch) {
                    b = true;
                }
            }
        } else if(str.length() < 3) {
            b = false;
        }
        return b;
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if(str.substring(i, i+2).equals("co")&& str.substring(i + 3, i+4).equals("e")){
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int count_cat = 0;
        int count_dog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                count_cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                count_dog++;
            }
        }

        return count_cat == count_dog;
    }

    public int countHi(String str) {

        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = s + str.charAt(i) + str.charAt(i);
        }
        return s;

    }
}
