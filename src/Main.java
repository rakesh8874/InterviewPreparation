import java.util.*;

public class Main {
    public static int findMaximumNumberOfOccurance(int [] numArr, int size){

        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i:numArr){
            Integer value = numMap.get(i);
            if(value==null){
                numMap.put(i, 1);
            }else{
                numMap.put(i, value+1);
            }
        }
       for(Map.Entry<Integer, Integer> entry:numMap.entrySet()){
           if(entry.getValue()>size/2){
             return entry.getKey();
           }
       }
       return -1;
    }

    public static void printMissingNumber(int [] numArr){
        Set<Integer> set  = new HashSet<>();
        for(int el:numArr){
            set.add(el);
        }

        int n = numArr.length+1;
        for(int i = 0; i<n; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static String[] sortNamesOfArray(String [] namesArr){
        String  temp = "";
        for(int i = 0; i<namesArr.length; i++){
            for(int j = i+1; j<namesArr.length; j++){
                if(namesArr[i].compareTo(namesArr[j])>1){
                    temp = namesArr[i];
                    namesArr[i] = namesArr[j];
                    namesArr[j] = temp;
                }
            }
        }
        return namesArr;
    }

    public static void findIntersection(int [] firstArr, int [] secondArr){
        Set<Integer> numSet = new HashSet<>();
        for(int el:firstArr){
            numSet.add(el);
        }
        for(int el:secondArr){
            if(numSet.contains(el)){
                System.out.println(el);
            }
        }
    }

    public static boolean checkPanegram(String str){
        if(str.length()<26){
            return false;
        }else{
            for(char i = 'a'; i<='z'; i++){
                if(str.indexOf(i)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static String longestSubstring(String str){

        String longestTillNow = "";
        String longestOverall = "";
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(charSet.contains(ch)){
                longestTillNow = "";
                charSet.clear();
            }else{
                charSet.add(ch);
                longestTillNow += ch;
            }
            if(longestTillNow.length()>longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }

    public static String compressString(String str){
        Map<Character, Integer> strMap = new HashMap<>();
         for(int i = 0; i<str.length(); i++){
             Character ch = str.charAt(i);
             if(strMap.get(ch) != null){
                 strMap.put(ch, strMap.get(ch)+1);
             }else{
                 strMap.put(str.charAt(i), 1);
             }
         }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: strMap.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public static int [] manipulateArray(int [] arr){
        int size = arr.length;
        int maxFromRight = arr[size-1];
        arr[size-1] = -1;
        for(int i = size-2; i>=0; i--){
            int temp = arr[i];
            if(maxFromRight>arr[i]){
                arr[i] = maxFromRight;
            }else{
                arr[i] = -1;
            }
            if(maxFromRight<temp){
                maxFromRight = temp;
            }
        }
        return arr;
    }

    public static void printPrimeNumberInRange(int num1, int num2){

        for(int i = num1; i<=num2; i++){
            int r = 0;
            if(i==0 || i==1){
                r = 1;
            }
            for(int j = 2; j<=i/2; j++){
               if(i%j == 0){
                   r = 1;
                   break;
               }
            }
            if(r==0){
                System.out.println(i);
            }
        }

    }

    public static int countWord(String str){
        int wordCount = 0;
        String [] strArr = str.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();
        for(int i = 0; i<strArr.length; i++){
            Integer val = wordMap.get(strArr[i]);
            if(val==null){
                wordMap.put(strArr[i], 1);
            }else{
                wordMap.put(strArr[i], val+1);
            }
        }
        for(Map.Entry<String, Integer> entry:wordMap.entrySet()){
            if(entry.getValue()>1){
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int countCharacter(String str){
        int charCount = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            Integer val = charMap.get(str.charAt(i));
            if(val==null){
                charMap.put(str.charAt(i), 1);
            }else{
                charMap.put(str.charAt(i), val+1);
            }
        }
        for(Map.Entry<Character, Integer> entry:charMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                charCount++;
            }
        }
        return charCount;
    }

    public static int countDigit(int [] arr){
        int digitCount = 0;
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            Integer val = numMap.get(arr[i]);
            if(val==null){
                numMap.put(arr[i], 1);
            }else{
                numMap.put(arr[i], val+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: numMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                digitCount++;
            }
        }

        return digitCount;
    }


    public static String compressStrings(String str){
        String result = "";

        Map<Character, Integer> strMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            Integer val = strMap.get(str.charAt(i));
            if(val==null){
                strMap.put(str.charAt(i), 1);
                }else{
                strMap.put(str.charAt(i), val+1);
            }
            }
          StringBuilder sb = new StringBuilder();
         for(Map.Entry<Character, Integer> entry: strMap.entrySet()){
             sb.append(entry.getKey());
             sb.append(entry.getValue());
         }
         return sb.toString();
    }

    public static String findLowestSubstring(String str){
        String longestOverall = "";
        String longestTillNow = "";
         Set<Character> charSet = new HashSet<>();
         for(int i = 0; i<str.length(); i++){
             if(charSet.contains(str.charAt(i))){
                 longestTillNow = "";
                 charSet.clear();
             }else{
                 charSet.add(str.charAt(i));
                 longestTillNow += str.charAt(i);
             }
             if(longestTillNow.length()>longestOverall.length()){
                 longestOverall = longestTillNow;
             }
         }
        return longestOverall;
    }

    public static void printAllSubstringFromAString(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
      public static boolean isRotatedString(String str, String rotatedString){
        if(str==null || rotatedString==null){
            return false;
        }else if(str.length() != rotatedString.length()){
            return false;
        }else{
            String concatenateString = str+str;
            return concatenateString.contains(rotatedString);
        }
      }

      public static int [] checkString(String str){

        int wordCount = 1, vowelsCount = 0, consonantCount = 0, uppercaseCount = 0, lowercaseCount = 0, charOccCount = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ','){
                wordCount++;
            }else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' ||
            str.charAt(i)== 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U'){
                vowelsCount++;
            }else{
                consonantCount++;
            }

            if(str.charAt(i) >= 65 && str.charAt(i)<=90){
                uppercaseCount++;
            }else if(str.charAt(i)>=97 && str.charAt(i)<=122){
                lowercaseCount++;
            }
            Integer val = charMap.get(str.charAt(i));
            if(val==null){
                charMap.put(str.charAt(i), 1);
            }else{
                charMap.put(str.charAt(i), val+1);
            }
        }
          for(Map.Entry<Character, Integer> entry:charMap.entrySet()){
              if(entry.getValue()>1){
                  charOccCount++;
              }
          }
          int [] arr = {wordCount, vowelsCount, consonantCount, charOccCount, uppercaseCount, lowercaseCount};
        return arr;
      }

      public static  void printFrequencyOfCharInDescendingOrder(String str){

        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            Integer val = charMap.get(str.charAt(i));
            if(val==null){
                charMap.put(str.charAt(i), 1);
            }else{
                charMap.put(str.charAt(i), val+1);
            }
        }

        Set<Map.Entry<Character, Integer>> mapSet = charMap.entrySet();
        List<Map.Entry<Character, Integer>> mapList = new ArrayList<>(mapSet);
        Collections.sort(mapList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        for(Map.Entry<Character, Integer> entry:mapList){
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

      }


      public static void reverseWordFromString(String str){
         Stack<Character> charStack = new Stack<>();
         for(int i = 0; i<str.length(); i++){
             if(str.charAt(i) != ' '){
                 charStack.push(str.charAt(i));
             }else{
                 while(!charStack.isEmpty()){
                     System.out.println(charStack.pop());
                 }
             }
         }
          System.out.println("  ");
         while (!charStack.isEmpty()){
             System.out.println(charStack.pop());
         }
      }

      public static String reverseStringEachWord(String str){
        String reverseString = "";
        String [] strArr = str.split(" ");
        for(String st:strArr){
            String reverseWord = "";
            for(int i = st.length()-1; i>=0; i--){
                reverseWord = reverseWord+st.charAt(i);
            }
            reverseString = reverseString+reverseWord+" ";
        }
        return reverseString;
      }

      public static int birthdayCount(List<Integer> s, int d, int m) {
          int count = 0;
          for (int i = 0; i < s.size()-1; i++) {
              int sum = 0;
              for (int j = i; j < m+i; j++) {
                  sum = sum+s.get(j);
              }
              if(sum==d){
                  count++;
              }
          }
          return count;
      }

      //Question -1
      public static int printPower(double a, double b){
        int val = (int)Math.pow(a, b);
        return val;
      }

      //Questions-2
      public static double calculateEnergy(double m, double finalTemprature, double initialTemprature){
       double q = m*(finalTemprature-initialTemprature)*4184;
       return q;
      }

      //Question-3
      public static void generateRandomNumber(){
          int min = 0, max = 12;
          int b = (int)(Math.random()*(max-min+1)+min);
           switch(b){
               case 1:
                   System.out.println("January");
                   break;
               case 2:
                   System.out.println("February");
                   break;
               case 3:
                   System.out.println("March");
                   break;
               case 4:
                   System.out.println("April");
                   break;
               case 5:
                   System.out.println("May");
                   break;
               case 6:
                   System.out.println("June");
                   break;
               case 7:
                   System.out.println("July");
                   break;
               case 8:
                   System.out.println("August");
                   break;
               case 9:
                   System.out.println("September");
                   break;
               case 10:
                   System.out.println("October");
                   break;
               case 11:
                   System.out.println("November");
                   break;
               case 12:
                   System.out.println("December");
                   break;
           }
      }

      //Q-5
    public static String playGame(int inputNum){
        int min = 0, max = 2;
        int a = (int)(Math.random()*(max-min+1)+min);
         if(a==inputNum){
             return "Match Drawn";
         }else if(a == 0 && inputNum == 2){
             return "Computer Won";
         }else if(a==0 && inputNum == 1){
             return "You Won";
         }
       return "";
    }

    //Q6



    public static String checkNumber(int num) {

        if (num % 5 == 0 && num % 6 == 0) {
            return "divisible By Both 5 and 6";
        } else if (num % 5 == 0 || num % 6 == 0) {
            return "divisible By 5 or 6";
        }else if(num % 5 == 0 ^ num % 6 == 0){
            return "divisible But Not by Both";
        }
        return "Not divisible By Both";
    }

    //Q-8
    public static boolean isWeightedEvenSum(int num){
        int sum = 0;
        int r = 0;
        while(num>0){
            r = num%10;
            sum = sum+r;
            num = num/10;
        }
        return isEvenSum(sum);
    }

    public static boolean isEvenSum(int sum){
        if(sum%2==0)
            return true;
        else
            return false;
    }

    //Q-1
    public static void checkLength(String str){
        System.out.println("Length of String is "+str.length());
        System.out.println("First Character Of String "+str.charAt(0));
    }

    //Q-2

    public static boolean checkSubString(String str1, String str2){
        if(str1.contains(str2))
            return true;
        else
            return false;
    }

    //Q-3
    public static void printString(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+",");
        }
    }

    //Q-4

    public static String checkUniqueName(String str){
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return "Not A Unique Name";
            }
        }
        return "Unique Name";
    }

    //Q-5
    public static int checkWeightOfString(String str){
        int sum = 0;
        for(int i = 0; i<str.length(); i++){
            int ch = str.charAt(i);
            int index = str.indexOf(str.charAt(i));
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
               sum = sum+(ch*index);
            }
        }
        return sum;
    }


    //Q-6

    public static String checkBiggerString(String str1, String str2){
        if(str1.compareToIgnoreCase(str2)>0){
            return str1+" is Bigger";
        }else if(str1.compareToIgnoreCase(str2)<0){
            return str2+" is Bigger";
        }else{
            return str1+" and "+str2+" both are equal";
        }
    }

    //Q-7
    public static String printProperName(String str1, String str2, String str3){
        String firstName = str1.substring(0, 1).toUpperCase().concat(str1.substring(1).toLowerCase()).concat(" ");
        String lastName = str3.substring(0,1).toUpperCase().concat(str3.substring(1).toLowerCase());

        if(!str2.isEmpty()) {
            return  firstName.concat(str2.substring(0, 1).toUpperCase().concat(str2.substring(1).toLowerCase())).concat(" ").concat(lastName);
        }else{
            return firstName.concat(lastName);
        }
    }

    public static int migratoryBirds(List<Integer> arr){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.size(); i++){
            Integer val = map.get(arr.get(i));
            if(val==null){
                map.put(arr.get(i), 1);
            }else{
                map.put(arr.get(i), val+1);
            }
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i)<list.get(i+1) && map.get(list.get(i))>map.get(list.get(i+1))){
                res = map.get(list.get(i));
            }
            System.out.println(list.get(i)+" "+map.get(list.get(i)));
        }
        return res;
    }

    public static boolean checkString(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            for(int i = 0; i<str1.length(); i++){
               for(int j = 0; j<str2.length(); j++){
                   if(str1.charAt(i) == str2.charAt(j))
                       return true;
               }
            }
        }
        return false;
    }

     class A{
        public int a;
        public A(int a){
            this.a = 10;
        }

        public A(){

        }
    }

    class B extends A{
        public int a;
        public B(int a){
            this.a = 5;
        }

        public B(){

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.next();
        System.out.println("Enter Second String");
        String str2 = sc.next();
        System.out.println(checkString(str1, str2));



    }
}